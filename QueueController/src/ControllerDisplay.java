import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PatrickJoshuaSaguinsin
 */
public class ControllerDisplay extends javax.swing.JFrame {

    public static Connection con = null;
    DefaultTableModel model;
    String currentTBL;
    int counter;

    public ControllerDisplay() {
        initComponents();
        Connect2DB.pack();
        Connect2DB.setLocationRelativeTo(null);
        Connect2DB.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Connect2DB = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        hostTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        connectBT = new javax.swing.JButton();
        counterSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        Display = new javax.swing.JFrame();
        nowServingLBL = new javax.swing.JLabel();
        dNowServing = new javax.swing.JLabel();
        viewDatabase = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        sqlTF = new javax.swing.JTextField();
        sqlBT = new javax.swing.JButton();
        addVIPDiag = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        mn = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        cpw = new javax.swing.JPasswordField();
        addVIPOK = new javax.swing.JButton();
        cNowServing = new javax.swing.JLabel();
        nextBT = new javax.swing.JButton();
        mobilenumLBL = new javax.swing.JLabel();
        refLBL = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        transLBL = new javax.swing.JLabel();
        nextLBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        callAgainBT = new javax.swing.JButton();
        counterLBL = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        guestList = new javax.swing.JList();
        scroll = new javax.swing.JScrollPane();
        vipList = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenu1 = new javax.swing.JMenu();
        connectToDatabaseAgain = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        viewDB = new javax.swing.JMenuItem();
        viewRecords = new javax.swing.JMenuItem();
        viewVIP = new javax.swing.JMenuItem();
        add = new javax.swing.JMenu();
        addVIP = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cleanup = new javax.swing.JMenuItem();
        clearQueue = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        launchDisplay = new javax.swing.JMenuItem();
        fullscreen = new javax.swing.JMenuItem();
        restore = new javax.swing.JMenuItem();
        closeDisplay = new javax.swing.JMenuItem();

        Connect2DB.setTitle("Connect to Database");
        Connect2DB.setModal(true);

        jLabel1.setText("Database URL:");

        hostTF.setText("jdbc:derby://localhost:1527/QueueDB");
        hostTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostTFActionPerformed(evt);
            }
        });

        jLabel2.setText("Username:");

        usernameTF.setText("dbadmin");
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        jLabel3.setText("Password:");

        passwordTF.setText("dba");
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });

        connectBT.setText("Connect");
        connectBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBTActionPerformed(evt);
            }
        });

        counterSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel5.setText("Counter #:");

        javax.swing.GroupLayout Connect2DBLayout = new javax.swing.GroupLayout(Connect2DB.getContentPane());
        Connect2DB.getContentPane().setLayout(Connect2DBLayout);
        Connect2DBLayout.setHorizontalGroup(
            Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Connect2DBLayout.createSequentialGroup()
                .addGroup(Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Connect2DBLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hostTF, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(usernameTF)
                            .addComponent(passwordTF)
                            .addComponent(counterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Connect2DBLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(connectBT)))
                .addGap(20, 20, 20))
        );
        Connect2DBLayout.setVerticalGroup(
            Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Connect2DBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hostTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Connect2DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(counterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(connectBT)
                .addContainerGap())
        );

        Display.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Display.setTitle("Now Serving");
        Display.setBackground(new java.awt.Color(255, 255, 255));
        Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayMouseClicked(evt);
            }
        });
        Display.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                DisplayComponentResized(evt);
            }
        });

        nowServingLBL.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nowServingLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nowServingLBL.setText("Now Serving");

        dNowServing.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        dNowServing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dNowServing.setText("None");

        javax.swing.GroupLayout DisplayLayout = new javax.swing.GroupLayout(Display.getContentPane());
        Display.getContentPane().setLayout(DisplayLayout);
        DisplayLayout.setHorizontalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nowServingLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(dNowServing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DisplayLayout.setVerticalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nowServingLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dNowServing, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        viewDatabase.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        viewDatabase.setTitle("View Database");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SQL Statement"));

        sqlBT.setText("Execute SQL");
        sqlBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqlBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sqlTF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sqlBT)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqlTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqlBT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout viewDatabaseLayout = new javax.swing.GroupLayout(viewDatabase.getContentPane());
        viewDatabase.getContentPane().setLayout(viewDatabaseLayout);
        viewDatabaseLayout.setHorizontalGroup(
            viewDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDatabaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        viewDatabaseLayout.setVerticalGroup(
            viewDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDatabaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addVIPDiag.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addVIPDiag.setTitle("Add a VIP");

        jLabel12.setText("Full Name:");

        jLabel13.setText("Mobile Number: ");

        jLabel14.setText("Username: ");

        jLabel15.setText("Password:");

        jLabel16.setText("Confirm Password:");

        addVIPOK.setText("OK");
        addVIPOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVIPOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addVIPDiagLayout = new javax.swing.GroupLayout(addVIPDiag.getContentPane());
        addVIPDiag.getContentPane().setLayout(addVIPDiagLayout);
        addVIPDiagLayout.setHorizontalGroup(
            addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVIPDiagLayout.createSequentialGroup()
                .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addVIPDiagLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(27, 27, 27)
                        .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fn)
                            .addComponent(mn)
                            .addComponent(un)
                            .addComponent(pw)
                            .addComponent(cpw, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(addVIPDiagLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(addVIPOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addVIPDiagLayout.setVerticalGroup(
            addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVIPDiagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(mn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVIPDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addVIPOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Counter " + counter);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cNowServing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cNowServing.setText("None");

        nextBT.setText("Next");
        nextBT.setEnabled(false);
        nextBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTActionPerformed(evt);
            }
        });

        mobilenumLBL.setText("Mobile Number");

        refLBL.setText("Reference Number");

        nameLBL.setText("Name");

        transLBL.setText("Transaction");

        nextLBL.setForeground(new java.awt.Color(153, 153, 153));
        nextLBL.setText("Next:");

        jLabel4.setText("You're Serving:");

        callAgainBT.setText("Call Again");
        callAgainBT.setEnabled(false);
        callAgainBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callAgainBTActionPerformed(evt);
            }
        });

        counterLBL.setText("Counter");

        info.setForeground(new java.awt.Color(51, 51, 51));
        info.setText("Information:");

        jLabel6.setText("Name: ");

        jLabel7.setText("Mobile Number:");

        jLabel8.setText("Reference Number:");

        jLabel9.setText("Transaction: ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Upcoming"));

        guestList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Not", " ", "Con", "nec", "ted" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(guestList);

        vipList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Not", " ", "Con", "nec", "ted" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scroll.setViewportView(vipList);

        jLabel11.setText("Guests");

        jLabel10.setText("VIP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jmenu1.setText("Menu");

        connectToDatabaseAgain.setText("Connect to Database Server");
        connectToDatabaseAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectToDatabaseAgainActionPerformed(evt);
            }
        });
        jmenu1.add(connectToDatabaseAgain);

        jMenuBar1.add(jmenu1);

        jMenu2.setText("Database");

        jMenu4.setText("View Tables");

        viewDB.setText("View Queue");
        viewDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDBActionPerformed(evt);
            }
        });
        jMenu4.add(viewDB);

        viewRecords.setText("View Records History");
        viewRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordsActionPerformed(evt);
            }
        });
        jMenu4.add(viewRecords);

        viewVIP.setText("View VIP List");
        viewVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVIPActionPerformed(evt);
            }
        });
        jMenu4.add(viewVIP);

        jMenu2.add(jMenu4);

        add.setText("Add Record");

        addVIP.setText("Add a VIP...");
        addVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVIPActionPerformed(evt);
            }
        });
        add.add(addVIP);

        jMenu2.add(add);
        jMenu2.add(jSeparator1);

        cleanup.setText("Cleanup Queue");
        cleanup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanupActionPerformed(evt);
            }
        });
        jMenu2.add(cleanup);

        clearQueue.setText("Clear Queue");
        clearQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearQueueActionPerformed(evt);
            }
        });
        jMenu2.add(clearQueue);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Window");

        launchDisplay.setText("Launch Display");
        launchDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchDisplayActionPerformed(evt);
            }
        });
        jMenu3.add(launchDisplay);

        fullscreen.setText("Fullscreen Display");
        fullscreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullscreenActionPerformed(evt);
            }
        });
        jMenu3.add(fullscreen);

        restore.setText("Restore Window Controls");
        restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreActionPerformed(evt);
            }
        });
        jMenu3.add(restore);

        closeDisplay.setText("Close Display");
        closeDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDisplayActionPerformed(evt);
            }
        });
        jMenu3.add(closeDisplay);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refLBL))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transLBL))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cNowServing)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameLBL))
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(counterLBL))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mobilenumLBL))))
                    .addComponent(nextLBL)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nextBT)
                        .addGap(18, 18, 18)
                        .addComponent(callAgainBT)))
                .addGap(69, 69, 69)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(info)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(counterLBL))
                        .addGap(14, 14, 14)
                        .addComponent(cNowServing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nameLBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mobilenumLBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(refLBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(transLBL))
                        .addGap(18, 18, 18)
                        .addComponent(nextLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextBT)
                            .addComponent(callAgainBT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(info))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        connectBTActionPerformed(evt);
    }//GEN-LAST:event_usernameTFActionPerformed

    private void connectBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBTActionPerformed
        connectToDatabase(hostTF.getText(), usernameTF.getText(), passwordTF.getText(), counterSpinner.getValue().toString());
    }//GEN-LAST:event_connectBTActionPerformed

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        connectBTActionPerformed(evt);
    }//GEN-LAST:event_passwordTFActionPerformed

    private void DisplayComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DisplayComponentResized
        resizeDisplay();
    }//GEN-LAST:event_DisplayComponentResized

    //start of developer-creaed methods
    void deletePreviouslyServed() {
        try {
            con.createStatement().executeUpdate("delete from QUEUETBL where COUNTER=" + counter);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error deleting previously served number.\n" + sqle.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void updateLabels(ResultSet rs) {
        try {
            if (rs.getBoolean("VIP")) //transfer data from db to GUI labels on controller
            {
                cNowServing.setText("V" + rs.getInt("NUM"));    //if VIP
            } else {
                cNowServing.setText("N" + rs.getInt("NUM"));    //non-vip guest
            }
            mobilenumLBL.setText(rs.getString("MOBILENUM"));
            refLBL.setText(rs.getInt("REF") + "");
            String name = rs.getString("NAME");
            if(name.isEmpty())
                nameLBL.setText("Guest");
            else
                nameLBL.setText(rs.getString("NAME"));
            transLBL.setText(rs.getString("TRANS"));
            rs.close();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update QUEUETBL set COUNTER=" + counter + " where MOBILENUM='" + mobilenumLBL.getText() + "'"); //set now serving field to true
            stmt.close();
            dNowServing.setText("  " + cNowServing.getText() + "  ");   //set now serving on display
            //insert SMS code here
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error retreiving data\n" + sqle.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void nextBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTActionPerformed
        try {
            deletePreviouslyServed();
            PreparedStatement ps = con.prepareStatement("select * from QUEUETBL where DATE=? and VIP=true and COUNTER IS NULL");    //query to get VIP first
            ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));   //get current date
            ResultSet rs = ps.executeQuery();   //execute SQL statement
            if (rs.next()) {    //if there is a VIP on queue
                updateLabels(rs);   //transfer retrieved DB data to GUI
                Thread blink = new BlinkySound();
                blink.start();
                callAgainBT.setEnabled(true);
            } else {
                ps = con.prepareStatement("select * from QUEUETBL where DATE=? and VIP=false and COUNTER IS NULL");  //get non-vip guest
                ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));   //get current date
                rs = ps.executeQuery();
                if (rs.next()) {    //if there is a non-vip guest on queue
                    updateLabels(rs);
                    Thread blink = new BlinkySound();
                    blink.start();
                    callAgainBT.setEnabled(true);
                } else {  //if queue is empty
                    cNowServing.setText("None");//transfer data from db to GUI labels on controller
                    mobilenumLBL.setText("-");
                    refLBL.setText("-");
                    nameLBL.setText("-");
                    transLBL.setText("-");
                    dNowServing.setText("None");
                    callAgainBT.setEnabled(false);
                    //JOptionPane.showMessageDialog(this, "No one is on queue", "Empty Queue", JOptionPane.INFORMATION_MESSAGE);
                    Thread thread = new Information("No one is on queue", true);
                    thread.start();
                }
            }
            rs.close();
            ps.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error retreiving data\n" + sqle.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nextBTActionPerformed

    private void hostTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostTFActionPerformed
        connectBTActionPerformed(evt);
    }//GEN-LAST:event_hostTFActionPerformed

    private void viewDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDBActionPerformed
        currentTBL = "QUEUETBL";
        sqlTF.setText("select * from QUEUETBL");
        executeSQL("QUEUETBL");
        viewDatabase.pack();
        viewDatabase.setLocationRelativeTo(null);
        viewDatabase.setVisible(true);
    }//GEN-LAST:event_viewDBActionPerformed

    private void cleanupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanupActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "This will remove all records on queue dated before today.\nDo you want to continue?", "Potential Data Loss Warning", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement ps = con.prepareStatement("delete from QUEUETBL where DATE<>?");
                ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
                JOptionPane.showMessageDialog(null, ps.executeUpdate() + " row(s) deleted", "Cleanup success", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, "Cannot delete old records.\n" + sqle.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cleanupActionPerformed

    private void clearQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearQueueActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Warning: You are about erase the entire queue.\nNote: This process is irrevesible.\nDo you want to continue?", "Potential Data Loss Warning", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement ps = con.prepareStatement("delete from QUEUETBL");
                JOptionPane.showMessageDialog(null, ps.executeUpdate() + " row(s) deleted", "Successfully Deleted Queue", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, "Cannot delete all records on Queue.\n" + sqle.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_clearQueueActionPerformed

    private void sqlBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqlBTActionPerformed
        executeSQL("QUEUETBL");
    }//GEN-LAST:event_sqlBTActionPerformed

    private void viewRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordsActionPerformed
        currentTBL = "RECORDSHISTORY";
        sqlTF.setText("select * from RECORDSHISTORY");
        executeSQL("RECORDSHISTORY");
        viewDatabase.pack();
        viewDatabase.setLocationRelativeTo(null);
        viewDatabase.setVisible(true);
    }//GEN-LAST:event_viewRecordsActionPerformed

    private void viewVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVIPActionPerformed
        currentTBL = "VIPCLIENTSTBL";
        sqlTF.setText("select * from VIPCLIENTSTBL");
        executeSQL("VIPCLIENTSTBL");
        viewDatabase.pack();
        viewDatabase.setLocationRelativeTo(null);
        viewDatabase.setVisible(true);
    }//GEN-LAST:event_viewVIPActionPerformed

    private void launchDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchDisplayActionPerformed
        dNowServing.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
        nowServingLBL.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
        Display.setUndecorated(false);
        Display.pack();
        Display.setLocationRelativeTo(null);
        Display.setVisible(true);
    }//GEN-LAST:event_launchDisplayActionPerformed

    private void closeDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDisplayActionPerformed
        Display.dispose();
        Display.setUndecorated(false);
    }//GEN-LAST:event_closeDisplayActionPerformed

    private void fullscreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullscreenActionPerformed
        Display.dispose();
        Display.setUndecorated(true);
        Display.setVisible(true);
    }//GEN-LAST:event_fullscreenActionPerformed

    private void restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreActionPerformed
        Display.dispose();
        Display.setUndecorated(false);
        Display.setVisible(true);
    }//GEN-LAST:event_restoreActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
    }//GEN-LAST:event_formWindowStateChanged

    private void DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayMouseClicked
        Display.dispose();
        if (Display.isUndecorated()) {
            Display.setUndecorated(false);
            dNowServing.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
            nowServingLBL.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
        } else {
            Display.setUndecorated(true);
        }
        Display.setVisible(true);
    }//GEN-LAST:event_DisplayMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void callAgainBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callAgainBTActionPerformed
        Thread blink = new BlinkySound();
        blink.start();
    }//GEN-LAST:event_callAgainBTActionPerformed

    private void connectToDatabaseAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectToDatabaseAgainActionPerformed
        Connect2DB.show();
    }//GEN-LAST:event_connectToDatabaseAgainActionPerformed

    private void addVIPOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVIPOKActionPerformed
        if(fn.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Full Name cannot be blank", "No Name Supplied" , JOptionPane.ERROR_MESSAGE);
        else if(mn.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Mobile Number cannot be blank", "No Mobile Number Supplied" , JOptionPane.ERROR_MESSAGE);
        else if(un.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Username cannot be blank", "No Username Supplied" , JOptionPane.ERROR_MESSAGE);
        else if(pw.getText().length()<6)
            JOptionPane.showMessageDialog(null,"Password length must be greater than or equal to 6", "Error",  JOptionPane.ERROR_MESSAGE);
        else if(!(pw.getText().equals(cpw.getText())))
            JOptionPane.showMessageDialog(null,"Passwords do not match", "Error",  JOptionPane.ERROR_MESSAGE);
        else if(!(mn.getText().substring(0, 3)).equals("+63") || (mn.getText().trim().length()!=13))
            JOptionPane.showMessageDialog(null, "Please use this 13 character Mobile Number format:\n+639XXXXXXXXX", "Invalid Mobile Number Format" , JOptionPane.ERROR_MESSAGE);
        else {
            try {
                Statement stmt = con.createStatement();
                if(stmt.executeUpdate("insert into vipclientstbl (username,password,mobilenumber,fullname) values ('" + un.getText() + "','" + pw.getText() + "','" + mn.getText() + "','" + fn.getText() + "')") == 1) {
                    JOptionPane.showMessageDialog(null, "Record has been added to the VIP List", "Success", JOptionPane.INFORMATION_MESSAGE);
                    addVIPDiag.dispose();
                }
            } catch (SQLException x) {
                JOptionPane.showMessageDialog(null, "Database Error", "Error occured while adding record.\nReason: " + x.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addVIPOKActionPerformed

    private void addVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVIPActionPerformed
        addVIPDiag.pack();
        addVIPDiag.setLocationRelativeTo(null);
        addVIPDiag.setVisible(true);
    }//GEN-LAST:event_addVIPActionPerformed

    public void connectToDatabase(String host, String user, String pw, String counterNum) {
        try {
            counter = Integer.parseInt(counterNum);
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(host, user, pw);
            //con = DriverManager.getConnection("jdbc:derby://localhost:1527/QueueDB", "dbadmin", "dba");
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());
            JOptionPane.showMessageDialog(null, sqle.getMessage(), "Database Connection Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, cnfe.getMessage(), "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            cnfe.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Invalid Counter", JOptionPane.ERROR_MESSAGE);
        }
        if (con != null) {
            Connect2DB.hide();
            Display.pack();
            Display.setLocationRelativeTo(null);
            Display.setVisible(true);
            nextBT.setEnabled(true);
            connectToDatabaseAgain.setEnabled(false);
            connectToDatabaseAgain.setText("Connected to Database");
            Display.setTitle("Counter " + counter);
            counterLBL.setText("Counter " + counter);
            nowServingLBL.setText("Counter " + counter + " - Now Serving");
            Thread thread = new Information("Connected to Database Server", false);
            thread.start();
            
            //retrieve now serving
            try {
                PreparedStatement ps = con.prepareStatement("select * from QUEUETBL where DATE=? and COUNTER=" + counter);
                ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    updateLabels(rs);
                    callAgainBT.setEnabled(true);
                }
                rs.close();
                ps.close();
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, "There was a problem retrieving the number currently being served.\n" + sqle.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }

            //start upcoming list generator thread
            Thread upcominglistgeneratorThread = new UpcomingListGenerator(con);
            upcominglistgeneratorThread.start();
        }
    }

    void executeSQL(String DBtable) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs;
            if (sqlTF.getText().startsWith("select")) {
                rs = stmt.executeQuery(sqlTF.getText());
            } else {
                JOptionPane.showMessageDialog(null, stmt.executeUpdate(sqlTF.getText()) + " row(s) affected", "SQL Result", JOptionPane.INFORMATION_MESSAGE);
                rs = stmt.executeQuery("select * from " + currentTBL);
            }
            //String [] columnHeader = {"Number", "Mobile Number", "VIP", "Reference Number", "Name", "Date", "Transaction", "Currently Serving"};
            table.setModel(DbUtils.resultSetToTableModel(rs));
            //JTableHeader
            //table.setTableHeader(null);
            rs.close();
            stmt.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error executing statement: " + sqlTF.getText() + "\n" + sqle.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //<editor-fold defaultstate="collapsed" desc=" Display resizing code ">
    static void resizeDisplay() {
        Font labelFont = nowServingLBL.getFont();
        String labelText = nowServingLBL.getText();

        int stringWidth = nowServingLBL.getFontMetrics(labelFont).stringWidth(labelText);
        int componentWidth = nowServingLBL.getWidth();

        // Find out how much the font can grow in width.
        double widthRatio = (double) componentWidth / (double) stringWidth;

        int newFontSize = (int) (labelFont.getSize() * widthRatio);
        int componentHeight = nowServingLBL.getHeight();

        // Pick a new font size so it will not be larger than the height of label.
        int fontSizeToUse = Math.min(newFontSize, componentHeight);

        // Set the label's font size to the newly determined size.
        nowServingLBL.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));

        //Number
        Font labelFont1 = dNowServing.getFont();
        String labelText1 = dNowServing.getText();

        int stringWidth1 = dNowServing.getFontMetrics(labelFont1).stringWidth(labelText1);
        int componentWidth1 = dNowServing.getWidth();

        // Find out how much the font can grow in width.
        double widthRatio1 = (double) componentWidth1 / (double) stringWidth1;

        int newFontSize1 = (int) (labelFont1.getSize() * widthRatio1);
        int componentHeight1 = dNowServing.getHeight();

        // Pick a new font size so it will not be larger than the height of label.
        int fontSizeToUse1 = Math.min(newFontSize1, componentHeight1);

        // Set the label's font size to the newly determined size.
        dNowServing.setFont(new Font(labelFont1.getName(), Font.PLAIN, fontSizeToUse1));
    }
    //</editor-fold>

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
            UIManager.put("Button.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("ToggleButton.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("RadioButton.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("CheckBox.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("ColorChooser.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("ComboBox.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("List.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("MenuBar.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("MenuItem.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("RadioButtonMenuItem.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("CheckBoxMenuItem.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("Menu.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("PopupMenu.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("OptionPane.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("Panel.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("ProgressBar.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("ScrollPane.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("Viewport.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("TabbedPane.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("Table.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("TableHeader.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("PasswordField.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("TextArea.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("TextPane.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("EditorPane.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("TitledBorder.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("ToolBar.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("ToolTip.font", new Font("Segoe UI", Font.PLAIN, 11));
            UIManager.put("Tree.font", new Font("Segoe UI", Font.PLAIN, 11));
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControllerDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControllerDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControllerDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControllerDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControllerDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDialog Connect2DB;
    public static javax.swing.JFrame Display;
    private javax.swing.JMenu add;
    private javax.swing.JMenuItem addVIP;
    private javax.swing.JDialog addVIPDiag;
    private javax.swing.JButton addVIPOK;
    public static javax.swing.JLabel cNowServing;
    private javax.swing.JButton callAgainBT;
    private javax.swing.JMenuItem cleanup;
    private javax.swing.JMenuItem clearQueue;
    private javax.swing.JMenuItem closeDisplay;
    private javax.swing.JButton connectBT;
    private javax.swing.JMenuItem connectToDatabaseAgain;
    private javax.swing.JLabel counterLBL;
    private javax.swing.JSpinner counterSpinner;
    private javax.swing.JPasswordField cpw;
    public static javax.swing.JLabel dNowServing;
    private javax.swing.JTextField fn;
    private javax.swing.JMenuItem fullscreen;
    public static javax.swing.JList guestList;
    private javax.swing.JTextField hostTF;
    public static javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmenu1;
    private javax.swing.JMenuItem launchDisplay;
    private javax.swing.JTextField mn;
    private javax.swing.JLabel mobilenumLBL;
    private javax.swing.JLabel nameLBL;
    public static javax.swing.JButton nextBT;
    public static javax.swing.JLabel nextLBL;
    public static javax.swing.JLabel nowServingLBL;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JPasswordField pw;
    private javax.swing.JLabel refLBL;
    private javax.swing.JMenuItem restore;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JButton sqlBT;
    private javax.swing.JTextField sqlTF;
    public javax.swing.JTable table;
    private javax.swing.JLabel transLBL;
    private javax.swing.JTextField un;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JMenuItem viewDB;
    public static javax.swing.JFrame viewDatabase;
    private javax.swing.JMenuItem viewRecords;
    private javax.swing.JMenuItem viewVIP;
    public static javax.swing.JList vipList;
    // End of variables declaration//GEN-END:variables
}
