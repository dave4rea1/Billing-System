
import java.text.*;
import java.awt.print.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 

public class capAndBill extends javax.swing.JFrame {
    
    String subtotal, vat, total;           // variables declared
    double [] modulecost = new double[20]; // array declared

    public capAndBill() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField20 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        txtReset = new javax.swing.JButton();
        txtPrint = new javax.swing.JButton();
        txtExit = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStudentNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboCampus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        radOnCamp = new javax.swing.JRadioButton();
        radOffCamp = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtModules = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        checkStfm129 = new javax.swing.JCheckBox();
        txtStfm129 = new javax.swing.JTextField();
        checkEcon112 = new javax.swing.JCheckBox();
        txtEcat = new javax.swing.JTextField();
        checkIcat = new javax.swing.JCheckBox();
        txtIcat = new javax.swing.JTextField();
        checkInfs211 = new javax.swing.JCheckBox();
        txtInfs211 = new javax.swing.JTextField();
        checkStfm111 = new javax.swing.JCheckBox();
        txtStfm111 = new javax.swing.JTextField();
        checkEcon122 = new javax.swing.JCheckBox();
        txtEcon122 = new javax.swing.JTextField();
        checkInfs212 = new javax.swing.JCheckBox();
        txtInfs212 = new javax.swing.JTextField();
        txtEcon112 = new javax.swing.JTextField();
        checkInfs222 = new javax.swing.JCheckBox();
        txtInfs222 = new javax.swing.JTextField();
        checkInfs221 = new javax.swing.JCheckBox();
        txtInfs221 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        checkEcat = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAccomodation = new javax.swing.JTextField();
        txtVat = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtTotalCost = new javax.swing.JTextField();

        jTextField20.setText("jTextField20");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(153, 0, 153)));
        jPanel2.setPreferredSize(new java.awt.Dimension(505, 664));

        txtReceipt.setColumns(20);
        txtReceipt.setRows(5);
        jScrollPane2.setViewportView(txtReceipt);

        txtReset.setBackground(new java.awt.Color(255, 255, 51));
        txtReset.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtReset.setForeground(new java.awt.Color(0, 0, 0));
        txtReset.setText("RESET");
        txtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetActionPerformed(evt);
            }
        });

        txtPrint.setBackground(new java.awt.Color(0, 255, 0));
        txtPrint.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPrint.setForeground(new java.awt.Color(0, 0, 0));
        txtPrint.setText("PRINT");
        txtPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrintActionPerformed(evt);
            }
        });

        txtExit.setBackground(new java.awt.Color(255, 0, 0));
        txtExit.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtExit.setText("EXIT");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 153));
        jLabel18.setText("eBilling");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(txtPrint)
                        .addGap(122, 122, 122)
                        .addComponent(txtExit)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReset)
                    .addComponent(txtPrint)
                    .addComponent(txtExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(153, 0, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("First name: ");

        txtFirstName.setBackground(new java.awt.Color(204, 204, 204));
        txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.setBackground(new java.awt.Color(204, 204, 204));
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Student number:");

        txtStudentNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtStudentNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtStudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNumberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("E-mail:");

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Phone number:");

        txtPhoneNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Course code:");

        txtCourse.setBackground(new java.awt.Color(204, 204, 204));
        txtCourse.setForeground(new java.awt.Color(0, 0, 0));
        txtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Campus: ");

        comboCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mafikeng", "Potchefstroom", "Vanderbijl Park", " " }));
        comboCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCampusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Address: ");

        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Accomodation");

        radOnCamp.setText("On Campus");
        radOnCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOnCampActionPerformed(evt);
            }
        });

        radOffCamp.setText("Off Campus");
        radOffCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOffCampActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*Please enter personal details below");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("No. of modules:");

        txtModules.setBackground(new java.awt.Color(204, 204, 204));
        txtModules.setForeground(new java.awt.Color(0, 0, 0));
        txtModules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModulesActionPerformed(evt);
            }
        });

        checkStfm129.setText("STFM 129");
        checkStfm129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStfm129ActionPerformed(evt);
            }
        });

        txtStfm129.setText("0");

        checkEcon112.setText("ECON 112");
        checkEcon112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEcon112ActionPerformed(evt);
            }
        });

        txtEcat.setText("0");

        checkIcat.setText("ICAT 111");
        checkIcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIcatActionPerformed(evt);
            }
        });

        txtIcat.setText("0");

        checkInfs211.setText("INFS 211");
        checkInfs211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfs211ActionPerformed(evt);
            }
        });

        txtInfs211.setText("0");

        checkStfm111.setText("STFM 111");
        checkStfm111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStfm111ActionPerformed(evt);
            }
        });

        txtStfm111.setText("0");

        checkEcon122.setText("ECON 122");
        checkEcon122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEcon122ActionPerformed(evt);
            }
        });

        txtEcon122.setText("0");

        checkInfs212.setText("INFS 212");
        checkInfs212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfs212ActionPerformed(evt);
            }
        });

        txtInfs212.setText("0");

        txtEcon112.setText("0");

        checkInfs222.setText("INFS 222");
        checkInfs222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfs222ActionPerformed(evt);
            }
        });

        txtInfs222.setText("0");

        checkInfs221.setText("INFS 221");
        checkInfs221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfs221ActionPerformed(evt);
            }
        });

        txtInfs221.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("MODULES");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("COST [ZAR]");

        checkEcat.setText("ECAT 121");
        checkEcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEcatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkStfm129)
                            .addComponent(checkEcon112)
                            .addComponent(checkInfs211)
                            .addComponent(checkStfm111)
                            .addComponent(checkEcon122)
                            .addComponent(checkInfs212)
                            .addComponent(checkInfs222)
                            .addComponent(checkEcat)
                            .addComponent(checkIcat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtStfm129, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEcat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIcat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtInfs211, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStfm111, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEcon122, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtInfs212, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtInfs222, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEcon112, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInfs221, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(checkInfs221)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkStfm129)
                    .addComponent(txtStfm129, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEcat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkEcat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIcat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkIcat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInfs211)
                    .addComponent(txtInfs211, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkStfm111)
                    .addComponent(txtStfm111, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEcon122)
                    .addComponent(txtEcon122, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInfs212)
                    .addComponent(txtInfs212, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEcon112, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkEcon112))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInfs222)
                    .addComponent(txtInfs222, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInfs221)
                    .addComponent(txtInfs221, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Last name:");

        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 255));
        btnSave.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("SUB TOTAL:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("ACCOMODATION:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("VAT:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("TOTAL COST:");

        txtAccomodation.setText("0");
        txtAccomodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccomodationActionPerformed(evt);
            }
        });

        txtVat.setText("0");
        txtVat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVatActionPerformed(evt);
            }
        });

        txtSubTotal.setText("0");
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        txtTotalCost.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(txtStudentNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(comboCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(radOnCamp)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel16)
                        .addComponent(jLabel4))
                    .addComponent(txtModules, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(radOffCamp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(btnClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(txtStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radOnCamp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radOffCamp)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
       String firstname = txtFirstName.getText();
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        String lastname = txtLastName.getText();
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtStudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNumberActionPerformed
        String studentnumber = txtStudentNumber.getText();
    }//GEN-LAST:event_txtStudentNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        String email = txtEmail.getText();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        String phonenumber = txtPhoneNumber.getText();
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseActionPerformed
        String course = txtCourse.getText();
    }//GEN-LAST:event_txtCourseActionPerformed

    private void txtModulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModulesActionPerformed
        String modules = txtModules.getText();
    }//GEN-LAST:event_txtModulesActionPerformed

    private void comboCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCampusActionPerformed
        
    }//GEN-LAST:event_comboCampusActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        String address = txtAddress.getText();
    }//GEN-LAST:event_txtAddressActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // new form loads
        
        txtStfm129.setEnabled(false);
        txtEcat.setEnabled(false);
        txtIcat.setEnabled(false);
        txtInfs211.setEnabled(false);
        txtStfm111.setEnabled(false);
        txtEcon122.setEnabled(false);
        txtInfs212.setEnabled(false);
        txtEcon112.setEnabled(false);
        txtInfs222.setEnabled(false);
        txtInfs221.setEnabled(false);
        
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtStudentNumber.setText(null);
        txtEmail.setText(null);
        txtPhoneNumber.setText(null);
        txtCourse.setText(null);
        txtModules.setText(null);
        txtAddress.setText(null);
        comboCampus.setSelectedIndex(0);
        radOnCamp.setSelected(false);
        radOffCamp.setSelected(false);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void txtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetActionPerformed
        // reset button to clear page
        
        txtStfm129.setText("0");
        txtEcat.setText("0");
        txtIcat.setText("0");
        txtInfs211.setText("0");
        txtStfm111.setText("0");
        txtEcon122.setText("0");
        txtInfs212.setText("0");
        txtEcon112.setText("0");
        txtInfs222.setText("0");
        txtInfs221.setText("0");
        
        checkStfm129.setSelected(false);
        checkEcat.setSelected(false);
        checkIcat.setSelected(false);
        checkInfs211.setSelected(false);
        checkStfm111.setSelected(false);
        checkEcon122.setSelected(false);
        checkInfs212.setSelected(false);
        checkEcon112.setSelected(false);
        checkInfs222.setSelected(false);
        checkInfs221.setSelected(false);
        
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtStudentNumber.setText(null);
        txtEmail.setText(null);
        txtPhoneNumber.setText(null);
        txtCourse.setText(null);
        txtModules.setText(null);
        txtAddress.setText(null);
        comboCampus.setSelectedIndex(0);
        radOnCamp.setSelected(false);
        radOffCamp.setSelected(false);
        txtSubTotal.setText(null);
        txtVat.setText(null);
        txtAccomodation.setText(null);
        txtTotalCost.setText(null);
        txtReceipt.setText(null);
        
    }//GEN-LAST:event_txtResetActionPerformed

    private void txtPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrintActionPerformed
        // print receipt
        
        try {
            txtReceipt.print();
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found",e.getMessage());
        }
        
    }//GEN-LAST:event_txtPrintActionPerformed

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
        // Exit button
        
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Student Billing System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_txtExitActionPerformed

    private void checkStfm129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStfm129ActionPerformed
        if (checkStfm129.isSelected())
        {
            txtStfm129.setEnabled(true);
            txtStfm129.setText("3330.00");
            txtStfm129.requestFocus();
            
        }
        else
        {
            txtStfm129.setEnabled(false);
            txtStfm129.setText("0");
        }
    }//GEN-LAST:event_checkStfm129ActionPerformed

    private void checkEcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEcatActionPerformed
         if (checkEcat.isSelected())
        {
            txtEcat.setEnabled(true);
            txtEcat.setText("4405.00");
            txtEcat.requestFocus();
            
        }
        else
        {
            txtEcat.setEnabled(false);
            txtEcat.setText("0");
        }
    }//GEN-LAST:event_checkEcatActionPerformed

    private void checkIcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIcatActionPerformed
        
         if (checkIcat.isSelected())
        {
            txtIcat.setEnabled(true);
            txtIcat.setText("3630.00");
            txtIcat.requestFocus();
            
        }
        else
        {
            txtIcat.setEnabled(false);
            txtIcat.setText("0");
        }
    }//GEN-LAST:event_checkIcatActionPerformed

    private void checkInfs211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfs211ActionPerformed
       
         if (checkInfs211.isSelected())
        {
            txtInfs211.setEnabled(true);
            txtInfs211.setText("3330.00");
            txtInfs211.requestFocus();
            
        }
        else
        {
            txtInfs211.setEnabled(false);
            txtInfs211.setText("0");
        }
    }//GEN-LAST:event_checkInfs211ActionPerformed

    private void checkStfm111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStfm111ActionPerformed
        
         if (checkStfm111.isSelected())
        {
            txtStfm111.setEnabled(true);
            txtStfm111.setText("4070.00");
            txtStfm111.requestFocus();
            
        }
        else
        {
            txtStfm111.setEnabled(false);
            txtStfm111.setText("0");
        }
    }//GEN-LAST:event_checkStfm111ActionPerformed

    private void checkEcon122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEcon122ActionPerformed
        
         if (checkEcon122.isSelected())
        {
            txtEcon122.setEnabled(true);
            txtEcon122.setText("3630.00");
            txtEcon122.requestFocus();
            
        }
        else
        {
            txtEcon122.setEnabled(false);
            txtEcon122.setText("0");
        }
        
    }//GEN-LAST:event_checkEcon122ActionPerformed

    private void checkInfs212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfs212ActionPerformed
        
        if (checkInfs212.isSelected())
        {
            txtInfs212.setEnabled(true);
            txtInfs212.setText("3330.00");
            txtInfs212.requestFocus();
            
        }
        else
        {
            txtInfs212.setEnabled(false);
            txtInfs212.setText("0");
        }
    }//GEN-LAST:event_checkInfs212ActionPerformed

    private void checkEcon112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEcon112ActionPerformed
        
         if (checkEcon112.isSelected())
        {
            txtEcon112.setEnabled(true);
            txtEcon112.setText("3630.00");
            txtEcon112.requestFocus();
            
        }
        else
        {
            txtEcon112.setEnabled(false);
            txtEcon112.setText("0");
        }
        
    }//GEN-LAST:event_checkEcon112ActionPerformed

    private void checkInfs222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfs222ActionPerformed
        
         if (checkInfs222.isSelected())
        {
            txtInfs222.setEnabled(true);
            txtInfs222.setText("3330.00");
            txtInfs222.requestFocus();
            
        }
        else
        {
            txtInfs222.setEnabled(false);
            txtInfs222.setText("0");
        }
    }//GEN-LAST:event_checkInfs222ActionPerformed

    private void checkInfs221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfs221ActionPerformed
        
         if (checkInfs221.isSelected())
        {
            txtInfs221.setEnabled(true);
            txtInfs221.setText("3330.00");
            txtInfs221.requestFocus();
            
        }
        else
        {
            txtInfs221.setEnabled(false);
            txtInfs221.setText("0");
        }
    }//GEN-LAST:event_checkInfs221ActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
       
      
        
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void radOnCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOnCampActionPerformed
        
         if (radOnCamp.isSelected())
        {
            
            txtAccomodation.setText("29000.00");
            
            
        }
        else
        {
            
            txtInfs221.setText("0");
        }
        
    }//GEN-LAST:event_radOnCampActionPerformed

    private void radOffCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOffCampActionPerformed
        
          if (radOffCamp.isSelected())
        {
            
            txtAccomodation.setText("0");
            
            
        }
        else
        {
            
            txtAccomodation.setText("0");
        }
    }//GEN-LAST:event_radOffCampActionPerformed

    private void txtAccomodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccomodationActionPerformed
        
        String accomodation = txtAccomodation.getText();
    }//GEN-LAST:event_txtAccomodationActionPerformed

    private void txtVatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVatActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // to compute total costs
        
         modulecost[0]= Double.parseDouble(txtStfm129.getText());
        modulecost[1]= Double.parseDouble(txtEcat.getText());
        modulecost[2]= Double.parseDouble(txtIcat.getText());
        modulecost[3]= Double.parseDouble(txtInfs211.getText());
        modulecost[4]= Double.parseDouble(txtStfm111.getText());
        modulecost[5]= Double.parseDouble(txtEcon122.getText());
        modulecost[6]= Double.parseDouble(txtInfs212.getText());
        modulecost[7]= Double.parseDouble(txtEcon112.getText());
        modulecost[8]= Double.parseDouble(txtInfs222.getText());
        modulecost[9]= Double.parseDouble(txtInfs221.getText());
        modulecost[10]= Double.parseDouble(txtAccomodation.getText());
        
        modulecost[11] = modulecost[0] + modulecost[1] + modulecost[2] + modulecost[3] + modulecost[4] + modulecost[5];
        modulecost[12] = modulecost[6] + modulecost[7] + modulecost[8] + modulecost[9] + modulecost[10];
        
        modulecost[13] = modulecost[11] + modulecost[12];
        vat = String.format("R %.2f", modulecost[13]/100);
        subtotal = String.format("R %.2f", modulecost[13] - modulecost[10]);
        total = String.format("R %.2f", modulecost[13] + (modulecost[13]/ 100) + modulecost[10]);
        
        txtVat.setText(vat);
        txtSubTotal.setText(subtotal);
        txtTotalCost.setText(total);
        
        // Receipt codes
        
        txtReceipt.setEnabled(true);
        // =========================================================================
        int refs = 1325 + (int) (Math.random()*4238);
        
        
        txtReceipt.append("\tStudent Billing System\n" + 
                "Reference: \t\t\t" + refs + 
                "\n================================================\t " +
                
                        "\n=====================================================\t " + 
                        "\nStudent name:\t" + txtFirstName.getText() + " " + txtLastName.getText() +
                        "\nStudent number: " + txtStudentNumber.getText() +
                        "\nCourse code:\t" + txtCourse.getText() +
                        "\nTotal number of modules:\t\t\t" + txtModules.getText() +
                        "\nSTFM 129 LINEAR ALGEBRA AND PROB:\t\t" + txtStfm129.getText() +
                        "\nECAT 121 EXT OF CRIT AND ANAL THINK:\t\t" + txtEcat.getText() +
                        "\nICAT 111 CRITICAL AND ANALY THINK:\t\t" + txtIcat.getText() +
                        "\nINFS 211 OBJECT ORIENTED PROGRAMMING:\t\t" + txtInfs211.getText() +
                        "\nSTFM 111 INTRODUCTORY STATISTICS:\t\t" + txtStfm111.getText() +
                        "\nECON 122 INTRO TO MACROECONOMICS:\t\t" + txtEcon122.getText() +
                        "\nINFS 212 COMPUTER ORG AND ARCH:\t\t" + txtInfs212.getText() +
                        "\nECON 112 INTRODCTION TO MICROECON:\t\t" + txtEcon112.getText() +
                        "\nINFS 222 INTRODUCTION TO DATABASES:\t\t" + txtInfs222.getText() +
                        "\nINFS 221 ELECTRONIC BUSINESS:\t\t" + txtInfs221.getText() +
                
                        "\n=====================================================\t" +
                                
                                
                        "\nAccomodation:\t\t\t" + txtAccomodation.getText() +
                        "\nSub Total: \t\t\t" + subtotal +
                        "\nVAT:\t\t\t" + vat +
                        "\nTotal:\t\t\t" + total + 
                        "\n=====================================================\t " +
                
                "\n\n\tThank you for using this service!\n");
                        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
         txtStfm129.setText("0");
        txtEcat.setText("0");
        txtIcat.setText("0");
        txtInfs211.setText("0");
        txtStfm111.setText("0");
        txtEcon122.setText("0");
        txtInfs212.setText("0");
        txtEcon112.setText("0");
        txtInfs222.setText("0");
        txtInfs221.setText("0");
        
        checkStfm129.setSelected(false);
        checkEcat.setSelected(false);
        checkIcat.setSelected(false);
        checkInfs211.setSelected(false);
        checkStfm111.setSelected(false);
        checkEcon122.setSelected(false);
        checkInfs212.setSelected(false);
        checkEcon112.setSelected(false);
        checkInfs222.setSelected(false);
        checkInfs221.setSelected(false);
        
        radOnCamp.setSelected(false);
        radOffCamp.setSelected(false);
        txtSubTotal.setText(null);
        txtVat.setText(null);
        txtAccomodation.setText(null);
        txtTotalCost.setText(null);
        txtReceipt.setText(null);
        txtModules.setText("null");
        
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(capAndBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capAndBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capAndBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capAndBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capAndBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox checkEcat;
    private javax.swing.JCheckBox checkEcon112;
    private javax.swing.JCheckBox checkEcon122;
    private javax.swing.JCheckBox checkIcat;
    private javax.swing.JCheckBox checkInfs211;
    private javax.swing.JCheckBox checkInfs212;
    private javax.swing.JCheckBox checkInfs221;
    private javax.swing.JCheckBox checkInfs222;
    private javax.swing.JCheckBox checkStfm111;
    private javax.swing.JCheckBox checkStfm129;
    private javax.swing.JComboBox<String> comboCampus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JRadioButton radOffCamp;
    private javax.swing.JRadioButton radOnCamp;
    private javax.swing.JTextField txtAccomodation;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtEcat;
    private javax.swing.JTextField txtEcon112;
    private javax.swing.JTextField txtEcon122;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JButton txtExit;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtIcat;
    private javax.swing.JTextField txtInfs211;
    private javax.swing.JTextField txtInfs212;
    private javax.swing.JTextField txtInfs221;
    private javax.swing.JTextField txtInfs222;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtModules;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JButton txtPrint;
    private javax.swing.JTextArea txtReceipt;
    private javax.swing.JButton txtReset;
    private javax.swing.JTextField txtStfm111;
    private javax.swing.JTextField txtStfm129;
    public static javax.swing.JTextField txtStudentNumber;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTextField txtVat;
    // End of variables declaration//GEN-END:variables
}
