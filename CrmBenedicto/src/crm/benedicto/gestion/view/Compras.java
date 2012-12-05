/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.gestion.view;

import crm.benedicto.gestion.controler.DocumentoTotales;

import java.util.Date;

public class Compras {

    public static void main(String[] args) {

     DocumentoTotales DocumentoTotales = new DocumentoTotales();   
     Date Fecha1 = new Date();
     Fecha1.setDate(1);
     Fecha1.setMonth(5);
     Fecha1.setYear(2012);

     DocumentoTotales.IngresarDocumento("002",1,"BOL",Fecha1,"Grupo Romero SAC",Fecha1,"nuevo",100.00,19.00,119.00,"Soles",Fecha1,"");
     DocumentoTotales.IngresarDocumento("002",2,"BOL",Fecha1,"Ripley SA",Fecha1,"nuevo",200.00,38.00,238.00,"Soles",Fecha1,"");
     DocumentoTotales.IngresarDocumento("002",1,"FAC",Fecha1,"Boticas BTL",Fecha1,"nuevo",200.00,19.00,119.00,"Soles",Fecha1,"");
     DocumentoTotales.IngresarDocumento("001",3,"",Fecha1,"Alicorp SAC",Fecha1,"nuevo",200.00,38.00,238.00,"",Fecha1,"");

     System.out.print("\n\rDocumentos Compras Registrados  : " + DocumentoTotales.Totaldocumentos());

     System.out.print("\n\rRealizando busqueda en Compras por Filtro: BOL" );
     DocumentoTotales.BuscarDocumentos("BOL");
    }
}