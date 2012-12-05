
package crm.benedicto.gestion.model;

import java.util.Date;

public class Prospecto {
    private int codigo;
    private String nombres;
    private String apellidopaterno;
    private String apellidomaterno;
    private String email;
    private String dni;
    private String telefono;
    private String celular;
    private Date fechadecontacto;

    public Prospecto(int codigo, String nombres, String apellidopaterno, String apellidomaterno, String email, String dni, String telefono, String celular, Date fechadecontacto) {
        this.nombres = nombres;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.celular = celular;
        this.fechadecontacto = fechadecontacto;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFechadecontacto() {
        return fechadecontacto;
    }

    public void setFechadecontacto(Date fechadecontacto) {
        this.fechadecontacto = fechadecontacto;
    }
    
   
}
