
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PatrickJoshua
 */
public class Common {
    
    public static int ref;
    
    public static int generateReferenceNo()
    {
        Random random = new Random();
        return random.nextInt(999999999);       //9 digit random number
    }
    
    public static Connection connectToDatabase(String host, String user, String pw)
    {
        Connection con = null;
        try
        {
            con = DriverManager.getConnection(host, user, pw);
        }
        catch (SQLException sqle)
        {
            System.err.println(sqle.getMessage());
        }
        return con;
    }
    
    public static void add2History(Connection con, int num, String cellNo, boolean vip, int ref, String name, String trans, Boolean sms)
    {
        try
        {
            PreparedStatement ps = con.prepareStatement("insert into RECORDSHISTORY values (" + num + ",'" + cellNo + "'," + vip + "," + ref + ",'" + name + "',?,?,'" + trans + "'," + sms + ")");
            
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());  //get current date
            ps.setDate(1, sqlDate);     //set date on SQL statement
            
            java.sql.Time sqlTime = new java.sql.Time(new java.util.Date().getTime());  //get current time
            ps.setTime(2, sqlTime);     //set time on SQL statement
            
            ps.executeUpdate();     //execute SQL statement
            ps.close();
        }
        catch (SQLException sqle)
        {
            System.err.println(sqle.getMessage());
        }
    }
    
    public static int getLastNumber(Connection con, boolean vip)
    {
        int lastNumber = 0;
        try
        {
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            PreparedStatement ps = con.prepareStatement("select NUM from RECORDSHISTORY where DATE=? AND VIP=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setDate(1, sqlDate);
            ps.setBoolean(2, vip);
            ResultSet rs = ps.executeQuery();
            if(rs.last())
                lastNumber = rs.getInt("NUM");
            ps.close();
        }
        catch (SQLException sqle)
        {
            System.err.println(sqle.getMessage());
        }
        return lastNumber;
    }
    
    public static int add2DB(Connection con, String cellNo, String name, boolean vip, String trans, boolean sms)
    {
        int lastNumber = 0;     //holds the last number in the DB
            
        try
        {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM QUEUETBL WHERE VIP=" + vip + " AND DATE=?");
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            ps.setDate(1, sqlDate);
            ResultSet rs = ps.executeQuery();
            
            boolean duplicate = false;
            //detect duplicate
            while(rs.next())    //loop until reached the last VIP
            {
                if(vip)
                {
                    if(cellNo.equals(rs.getString("MOBILENUM")) || name.equalsIgnoreCase(rs.getString("NAME")))      //true if duplicate
                        duplicate = true;
                }
                else
                {
                    if(cellNo.equals(rs.getString("MOBILENUM")))      //true if duplicate
                        duplicate = true;
                }
                
                if(duplicate)
                {
                    lastNumber = rs.getInt("NUM");     //set last number from db
                    lastNumber--;       //temporarily decrement (will be incremented before return)
                    ref = rs.getInt("REF");
                    duplicate = true;
                    break;
                }
            }
            
            if(!duplicate)      //continue if no duplicate detected
            {
                ref = Common.generateReferenceNo();         //generate reference number
                lastNumber = getLastNumber(con,vip);        //get last number from records history within the day
                
                /*Delete record from previous day*/
                PreparedStatement psd = con.prepareStatement("select MOBILENUM from QUEUETBL where MOBILENUM='" + cellNo + "'");
                ResultSet rsd = psd.executeQuery();
                if(rsd.next()) { 
                    PreparedStatement delete = con.prepareStatement("delete from QUEUETBL where MOBILENUM='" + cellNo + "'");
                    System.err.println(delete.executeUpdate() + " old record on queue has been automatically deleted. Please use the Cleanup Queue function to delete old records that might interfere with current operations.");
                    delete.close();
                }
                rsd.close();
                psd.close();
                /*end of record delete*/
                
                lastNumber++;   //temporarily increment to actual position
                PreparedStatement insert = con.prepareStatement("insert into QUEUETBL values (" + lastNumber + ",'" + cellNo + "'," + vip + "," + ref + ",'" + name + "',?,'" + trans + "',NULL," + sms + ")");
                insert.setDate(1, sqlDate);
                insert.executeUpdate();
                add2History(con,lastNumber,cellNo,vip,ref,name,trans,sms);    //add to reccordshistory table
                lastNumber--;   //revert to lastNumber after writing to database
                insert.close();
            }
            //close necessary objects
            rs.close();     
            ps.close();
            con.close();
        }
        catch (SQLException sqle)
        {
            System.err.println("Exception while adding to queue - " + sqle.getMessage() + sqle.getSQLState());
        }
        lastNumber++;
        return lastNumber;  //return number
    }
    
    public static String getNowServing(Connection con)
    {
        String nowserving = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select NUM,VIP,COUNTER from QUEUETBL where COUNTER IS NOT NULL");
            if(rs.next())
            {
                if(rs.getBoolean("VIP"))
                    nowserving = "V" + rs.getInt("NUM");
                else
                    nowserving = "N" + rs.getInt("NUM");
            }
            else
            {
                int currentTime = Integer.parseInt(new SimpleDateFormat("HH").format(Calendar.getInstance().getTime()));
                if(currentTime > 9 && currentTime < 21)     //9AM to 9PM
                    nowserving = "None";
                else
                    nowserving = "Store is closed";
            }
            rs.close();
            stmt.close();
        } catch (SQLException sqle) {
            System.err.println("Exception at getLastNumber - " + sqle.getMessage());
        }
        return nowserving;
    }
    
    public static String getNowServingCounters(Connection con) {
        String nowserving = "";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select NUM,VIP,COUNTER from QUEUETBL where COUNTER IS NOT NULL");
            if(rs.next()) {
                do {
                    if(rs.getBoolean("VIP"))
                        nowserving = nowserving + "<h1>Counter " + rs.getInt("COUNTER") + ": V" + rs.getInt("NUM") + "</h1>";
                    else
                        nowserving = nowserving + "<h1>Counter " + rs.getInt("COUNTER") + ": N" + rs.getInt("NUM") + "</h1>";
                } while(rs.next());
            }
            else
            {
                int currentTime = Integer.parseInt(new SimpleDateFormat("HH").format(Calendar.getInstance().getTime()));
                if(currentTime > 9 && currentTime < 21)     //9AM to 9PM
                    nowserving = "None";
                else
                    nowserving = "Store is closed";
            }
            rs.close();
            stmt.close();
        } catch (SQLException sqle) {
            System.err.println("Exception at getLastNumber - " + sqle.getMessage());
        }
        return nowserving;
    }
    
    public static int getTotal(Connection con, boolean all, boolean vip)
    {
        int total = 0;
        try {
            PreparedStatement ps;
            ResultSet rs;
            if(all)
                ps = con.prepareStatement("SELECT COUNT(NUM) FROM QUEUETBL WHERE DATE=? AND COUNTER IS NULL");
            else
                ps = con.prepareStatement("SELECT COUNT(NUM) FROM QUEUETBL WHERE DATE=? AND COUNTER IS NULL AND VIP=" + vip);
            ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            rs = ps.executeQuery();
            rs.next();
            total = rs.getInt(1);
            rs.close();
            ps.close();
        } catch (SQLException sqle) {
            System.err.println("Exception at getTotal - " + sqle.getMessage());
        }
        return total;
    }
    
    public static int getTotalCounters(Connection con) {
        int total = 0;
        try {
            PreparedStatement ps;
            ResultSet rs;
                ps = con.prepareStatement("SELECT COUNT(COUNTER) FROM QUEUETBL WHERE DATE=?");
            ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            rs = ps.executeQuery();
            rs.next();
            total = rs.getInt(1);
            rs.close();
            ps.close();
        } catch (SQLException sqle) {
            System.err.println("Exception at getTotalCounters - " + sqle.getMessage());
        }
        return total;
    }
    
    public static String getTransactions(Connection con) {
        String x = "<select>";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select TRANSACTIONTYPE from TRANSACTIONSTBL");
            while(rs.next())
                x = x + "<option value=\"" + rs.getString(1) + "\">" + rs.getString(1) + "</option>";
            x = x + "</select>";
        } catch (SQLException y) {
            System.err.println("Cannot retrieve transactions. " + y.getMessage());
        }
        return x;
    }
}
