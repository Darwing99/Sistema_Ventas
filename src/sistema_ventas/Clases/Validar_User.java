/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_ventas.Clases;



/**
 *
 * @author HP Envy
 */
public class Validar_User {
    public int id;
    public String nombre;
    public String apellido;
    public String correo;
    public String contrasenia;
    public String conf_contrasenia;
    public int rol;

    public Validar_User(int id,String nombre, String apellido, String correo, String contrasenia,String conf_contrasenia, int rol) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.conf_contrasenia=conf_contrasenia;
        this.rol=rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public Validar_User() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getConf_contrasenia() {
        return conf_contrasenia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setConf_contrasenia(String conf_contrasenia) {
        this.conf_contrasenia = conf_contrasenia;
    }
    

    
}
