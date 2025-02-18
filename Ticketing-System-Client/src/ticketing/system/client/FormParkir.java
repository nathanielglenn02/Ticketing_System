/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ticketing.system.client;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class FormParkir extends javax.swing.JPanel {

    /**
     * Creates new form FormParkir
     */
    DashBoard parent;    
    java.util.List<ticketing.system.client.Parkir> listParkir;
    Parkir selectedParkir;
    public FormParkir(DashBoard p) {
        initComponents();
        parent = p;
        RefreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelParkir = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldLokasi = new javax.swing.JTextField();
        jButtonSlotParkir = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btnParkir = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabelParkir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama", "Lokasi"
            }
        ));
        jTabelParkir.setRowHeight(40);
        jTabelParkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelParkirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelParkir);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nama :");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Lokasi :");

        jTextFieldNama.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldNama.setEnabled(false);

        jTextFieldLokasi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldLokasi.setEnabled(false);

        jButtonSlotParkir.setBackground(new java.awt.Color(0, 51, 51));
        jButtonSlotParkir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSlotParkir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSlotParkir.setText("Lihas Slot Parkir");
        jButtonSlotParkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlotParkirActionPerformed(evt);
            }
        });

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 102, 153));
        kGradientPanel3.setkTransparentControls(false);

        btnParkir.setBackground(new java.awt.Color(255, 255, 255));
        btnParkir.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        btnParkir.setForeground(new java.awt.Color(255, 255, 255));
        btnParkir.setText("Parkir");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(554, 554, 554)
                .addComponent(btnParkir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSlotParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLokasi, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jTextFieldNama))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(293, 293, 293)
                        .addComponent(jButtonSlotParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelParkirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelParkirMouseClicked
        JTable klik = (JTable) evt.getSource();
        int row = klik.getSelectedRow();

        jTextFieldNama.setText(klik.getValueAt(row, 0).toString());
        jTextFieldLokasi.setText(klik.getValueAt(row, 1).toString()); 
        
        selectedParkir = listParkir.get(row);
    }//GEN-LAST:event_jTabelParkirMouseClicked

    private void jButtonSlotParkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlotParkirActionPerformed
        // TODO add your handling code here:
        FormSlotParkir formSlotParkir = new FormSlotParkir(this, selectedParkir);
        formSlotParkir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSlotParkirActionPerformed

    private void RefreshTable()
    {
        listParkir = getParkir();
        jTabelParkir.removeAll();
        
        DefaultTableModel model = (DefaultTableModel) jTabelParkir.getModel();
        model.setRowCount(0);
        Object[] rowData=new Object[2];
        
        for ( ticketing.system.client.Parkir obj : listParkir)
        {            
            ticketing.system.client.Parkir tampung = (ticketing.system.client.Parkir)obj;
            rowData[0]=tampung.getNama();                
            rowData[1]=tampung.getLokasi();                            
            model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnParkir;
    private javax.swing.JButton jButtonSlotParkir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelParkir;
    private javax.swing.JTextField jTextFieldLokasi;
    private javax.swing.JTextField jTextFieldNama;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<ticketing.system.client.Parkir> getParkir() {
        ticketing.system.client.TicketingService_Service service = new ticketing.system.client.TicketingService_Service();
        ticketing.system.client.TicketingService port = service.getTicketingServicePort();
        return port.getParkir();
    }
}
