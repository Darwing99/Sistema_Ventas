/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_ventas.Clases;

import java.security.NoSuchAlgorithmException;
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
    HashTextTest hash = new HashTextTest();

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

    //metodo para retornar usuarios
    public LinkedList<Validar_User> getListaUser(String busqueda) {
        LinkedList lista = new LinkedList<Validar_User>();

        if (busqueda.isEmpty()) {
            sql_data = sql.getREAD_USER();

        } else {
            sql_data = sql.getREAD_USER() + " WHERE nombre like '%" + busqueda + "%' OR apellido like '%" + busqueda + "%'";
        }

        Validar_User user;
        try {

            PreparedStatement prepared = conector.Conexion().prepareStatement(sql_data);
            ResultSet result = prepared.executeQuery();
            while (result.next()) {
                user = new Validar_User(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        "",
                        "",
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

    public boolean deleteUser(int id) {
        sql_data = sql.getDELETE_USER();
        int estado;
        try {
            PreparedStatement prepared = conector.Conexion().prepareStatement(sql_data);
            prepared.setInt(1, id);
            estado = prepared.executeUpdate();

            return estado == 1;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean saveUpdateUser(int id, String nombre, String apellido, String correo, String password, int rol) throws NoSuchAlgorithmException {
        PreparedStatement prepared;
        try {
            if (id == 0) {
                prepared = conector.Conexion()
                        .prepareStatement(sql.getINSERT_USER());
                prepared.setInt(1, id);
                prepared.setString(2, nombre);
                prepared.setString(3, apellido);
                prepared.setString(4, correo);
                prepared.setString(5, hash.sha1(password));
                prepared.setInt(6, rol);
            } else {
                prepared = conector.Conexion().prepareStatement(sql.getUPDATE_USER());
                prepared.setString(1, nombre);
                prepared.setString(2, apellido);
                prepared.setString(3, correo);
                prepared.setString(4, hash.sha1(password));
                prepared.setInt(5, rol);
                prepared.setInt(6, id);
            }

            return prepared.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
