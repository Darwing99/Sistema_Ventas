/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

/**
 *
 * @author HP Envy
 */
public class Ventas extends javax.swing.JPanel {

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Fact");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 40, 50, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ventas ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 41, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("23-11-2021");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1336, 41, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("000102220323");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Cliente"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Apellido Cliente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 290, 30));

        jLabel8.setText("Id Cliente");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 39, -1, 30));

        jTextField4.setEditable(false);
        jTextField4.setText("sdfds");
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 120, 30));

        jLabel9.setText("Nombre Cliente");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 30));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 290, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 100, 1430, 110));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de producto"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Factura");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 180, 90, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Descripción", "Cantidad", "Precio", "ISV", "Descuento", "Subtotal", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1260, 110));

        jButton3.setText("Modificar");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 90, -1));

        jButton4.setText("Eliminar");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 70, 90, -1));

        jTextField16.setEditable(false);
        jPanel3.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 160, 40));

        jTextField19.setEditable(false);
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, 160, 40));

        jTextField20.setEditable(false);
        jPanel3.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 160, 40));

        jTextField21.setEditable(false);
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 150, 40));

        jTextField22.setEditable(false);
        jPanel3.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 160, 40));

        jTextField23.setEditable(false);
        jPanel3.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 160, 40));

        jButton5.setText("Vender");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 110, 90, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 1430, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de producto"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Descripción");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 40));

        jTextField11.setEditable(false);
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 550, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setToolTipText("Seleccionar Producto");
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 240, 40));

        jLabel16.setText("Cantidad");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 50, 40));
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 70, 40));

        jLabel17.setText("Precio");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, 40));

        jTextField13.setEditable(false);
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 90, 40));

        jLabel18.setText("SubTotal");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 60, 40));

        jTextField14.setEditable(false);
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 100, 40));

        jLabel19.setText("ISV");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 20, 40));

        jTextField15.setEditable(false);
        jPanel4.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 70, 40));

        jLabel20.setText("Total");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 40, 40, 40));

        jLabel21.setText("ID Producto");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jTextField17.setEditable(false);
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 110, 40));

        jButton2.setText("Agregar");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 110, 90, -1));

        jTextField18.setEditable(false);
        jPanel4.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 40, 100, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 1430, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}