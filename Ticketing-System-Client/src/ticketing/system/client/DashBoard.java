/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketing.system.client;

import java.awt.Color;


public class DashBoard extends javax.swing.JFrame {
    public int idUserLogin;
    
    public DashBoard(){
        initComponents();
    }
    
    public DashBoard(int idUser) {
        this();
        idUserLogin = idUser;
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new keeptoo.KGradientPanel();
        panelLogOut = new javax.swing.JPanel();
        panelLogOutLine = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JLabel();
        panelProfile = new javax.swing.JPanel();
        panelProfileLine = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnProfile = new javax.swing.JLabel();
        panelSaldo = new javax.swing.JPanel();
        panelSaldoLine = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSaldo = new javax.swing.JLabel();
        panelParkir = new javax.swing.JPanel();
        panelParkirLine = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnParkir = new javax.swing.JLabel();
        panelAcaraMain = new javax.swing.JPanel();
        panelAcaraLine = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAcara = new javax.swing.JLabel();
        panelClaimTicket = new javax.swing.JPanel();
        panelClaimTicketLine = new javax.swing.JPanel();
        btnClaimTicket = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelKanan = new javax.swing.JPanel();
        kananAtas = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        panelDasar = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setkEndColor(new java.awt.Color(255, 255, 255));
        menu.setkStartColor(new java.awt.Color(255, 255, 255));
        menu.setPreferredSize(new java.awt.Dimension(300, 786));
        menu.setLayout(null);

        panelLogOut.setBackground(new java.awt.Color(255, 255, 255));
        panelLogOut.setPreferredSize(new java.awt.Dimension(252, 61));

        panelLogOutLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLogOutLineLayout = new javax.swing.GroupLayout(panelLogOutLine);
        panelLogOutLine.setLayout(panelLogOutLineLayout);
        panelLogOutLineLayout.setHorizontalGroup(
            panelLogOutLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        panelLogOutLineLayout.setVerticalGroup(
            panelLogOutLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit.png"))); // NOI18N

        btnLogOut.setBackground(new java.awt.Color(0, 0, 0));
        btnLogOut.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(102, 102, 102));
        btnLogOut.setText("Log Out");
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLogOutLayout = new javax.swing.GroupLayout(panelLogOut);
        panelLogOut.setLayout(panelLogOutLayout);
        panelLogOutLayout.setHorizontalGroup(
            panelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogOutLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLogOutLayout.setVerticalGroup(
            panelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLogOutLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelLogOutLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogOutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(panelLogOut);
        panelLogOut.setBounds(20, 700, 252, 61);

        panelProfile.setBackground(new java.awt.Color(255, 255, 255));
        panelProfile.setPreferredSize(new java.awt.Dimension(252, 61));

        panelProfileLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelProfileLineLayout = new javax.swing.GroupLayout(panelProfileLine);
        panelProfileLine.setLayout(panelProfileLineLayout);
        panelProfileLineLayout.setHorizontalGroup(
            panelProfileLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        panelProfileLineLayout.setVerticalGroup(
            panelProfileLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N

        btnProfile.setBackground(new java.awt.Color(0, 0, 0));
        btnProfile.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(102, 102, 102));
        btnProfile.setText("Profile");
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProfileMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelProfileLayout = new javax.swing.GroupLayout(panelProfile);
        panelProfile.setLayout(panelProfileLayout);
        panelProfileLayout.setHorizontalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProfileLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProfileLayout.setVerticalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelProfileLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfileLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(panelProfile);
        panelProfile.setBounds(20, 340, 252, 61);

        panelSaldo.setBackground(new java.awt.Color(255, 255, 255));
        panelSaldo.setPreferredSize(new java.awt.Dimension(252, 61));

        panelSaldoLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelSaldoLineLayout = new javax.swing.GroupLayout(panelSaldoLine);
        panelSaldoLine.setLayout(panelSaldoLineLayout);
        panelSaldoLineLayout.setHorizontalGroup(
            panelSaldoLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        panelSaldoLineLayout.setVerticalGroup(
            panelSaldoLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wallet.png"))); // NOI18N

        btnSaldo.setBackground(new java.awt.Color(0, 0, 0));
        btnSaldo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSaldo.setForeground(new java.awt.Color(102, 102, 102));
        btnSaldo.setText("Saldo");
        btnSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaldoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaldoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaldoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSaldoLayout = new javax.swing.GroupLayout(panelSaldo);
        panelSaldo.setLayout(panelSaldoLayout);
        panelSaldoLayout.setHorizontalGroup(
            panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSaldoLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSaldoLayout.setVerticalGroup(
            panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaldoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSaldoLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelSaldoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaldoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(panelSaldo);
        panelSaldo.setBounds(20, 270, 252, 61);

        panelParkir.setBackground(new java.awt.Color(255, 255, 255));
        panelParkir.setPreferredSize(new java.awt.Dimension(252, 61));

        panelParkirLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelParkirLineLayout = new javax.swing.GroupLayout(panelParkirLine);
        panelParkirLine.setLayout(panelParkirLineLayout);
        panelParkirLineLayout.setHorizontalGroup(
            panelParkirLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        panelParkirLineLayout.setVerticalGroup(
            panelParkirLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/parking.png"))); // NOI18N

        btnParkir.setBackground(new java.awt.Color(0, 0, 0));
        btnParkir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnParkir.setForeground(new java.awt.Color(102, 102, 102));
        btnParkir.setText("Parkir");
        btnParkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnParkirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParkirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParkirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelParkirLayout = new javax.swing.GroupLayout(panelParkir);
        panelParkir.setLayout(panelParkirLayout);
        panelParkirLayout.setHorizontalGroup(
            panelParkirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParkirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelParkirLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelParkirLayout.setVerticalGroup(
            panelParkirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelParkirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelParkirLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelParkirLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelParkirLayout.createSequentialGroup()
                .addComponent(btnParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(panelParkir);
        panelParkir.setBounds(20, 200, 252, 61);

        panelAcaraMain.setBackground(new java.awt.Color(255, 255, 255));

        panelAcaraLine.setBackground(new java.awt.Color(255, 255, 255));
        panelAcaraLine.setPreferredSize(new java.awt.Dimension(8, 37));

        javax.swing.GroupLayout panelAcaraLineLayout = new javax.swing.GroupLayout(panelAcaraLine);
        panelAcaraLine.setLayout(panelAcaraLineLayout);
        panelAcaraLineLayout.setHorizontalGroup(
            panelAcaraLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        panelAcaraLineLayout.setVerticalGroup(
            panelAcaraLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calendar.png"))); // NOI18N

        btnAcara.setBackground(new java.awt.Color(0, 0, 0));
        btnAcara.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnAcara.setForeground(new java.awt.Color(102, 102, 102));
        btnAcara.setText("Acara");
        btnAcara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcaraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcaraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcaraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAcaraMainLayout = new javax.swing.GroupLayout(panelAcaraMain);
        panelAcaraMain.setLayout(panelAcaraMainLayout);
        panelAcaraMainLayout.setHorizontalGroup(
            panelAcaraMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcaraMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcaraLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAcara, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAcaraMainLayout.setVerticalGroup(
            panelAcaraMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(panelAcaraMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcaraLine, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnAcara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.add(panelAcaraMain);
        panelAcaraMain.setBounds(21, 127, 252, 61);

        panelClaimTicket.setBackground(new java.awt.Color(255, 255, 255));
        panelClaimTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelClaimTicketMouseClicked(evt);
            }
        });

        panelClaimTicketLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelClaimTicketLineLayout = new javax.swing.GroupLayout(panelClaimTicketLine);
        panelClaimTicketLine.setLayout(panelClaimTicketLineLayout);
        panelClaimTicketLineLayout.setHorizontalGroup(
            panelClaimTicketLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        panelClaimTicketLineLayout.setVerticalGroup(
            panelClaimTicketLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        btnClaimTicket.setBackground(new java.awt.Color(0, 0, 0));
        btnClaimTicket.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnClaimTicket.setForeground(new java.awt.Color(102, 102, 102));
        btnClaimTicket.setText("Claim Ticket");
        btnClaimTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClaimTicketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClaimTicketMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClaimTicketMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ClaimTicket.png"))); // NOI18N

        javax.swing.GroupLayout panelClaimTicketLayout = new javax.swing.GroupLayout(panelClaimTicket);
        panelClaimTicket.setLayout(panelClaimTicketLayout);
        panelClaimTicketLayout.setHorizontalGroup(
            panelClaimTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaimTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelClaimTicketLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClaimTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClaimTicketLayout.setVerticalGroup(
            panelClaimTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaimTicketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClaimTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClaimTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClaimTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelClaimTicketLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        menu.add(panelClaimTicket);
        panelClaimTicket.setBounds(10, 410, 260, 60);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        panelKanan.setLayout(new java.awt.BorderLayout());

        kananAtas.setBackground(new java.awt.Color(153, 255, 153));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1096, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kananAtasLayout = new javax.swing.GroupLayout(kananAtas);
        kananAtas.setLayout(kananAtasLayout);
        kananAtasLayout.setHorizontalGroup(
            kananAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kananAtasLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kananAtasLayout.setVerticalGroup(
            kananAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelKanan.add(kananAtas, java.awt.BorderLayout.PAGE_START);

        panelDasar.setBackground(new java.awt.Color(255, 255, 255));

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelDasarLayout = new javax.swing.GroupLayout(panelDasar);
        panelDasar.setLayout(panelDasarLayout);
        panelDasarLayout.setHorizontalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelDasarLayout.setVerticalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelKanan.add(panelDasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelKanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcaraMouseClicked
        panelAcaraMain.setBackground(new Color(0,102,153));
        panelAcaraLine.setBackground(new Color(255,255,255));
        btnAcara.setForeground(new Color(255,255,255));
        
        panelMain.removeAll();
        panelMain.add(new FormAcara(this, idUserLogin));        
        panelMain.revalidate();
    }//GEN-LAST:event_btnAcaraMouseClicked

    private void btnAcaraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcaraMouseEntered
        panelAcaraMain.setBackground(new Color(0,102,153));
        panelAcaraLine.setBackground(new Color(255,255,255));
        btnAcara.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAcaraMouseEntered

    private void btnAcaraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcaraMouseExited
        panelAcaraMain.setBackground(new Color(255,255,255));
        panelAcaraLine.setBackground(new Color(255,255,255));
        btnAcara.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnAcaraMouseExited

    private void btnSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaldoMouseClicked
        panelSaldo.setBackground(new Color(0,102,153));
        panelSaldoLine.setBackground(new Color(255,255,255));
        btnSaldo.setForeground(new Color(255,255,255));
        
        panelMain.removeAll();
        panelMain.add(new FormSaldo(this,idUserLogin));        
        panelMain.revalidate();
    }//GEN-LAST:event_btnSaldoMouseClicked

    private void btnSaldoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaldoMouseEntered
        panelSaldo.setBackground(new Color(0,102,153));
        panelSaldoLine.setBackground(new Color(255,255,255));
        btnSaldo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSaldoMouseEntered

    private void btnSaldoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaldoMouseExited
        panelSaldo.setBackground(new Color(255,255,255));
        panelSaldoLine.setBackground(new Color(255,255,255));
        btnSaldo.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnSaldoMouseExited

    private void btnParkirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParkirMouseClicked
        panelParkir.setBackground(new Color(0,102,153));
        panelParkirLine.setBackground(new Color(255,255,255));
        btnParkir.setForeground(new Color(255,255,255));
        
        panelMain.removeAll();
        panelMain.add(new FormParkir(this));        
        panelMain.revalidate();
    }//GEN-LAST:event_btnParkirMouseClicked

    private void btnParkirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParkirMouseEntered
        panelParkir.setBackground(new Color(0,102,153));
        panelParkirLine.setBackground(new Color(255,255,255));
        btnParkir.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnParkirMouseEntered

    private void btnParkirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParkirMouseExited
        panelParkir.setBackground(new Color(255,255,255));
        panelParkirLine.setBackground(new Color(255,255,255));
        btnParkir.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnParkirMouseExited

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        panelProfile.setBackground(new Color(0,102,153));
        panelProfileLine.setBackground(new Color(255,255,255));
        btnProfile.setForeground(new Color(255,255,255));
        
        panelMain.removeAll();
        panelMain.add(new FormProfileUser(this,idUserLogin));        
        panelMain.revalidate();
    }//GEN-LAST:event_btnProfileMouseClicked

    private void btnProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseEntered
        panelProfile.setBackground(new Color(0,102,153));
        panelProfileLine.setBackground(new Color(255,255,255));
        btnProfile.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnProfileMouseEntered

    private void btnProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseExited
        panelProfile.setBackground(new Color(255,255,255));
        panelProfile.setBackground(new Color(255,255,255));
        btnProfile.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnProfileMouseExited

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        panelLogOut.setBackground(new Color(0,102,153));
        panelLogOutLine.setBackground(new Color(255,255,255));
        btnLogOut.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseEntered
        panelLogOut.setBackground(new Color(0,102,153));
        panelLogOutLine.setBackground(new Color(255,255,255));
        btnLogOut.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnLogOutMouseEntered

    private void btnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseExited
        panelLogOut.setBackground(new Color(255,255,255));
        panelLogOutLine.setBackground(new Color(255,255,255));
        btnLogOut.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnLogOutMouseExited

    private void btnClaimTicketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClaimTicketMouseEntered
        panelClaimTicket.setBackground(new Color(0,102,153));
        panelClaimTicketLine.setBackground(new Color(255,255,255));
        btnClaimTicket.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnClaimTicketMouseEntered

    private void btnClaimTicketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClaimTicketMouseExited
        panelClaimTicket.setBackground(new Color(255,255,255));
        panelClaimTicketLine.setBackground(new Color(255,255,255));
        btnClaimTicket.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnClaimTicketMouseExited

    private void panelClaimTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClaimTicketMouseClicked
//        panelClaimTicket.setBackground(new Color(0,102,153));
//        panelClaimTicket.setBackground(new Color(255,255,255));
//        btnClaimTicket.setForeground(new Color(255,255,255));
//        
//        panelMain.removeAll();
//        panelMain.add(new FormClaimTicket(this, idUserLogin));        
//        panelMain.revalidate();
    }//GEN-LAST:event_panelClaimTicketMouseClicked

    private void btnClaimTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClaimTicketMouseClicked
        // TODO add your handling code here:
        panelClaimTicket.setBackground(new Color(0,102,153));
        panelClaimTicket.setBackground(new Color(255,255,255));
        btnClaimTicket.setForeground(new Color(255,255,255));
        
        panelMain.removeAll();
        panelMain.add(new FormClaimTicket(this, idUserLogin));        
        panelMain.revalidate();
    }//GEN-LAST:event_btnClaimTicketMouseClicked

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAcara;
    private javax.swing.JLabel btnClaimTicket;
    private javax.swing.JLabel btnLogOut;
    private javax.swing.JLabel btnParkir;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JLabel btnSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel kananAtas;
    private keeptoo.KGradientPanel menu;
    private javax.swing.JPanel panelAcaraLine;
    private javax.swing.JPanel panelAcaraMain;
    private javax.swing.JPanel panelClaimTicket;
    private javax.swing.JPanel panelClaimTicketLine;
    private javax.swing.JPanel panelDasar;
    private javax.swing.JPanel panelKanan;
    private javax.swing.JPanel panelLogOut;
    private javax.swing.JPanel panelLogOutLine;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelParkir;
    private javax.swing.JPanel panelParkirLine;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JPanel panelProfileLine;
    private javax.swing.JPanel panelSaldo;
    private javax.swing.JPanel panelSaldoLine;
    // End of variables declaration//GEN-END:variables

}
