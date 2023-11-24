/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import ClasesAux.Usuario;
import ClasesAux.Documento; 
import EDD.Lista;
/**
 *
 * @author Daniel Fariña
 */
public class Proyecto2 {
    
        public static boolean isNumeric(String num){ 
    if (num == null){ 
        return false;  
    }try { Integer.parseInt(num);  
            
    }catch (NumberFormatException e) { 
        return false;
    }
    return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Lista usuarios = new Lista(); 
    while (true){
//  Presionas el boton de crear un usuario para accerder
    String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
            nombre = nombre.replaceAll("\\s+", ""); 
            
    String tipoReal = ""; 
    String  tipos [] = {"prioridad_alta","prioridad_media", "prioridad_baja"};   
    int tipo  = Integer.parseInt(JOptionPane.showInputDialog(null, "Para baja prioridad escriba 1, media prioridad escriba 2, alta prioridad escriba 3: ")) - 1;
    while ( tipo >= 1 || tipo <= 3 ) {
        JOptionPane.showMessageDialog(null, "Error, ingrese un valor válido", "Tipo de usuario", 0);
        tipo  = Integer.parseInt(JOptionPane.showInputDialog(null, "Para baja prioridad escriba 1, media prioridad escriba 2, alta prioridad escriba 3: ")) - 1 ;
    }
        switch (tipo) {
            case 0:
                tipoReal = tipos[tipo];
                break;
            case 1:
                tipoReal = tipos[tipo]; 
                break;
            case 2:
                tipoReal= tipos[tipo];
                break;
            default:
                break;
        }
    Usuario user = new Usuario(nombre,tipoReal);
    
    }
}
}


  

