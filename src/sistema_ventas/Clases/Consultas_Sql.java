package sistema_ventas.Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP Envy
 */
public class Consultas_Sql {
    public final String INSERT_USER="insert into tbl_user(nombre,apellido,correo,contrasenia) value(?,?,?,?)"; 
    public final String DELETE_USER="DELETE FROM tbl_user WHERE id=";
    public final String READ_USER="Select*from tbl_user WHERE";
    public final String  INSERT_ROL="insert into tbl_rol(rol,descripcion) value(?,?)";

    public String getINSERT_ROL() {
        return INSERT_ROL;
    }
    
   
    public String getREAD_USER() {
        return READ_USER;
    }
    public Consultas_Sql() {
    }

    public String getDELETE_USER() {
        return DELETE_USER;
    }

    public  String getINSERT_USER() {
        return INSERT_USER;
    }
    
}
