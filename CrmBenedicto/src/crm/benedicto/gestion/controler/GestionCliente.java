
package crm.benedicto.gestion.controler;

import crm.benedicto.gestion.model.Cliente;
import java.util.ArrayList;
import java.util.Date;

public class GestionCliente {
    
        private ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        private ArrayList<Cliente> ClientesBusqueda = new ArrayList<Cliente>();
        
        public void agregar(Cliente cliente){
            Clientes.add(cliente);
        }
        
        public void IngresarCliente(int codigo, String nombres, String apellidopaterno, String apellidomaterno, String email, int dni, int telefono, int celular, Date fechadecontacto){
            StringBuilder Validacion = new StringBuilder();
            String ClienteGenerado="";
            
            Validacion.append( ValidarString(nombres.toString().trim())? "": "\n  Ingresar Nombres");
            Validacion.append( ValidarString(apellidopaterno.toString().trim())? "": "\n  Ingresar Apellido Paterno");
            Validacion.append( ValidarString(apellidomaterno.toString().trim())? "": "\n  Ingresar Apellido Materno");
            Validacion.append( ValidarString(email.toString().trim())? "": "\n  Ingresar Email");
            Validacion.append( ValidarEntero(dni)? "": "\n  Ingresar DNI");
            Validacion.append( ValidarEntero(telefono)? "": "\n  Ingresar Telefono ");
            Validacion.append( ValidarEntero(celular)? "": "\n  Ingresar Celular ");
            Validacion.append( ValidarFecha(fechadecontacto)? "": "\n  Ingresar Fecha de Contacto");                                                                                                                                                                                                                                       
            Validacion.append( "");
     
            if(Validacion.toString().isEmpty()){
             Cliente cliente = new Cliente(codigo, nombres, apellidopaterno,apellidomaterno, email,dni, telefono, celular, fechadecontacto);
            ClienteGenerado = cliente.getNombres() +" "+cliente.getApellidopaterno()+"-"+  cliente.getApellidomaterno();
            agregar(cliente);
             System.out.print("Se registró satisfactoriamente el cliente: " + ClienteGenerado );
             System.out.print("\n");
           }else{
             System.out.print("\nError al registrar el cliente, revisar lo siguiente: " + Validacion.toString());
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
    
    public boolean ValidarEntero(int Entero){
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
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getNombres().equals(nombres)){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
        
        
         public void BuscarApellidoPaterno(String apellidopaterno){
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getApellidopaterno().equals(apellidopaterno)){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
         
         public void BuscarApellidoMaterno(String apellidomaterno){
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getApellidomaterno().equals(apellidomaterno)){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
        
         
         public void BuscarEmail(String email){
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getEmail().equals(email)){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
   
         public void BuscarDNI(int dni){
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getDni() == dni){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
         
         
         public void BuscarTelefono(int telefono){
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getTelefono() == telefono){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
    
         public void BuscarCelular(int celular){
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getCelular() == celular){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
         
  
         public void BuscarFechadecontacto(Date fechadecontacto){
    for(int i = 0; i< Clientes.size();i++){
        if(this.Clientes.get(i).getFechadecontacto() == fechadecontacto){
           ClientesBusqueda.add(this.Clientes.get(i));
        }
       }
      }
         
        
}
