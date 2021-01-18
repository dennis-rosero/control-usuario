/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_usuario;
import javax.swing.JOptionPane;
/**
 *
 * @author Master
 */
public class Seguridad {
    Frm_Usuario login = new Frm_Usuario();
    String res;
    
    public void validarUsuario(String[] usuarios, String User, String password, int intentos){
        boolean encontrado=false;
       
        for (int i=0; i<usuarios.length; i++) {
            if((usuarios[i].equalsIgnoreCase(User) && usuarios[i+1].equals(password))){
              res="Bienvenido"  + User;
              encontrado = true;
              JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
              intentos=0;
              Frm_Usuario.setIntentos(intentos);
              new Frm_Principal().setVisible(true);
              break;
            }
        } //fin del for
        
        if (encontrado==false){
            res = "clave y/o usuario erroneos van" + intentos + "intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);                
        }
        
        if (intentos > 2 ){
            JOptionPane.showMessageDialog(null, "3 intentos erroneos, se bloquea", "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);    
        }
    } 
}
