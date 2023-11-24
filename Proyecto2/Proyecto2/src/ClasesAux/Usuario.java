/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAux;

import javax.swing.JOptionPane;

/**
 *
 * @author drali
 */
public class Usuario {
    private String Nombre; 
    private String Tipo; 

    public Usuario(String Nombre, String Tipo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }
    public boolean isNumeric(String num){ 
        if (num == null){ 
            return false;  
        }try { Integer.parseInt(num);  
            
        }catch (NumberFormatException e) { 
            return false;
        }
        return true;
    }

//    public boolean isAlpha(String word) { 
//        
//    }
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public String askName(){ 
        String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
        nombre = nombre.replaceAll("\\s+", "");
        return nombre;  
    } 

    public String askType(){
        String tipoReal = ""; 
        String  tipos [] = {"prioridad_alta","prioridad_media", "prioridad_baja"};   
        int tipo  = Integer.parseInt(JOptionPane.showInputDialog(null, "Para baja prioridad escriba 1, media prioridad escriba 2, alta prioridad escriba 3: ")) - 1;
        while (tipo < 0 || tipo > 3 ) {
            JOptionPane.showMessageDialog(null, "Error, ingrese un valor válido", "Tipo de usuario", 0);
            tipo  = Integer.parseInt(JOptionPane.showInputDialog(null, "Para baja prioridad escriba 1, media prioridad escriba 2, alta prioridad escriba 3: ")) - 1 ;
    }
        switch(tipo){ 
            case 0: 
                tipoReal = tipos[tipo]; 
            break;
            case 1: 
                tipoReal = tipos[tipo]; 
            break; 
            case 2: 
                tipoReal = tipos[tipo]; 
            break; 
             
        }return tipoReal; 
}
}
