package crm.benedicto.gestion.controler;

import crm.benedicto.gestion.model.Prospecto;
import java.util.ArrayList;
import java.util.Date;

public class GestionProspecto {

        private ArrayList<Prospecto> Prospectos = new ArrayList<Prospecto>();
        private ArrayList<Prospecto> ProspectosBusqueda = new ArrayList<Prospecto>();
        
        public void agregar(Prospecto prospecto){
          Prospectos.add(prospecto);
        }
        
        public void IngresarProspecto(int codigo, String nombres, String apellidopaterno,
                String apellidomaterno, String email, String dni, String telefono, String celular, Date fechadecontacto){
            StringBuilder Validacion= new StringBuilder();
            String ProspectoGenerado="";
            
            
     Validacion.append( ValidarString(nombres.toString().trim())? "": "\n  Ingresar Nombres");
     Validacion.append( ValidarString(apellidopaterno.toString().trim())? "": "\n  Ingresar Apellido Paterno");
     Validacion.append( ValidarString(apellidomaterno.toString().trim())? "": "\n  Ingresar Apellido Materno");
     Validacion.append( ValidarString(email.toString().trim())? "": "\n  Ingresar Email");
     Validacion.append( ValidarString(dni)? "": "\n  Ingresar DNI");
     Validacion.append( ValidarString(telefono)? "": "\n  Ingresar Telefono ");
     Validacion.append( ValidarString(celular)? "": "\n  Ingresar Celular ");
     Validacion.append( ValidarFecha(fechadecontacto)? "": "\n  Ingresar Fecha de Contacto");                                                                                                                                                                                                                                                                                                                                                                                                                               
     Validacion.append( "");
     
     if(Validacion.toString().isEmpty()){
       Prospecto prospecto = new Prospecto(codigo,nombres,apellidopaterno,apellidomaterno,email,dni, telefono, celular, fechadecontacto);
       ProspectoGenerado = prospecto.getNombres() +" "+prospecto.getApellidopaterno()+"-"+  prospecto.getApellidomaterno();
       agregar(prospecto);
       System.out.print("Se registró satisfactoriamente el prospecto: " + ProspectoGenerado );
       System.out.print("\n");
     }else{
       System.out.print("\nError al registrar el prospecto, revisar lo siguiente: " + Validacion.toString());
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
        
        public void BuscarNombre(String nombres){
    for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getNombres().equals(nombres)){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
        
        
         public void BuscarApellidoPaterno(String apellidopaterno){
    for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getApellidopaterno().equals(apellidopaterno)){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
         
         public void BuscarApellidoMaterno(String apellidomaterno){
    for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getApellidomaterno().equals(apellidomaterno)){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
        
         
         public void BuscarEmail(String email){
    for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getEmail().equals(email)){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
   
         public void BuscarDNI(String dni){
         for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getDni().equals(dni)){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
         
         
         public void BuscarTelefono(String telefono){
    for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getTelefono().equals(telefono)){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
    
         public void BuscarCelular(String celular){
    for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getCelular().equals( celular)){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
         
         public void BuscarFechadecontacto(Date fechadecontacto){
    for(int i = 0; i< Prospectos.size();i++){
        if(this.Prospectos.get(i).getFechadecontacto() == fechadecontacto){
           ProspectosBusqueda.add(this.Prospectos.get(i));
        }
       }
      }
         
         
}
         
         
         
         

