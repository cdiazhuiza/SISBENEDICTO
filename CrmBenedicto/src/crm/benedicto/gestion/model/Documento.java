/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.gestion.model;

import java.util.Date;

public class Documento {
    String Serie;  // 001
    int Numero;    
    String Concepto; // sera BOL o FAC
    Date fechaEmision;
    String Empresa;
    Date FechaVencimiento;
    String Estado;
    
    Double subtotal;
    Double igv;
    Double Total;
    String Moneda;
    Date FechaPago;
    String Observaciones;


    public Documento(String Serie, int Numero, String Concepto, Date fechaEmision, String Empresa, Date FechaVencimiento, String Estado, Double subtotal, Double igv, Double Total, String Moneda, Date FechaPago, String Observaciones) {
        this.Serie = Serie;
        this.Numero = Numero;
        this.Concepto = Concepto;
        this.fechaEmision = fechaEmision;
        this.Empresa = Empresa;
        this.FechaVencimiento = FechaVencimiento;
        this.Estado = Estado;
        this.subtotal = subtotal;
        this.igv = igv;
        this.Total = Total;
        this.Moneda = Moneda;
        this.Observaciones = Observaciones;
        this.FechaPago = FechaPago;
    }

    public String getSerie() {
        return Serie;
    }

    public int getNumero() {
        return Numero;
    }

    public Date getFechaPago() {
        return FechaPago;
    }

    public String getConcepto() {
        return Concepto;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public Double getIgv() {
        return igv;
    }

    public Double getTotal() {
        return Total;
    }

    public String getMoneda() {
        return Moneda;
    }

    public String getObservaciones() {
        return Observaciones;
    }
}
