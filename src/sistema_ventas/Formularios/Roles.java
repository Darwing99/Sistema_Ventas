/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema_ventas.Formularios;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import sistema_ventas.Clases.Clase_Rol;
import sistema_ventas.Clases.Conector;
import sistema_ventas.Clases.Consultas_Sql;

/**
 *
 * @author HP Envy
 */
public class Roles extends javax.swing.JFrame {

    Conector conector = new Conector();
    Consultas_Sql sql = new Consultas_Sql();
    Clase_Rol rol;

    /**
     * Creates new form Roles
     */
    public Roles() {
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
        txt_descripcion = new rojeru_san.RSMTextFull();
        txt_rol = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        btn_guardar_rol = new rojeru_san.RSButton();
        jLabel3 = new javax.swing.JLabel();
        txt_alerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Roles de Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 200, -1));
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));
        jPanel1.add(txt_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        btn_guardar_rol.setText("Guardar");
        btn_guardar_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_rolActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 250, -1));

        jLabel3.setText("Rol");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        txt_alerta.setBackground(new java.awt.Color(255, 255, 255));
        txt_alerta.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(txt_alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 250, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_rolActionPerformed
        guardarRol();
    }//GEN-LAST:event_btn_guardar_rolActionPerformed

    /**
     * @param args the command line arguments
     */
    public void guardarRol() {
        rol = new Clase_Rol(
                txt_rol.getText(),
                txt_descripcion.getText()
        );
        if(rol.getRol().isEmpty()){
             txt_alerta.setForeground(Color.RED);
            txt_alerta.setText("Rol vacio");
            return;
        }
        if(rol.getDescripcion().isEmpty()){
             txt_alerta.setForeground(Color.RED);
            txt_alerta.setText("descripcion vacia");
            
        }else{
            try {
                PreparedStatement prepared=conector.Conexion().prepareStatement(sql.INSERT_ROL);
                prepared.setString(1, rol.getRol());
                prepared.setString(2, rol.getDescripcion());
                int estado=prepared.executeUpdate();
                if(estado==1){
                    txt_alerta.setForeground(Color.GREEN);
                    txt_alerta.setText("Rol guardado"); 
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Roles.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

    }

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
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Roles().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btn_guardar_rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_alerta;
    private rojeru_san.RSMTextFull txt_descripcion;
    private rojeru_san.RSMTextFull txt_rol;
    // End of variables declaration//GEN-END:variables
}