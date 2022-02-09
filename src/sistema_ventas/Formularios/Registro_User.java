/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema_ventas.Formularios;

import java.security.NoSuchAlgorithmException;
import sistema_ventas.Clases.Consultas_Sql;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema_ventas.Clases.Conector;
import sistema_ventas.Clases.Consultas;
import sistema_ventas.Clases.HashTextTest;
import sistema_ventas.Clases.Validar_User;

/**
 *
 * @author Darwing
 */
public final class Registro_User extends javax.swing.JFrame {

    HashTextTest hash = new HashTextTest();
    Conector connector = new Conector();
    Validar_User validar;
    Consultas consultas = new Consultas();
    Consultas_Sql sql = new Consultas_Sql();
    ArrayList<String> tipo_rol = null;

    public Registro_User() {
        initComponents();

        progressbar.setVisible(false);
        mostrarRol();
        mostrarUser("");

    }

    public void mostrarRol() {
        tipo_rol = new ArrayList<>();
        tipo_rol = consultas.getListaRol();

        tipo_rol.forEach(data -> {
            cbb_rol.addItem(data);

        });

    }

    
    
    public void mostrarUser(String busqueda) {
        LinkedList<Validar_User> users = new LinkedList<Validar_User>();
        users = consultas.getListaUser(busqueda);
        DefaultTableModel model = (DefaultTableModel) tbl_user.getModel();
        model.setNumRows(0);
        for (int i = 0; i < users.size(); i++) {
            Object[] row = {
                users.get(i).getId(),
                users.get(i).getNombre(),
                users.get(i).getApellido(),
                users.get(i).getCorreo(),
                users.get(i).getRol()
            };
            model.addRow(row);
        }

    }

    public void guardarDatos() throws NoSuchAlgorithmException {
        progressbar.setVisible(true);
        String item = cbb_rol.getSelectedItem().toString();
        System.out.print(String.valueOf(consultas.RolUser(item)));
        validar = new Validar_User(
                0,
                txt_nombre.getText(),
                txt_apellido.getText(),
                txt_correo.getText(),
                String.valueOf(
                        txt_contrasenia.getPassword()
                ),
                String.valueOf(
                        txt_conf_contrasenia.getPassword()
                ),
                consultas.RolUser(item)
        );

        if (validar.getNombre().length() == 0) {
            JOptionPane.showMessageDialog(null, "El campo nombre esta vacio", "validacion", JOptionPane.WARNING_MESSAGE);
            return;

        }
        if (validar.getApellido().length() == 0) {
            JOptionPane.showMessageDialog(null, "El campo apellido esta vacio", "validacion", JOptionPane.WARNING_MESSAGE);
            return;

        }
        if (validar.getCorreo().length() == 0) {
            JOptionPane.showMessageDialog(null, "El campo apellido esta vacio", "validacion", JOptionPane.WARNING_MESSAGE);
            return;

        }
        if (validar.getRol() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione Rol", "validacion", JOptionPane.WARNING_MESSAGE);
            return;

        }
        if (validar.getContrasenia().length() > 8) {
            if ((validar.getContrasenia()).equals(validar.getConf_contrasenia())) {
                progressbar.setValue(20);
                try {

                    PreparedStatement prepared = connector.Conexion()
                            .prepareStatement(sql.getINSERT_USER());
                    progressbar.setValue(40);
                    prepared.setInt(1, validar.getId());
                    prepared.setString(2, validar.getNombre());
                    prepared.setString(3, validar.getApellido());
                    prepared.setString(4, validar.getCorreo());
                    prepared.setString(5, hash.sha1(validar.getContrasenia()));
                    prepared.setInt(6, validar.getRol());

                    int valor = prepared.executeUpdate();

                    JOptionPane.showMessageDialog(null, valor == 1 ? "Guardado" : "no guardado", "Registro de usuario", JOptionPane.INFORMATION_MESSAGE);
                    mostrarUser("");
                } catch (SQLException ex) {
                    Logger.getLogger(Registro_User.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contrasenia distinta", "validacion", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Contrasenia muy pequenia", "validacion", JOptionPane.WARNING_MESSAGE);
        }

        progressbar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_correo = new rojeru_san.RSMTextFull();
        txt_nombre = new rojeru_san.RSMTextFull();
        txt_apellido = new rojeru_san.RSMTextFull();
        txt_contrasenia = new rojeru_san.RSMPassView();
        txt_conf_contrasenia = new rojeru_san.RSMPassView();
        btn_guardar = new rojeru_san.RSButtonRiple();
        progressbar = new rojerusan.componentes.RSProgressCircle();
        cbb_rol = new RSMaterialComponent.RSComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        btn_guardar1 = new rojeru_san.RSButtonRiple();
        btn_guardar2 = new rojeru_san.RSButtonRiple();
        txt_busqueda = new rojeru_san.RSMTextFull();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_correo.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo.setPlaceholder("Correo");
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 350, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setPlaceholder("Nombre");
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 350, -1));

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setPlaceholder("Apellido");
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 350, -1));

        txt_contrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txt_contrasenia.setPlaceholder("Contraseña");
        jPanel1.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 350, -1));

        txt_conf_contrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txt_conf_contrasenia.setPlaceholder("Contraseña");
        jPanel1.add(txt_conf_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 350, -1));

        btn_guardar.setText("Guardar Usuario");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));
        jPanel1.add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 110, 90));

        cbb_rol.setBackground(new java.awt.Color(255, 255, 255));
        cbb_rol.setForeground(new java.awt.Color(0, 0, 0));
        cbb_rol.setMaximumRowCount(1000);
        cbb_rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Rol" }));
        cbb_rol.setColorArrow(new java.awt.Color(204, 204, 204));
        cbb_rol.setColorBorde(new java.awt.Color(204, 204, 204));
        cbb_rol.setColorFondo(new java.awt.Color(255, 255, 255));
        cbb_rol.setColorSeleccion(new java.awt.Color(204, 204, 204));
        cbb_rol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbb_rolFocusGained(evt);
            }
        });
        cbb_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_rolActionPerformed(evt);
            }
        });
        jPanel1.add(cbb_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 350, 50));

        tbl_user.setBackground(new java.awt.Color(255, 255, 255));
        tbl_user.setForeground(new java.awt.Color(51, 51, 51));
        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Apellido", "Correo", "Rol"
            }
        ));
        tbl_user.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbl_user);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 850, 110));

        btn_guardar1.setText("Modificar");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 140, -1));

        btn_guardar2.setText("Eliminar");
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 140, -1));

        txt_busqueda.setPlaceholder("Buscar...");
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });
        jPanel1.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        try {
            guardarDatos();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Registro_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void cbb_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_rolActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbb_rolActionPerformed

    private void cbb_rolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbb_rolFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_cbb_rolFocusGained

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar2ActionPerformed

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
         mostrarUser(txt_busqueda.getText());
    }//GEN-LAST:event_txt_busquedaKeyReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro_User().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btn_guardar;
    private rojeru_san.RSButtonRiple btn_guardar1;
    private rojeru_san.RSButtonRiple btn_guardar2;
    private RSMaterialComponent.RSComboBox cbb_rol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.componentes.RSProgressCircle progressbar;
    private javax.swing.JTable tbl_user;
    private rojeru_san.RSMTextFull txt_apellido;
    private rojeru_san.RSMTextFull txt_busqueda;
    private rojeru_san.RSMPassView txt_conf_contrasenia;
    private rojeru_san.RSMPassView txt_contrasenia;
    private rojeru_san.RSMTextFull txt_correo;
    private rojeru_san.RSMTextFull txt_nombre;
    // End of variables declaration//GEN-END:variables
}
