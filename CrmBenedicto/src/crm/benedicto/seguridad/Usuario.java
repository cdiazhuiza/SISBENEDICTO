/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.seguridad;

import java.util.Date;

/**
 *
 * @author Cesar
 */
public class Usuario {
    
    private int codUsuario;
    private String DNIIdentificacion;
    private String nombre;
    private String paterno;
    private String materno;
    private String usuario;
    private String correo;
    private Date fecOIngreso;
    private String Cargo;
    private String Rol;
    private String Contrasena;
    private String CongContrasena;

    public Usuario(int codUsuario, String DNIIdentificacion, String nombre, String paterno, String materno, String usuario, String correo, Date fecOIngreso, String Cargo, String Rol, String Contrasena, String CongContrasena) {
        this.codUsuario = codUsuario;
        this.DNIIdentificacion = DNIIdentificacion;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.usuario = usuario;
        this.correo = correo;
        this.fecOIngreso = fecOIngreso;
        this.Cargo = Cargo;
        this.Rol = Rol;
        this.Contrasena = Contrasena;
        this.CongContrasena = CongContrasena;
    }
    
    
    public int getCodUsuario() {
        return codUsuario;
    }


    public String getDNIIdentificacion() {
        return DNIIdentificacion;
    }

    public void setDNIIdentificacion(String DNIIdentificacion) {
        this.DNIIdentificacion = DNIIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecOIngreso() {
        return fecOIngreso;
    }

    public void setFecOIngreso(Date fecOIngreso) {
        this.fecOIngreso = fecOIngreso;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCongContrasena() {
        return CongContrasena;
    }

    public void setCongContrasena(String CongContrasena) {
        this.CongContrasena = CongContrasena;
    }
    
    
    
    
    
    
}
