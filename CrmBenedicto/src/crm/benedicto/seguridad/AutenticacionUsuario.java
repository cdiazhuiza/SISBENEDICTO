/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.benedicto.seguridad;

/**
 *
 * @author Cesar
 */
public class AutenticacionUsuario {
    
    public int validacionUsuario(String usuario,String contrasena){
        if(usuario.equals("cdiaz") && contrasena.equals("carlos"))
            return 1;
        return 0;
    }
    
}
