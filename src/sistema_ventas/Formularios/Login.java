/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema_ventas.Formularios;

import sistema_ventas.Clases.Consultas;
import sistema_ventas.Clases.Validar_User;



/**
 *
 * @author HP Envy
 */
public class Login extends javax.swing.JFrame {
    Consultas consultas=new Consultas();
    Validar_User user=new Validar_User(); 
    /**
     * Creates new form Login
     */
    public Login() {
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

        rSProgressCircleUI1 = new rojerusan.complementos.RSProgressCircleUI();
        jPanel3 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel1 = new javax.swing.JPanel();
        txt_password = new rojeru_san.RSMPassView();
        txt_user = new rojeru_san.RSMTextFull();
        btnInicio = new rojeru_san.RSButtonRiple();
        txt_alerta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel3.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setForeground(new java.awt.Color(102, 102, 102));
        txt_password.setPlaceholder("Password");
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 300, -1));

        txt_user.setBackground(new java.awt.Color(255, 255, 255));
        txt_user.setForeground(new java.awt.Color(102, 102, 102));
        txt_user.setPlaceholder("Usuario");
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 250, 300, -1));

        btnInicio.setBackground(new java.awt.Color(0, 102, 102));
        btnInicio.setForeground(new java.awt.Color(102, 102, 102));
        btnInicio.setText("Iniciar Sesión");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        txt_alerta.setBackground(new java.awt.Color(255, 255, 255));
        txt_alerta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_alerta.setForeground(new java.awt.Color(204, 0, 51));
        txt_alerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt_alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 300, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 420, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 420, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Iniciar();
    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public void Iniciar(){
       user.setCorreo(txt_user.getText());
       user.setContrasenia(String.valueOf(txt_password.getPassword()));
       if(user.getCorreo().isEmpty()){
           txt_alerta.setText("Correo vacio!");
           return;
       }if(user.getContrasenia().isEmpty())
       {
            txt_alerta.setText("contrasenia vacia!");
       }else{
           if(consultas.consultaUser(user.getCorreo(), user.getContrasenia())){
               this.setVisible(false);
               new Dashboard().setVisible(true);
               
           }else{
               txt_alerta.setText("usuario no valido!");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.complementos.RSProgressCircleUI rSProgressCircleUI1;
    private javax.swing.JLabel txt_alerta;
    private rojeru_san.RSMPassView txt_password;
    private rojeru_san.RSMTextFull txt_user;
    // End of variables declaration//GEN-END:variables
}