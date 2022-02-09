/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_ventas.Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author drhc
 */
public class Conector {
    
    
    public Connection Conexion() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbventas","root","");
                 
            } catch (SQLException ex) {
                Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       return connection;
        
    }
    
    
    
    
}
