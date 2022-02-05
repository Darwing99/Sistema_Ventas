/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_ventas.Clases;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darwing
 */
public class Consultas {

    Conector conector = new Conector();
    Consultas_Sql sql = new Consultas_Sql(); 

    public Consultas() {

    }

    public boolean consultaUser(String correo, String pass) {
        try {
            Statement statement = conector.Conexion().createStatement();
            ResultSet result = statement.executeQuery(
                    sql.READ_USER + " correo like '" + correo + "' AND contrasenia like '" + pass + "'"
            );
            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
