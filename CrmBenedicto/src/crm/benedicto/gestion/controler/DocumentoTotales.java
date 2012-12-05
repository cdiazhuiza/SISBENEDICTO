/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.gestion.controler;

import crm.benedicto.gestion.model.Documento;
import java.util.ArrayList;
import java.util.Date;

public class DocumentoTotales {
    
private ArrayList<Documento> Documentos = new ArrayList<Documento>();
private ArrayList<Documento> DocumentosBusqueda = new ArrayList<Documento>();

     public void agregar(Documento documento){
        Documentos.add(documento);
     }
    
     public void IngresarDocumento(String Serie, int Numero, String Concepto, Date fechaEmision, String Empresa, Date FechaVencimiento, String Estado, Double subtotal, Double igv, Double Total, String Moneda,Date FechaPago, String Observaciones)
     { 
     StringBuilder Validacion= new StringBuilder();
     String DocumentoGenerado="";
     
     Validacion.append( ValidarString(Concepto.toString().trim())? "": "\n  Ingresar Concepto");
     Validacion.append( ValidarString(fechaEmision.toString().trim())? "": "\n  Ingresar Fecha de Emision ");
     Validacion.append( ValidarString(FechaVencimiento.toString().trim())? "": "\n  Ingresar Fecha de Vencimiento");
     Validacion.append( ValidarString(Moneda.toString().trim())? "": "\n  Ingresar Moneda");
     Validacion.append( ValidarFecha(fechaEmision)? "": "\n  Fecha de Emision invalida");
     Validacion.append( ValidarFecha(FechaVencimiento)? "": "\n  Fecha de Vencimiento invalida ");
     Validacion.append( ValidarNumero(subtotal)? "": "\n  Ingresar Subtotal ");
     Validacion.append( ValidarNumero(igv)? "": "\n  Ingresar Igv");
     Validacion.append( ValidarNumero(Total)? "": "\n  Ingresar Total ");
     Validacion.append( "");
     
     if(Validacion.toString().isEmpty()){
       Documento documento = new Documento( Serie,  Numero,  Concepto,  fechaEmision,  Empresa,  FechaVencimiento,  Estado,  subtotal,  igv,  Total,  Moneda, FechaPago,  Observaciones);
       DocumentoGenerado = documento.getConcepto() +" "+documento.getSerie()+"-"+  documento.getNumero();
       agregar(documento);
       System.out.print("Se registró satisfactoriamente el documento: " + DocumentoGenerado );
       System.out.print("\n");
     }else{
       System.out.print("\nError al registrar el documento, revisar lo siguiente: " + Validacion.toString());
     }     
    }
     
     public boolean ValidarString(String Cadena){
        boolean Exito=false;
        Exito = Cadena.equals("")? false:true;
    return Exito;
    }
    
    public boolean ValidarNumero(Double Entero){
        boolean Exito=false;
        Exito = (Entero > 0)? true:false;
    return Exito;
    }
    
   public boolean ValidarFecha(Date Fecha){
        boolean Exito=false;
        int dia,mes;
        dia = Fecha.getDay();
        mes = Fecha.getMonth();
        Exito = (dia > 0 && dia <=31 )? true:false;
        Exito = (mes > 0 && mes <=12 )? true:false; 
    return Exito;
    }
   
   public int Totaldocumentos(){
   return Documentos.size();
   }
   
   public void BuscarDocumentos(String concepto){
    for(int i = 0; i< Documentos.size();i++){
        if(this.Documentos.get(i).getConcepto() == concepto)
        {
           DocumentosBusqueda.add(this.Documentos.get(i));
        }
   }
    
   String espacio ="   ";
   System.out.println("\nNumero doc" +espacio+ "Moneda" +espacio+"Subtotal" +espacio+"Igv" +espacio+ "Total"+espacio+ "Estado");
     for(int i = 0; i< DocumentosBusqueda.size();i++){
       
       System.out.println(DocumentosBusqueda.get(i).getConcepto() +" "+ DocumentosBusqueda.get(i).getSerie() +"-" +
                          DocumentosBusqueda.get(i).getNumero()+ "     " + DocumentosBusqueda.get(i).getMoneda()+"    "+
                          DocumentosBusqueda.get(i).getSubtotal()+"  "+ DocumentosBusqueda.get(i).getIgv()+ "     " +
                          DocumentosBusqueda.get(i).getTotal()+"   "+DocumentosBusqueda.get(i).getEstado());
     }
   }
}
