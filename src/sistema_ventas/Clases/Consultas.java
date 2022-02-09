/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_ventas.Clases;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darwing
 */
public class Consultas {

    String sql_data;

    Conector conector = new Conector();
    Consultas_Sql sql = new Consultas_Sql();

    public Consultas() {

    }

    public ResultSet sentenciasSql(String sql_Data) {

        try {
            Statement statement = conector.Conexion().createStatement();
            ResultSet result = statement.executeQuery(sql_Data);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean consultaUser(String correo, String pass) {
        sql_data = sql.getREAD_USER() + " WHERE correo like '" + correo + "' AND contrasenia like '" + pass + "'";
        try {

            return sentenciasSql(sql_data).next();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public int RolUser(String rol) {
        sql_data = sql.getREAD_ROL() + " where rol like '" + rol + "' and estado like '1'";
        ResultSet res = sentenciasSql(sql_data);

        try {
            while (res.next()) {
                return Integer.parseInt(res.getString("id"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

        return 0;

    }

    public LinkedList<Validar_User> getListaUser() {
        LinkedList lista = new LinkedList<Validar_User>();
        String sql_user = sql.getREAD_USER();
        Validar_User user;
        try {

            PreparedStatement prepared = conector.Conexion().prepareStatement(sql_user);
            ResultSet result = prepared.executeQuery();
            while (result.next()) {
                user = new Validar_User(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(5),
                        result.getInt(6)
                );
                lista.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<String> getListaRol() {
        ArrayList<String> lista = new ArrayList<>();
        sql_data = sql.getREAD_ROL();
        try {

            ResultSet result = sentenciasSql(sql_data);
            while (result.next()) {
                   lista.add(result.getString("rol"));
                   
            }

            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
              return null;
        }
      
    }

}
