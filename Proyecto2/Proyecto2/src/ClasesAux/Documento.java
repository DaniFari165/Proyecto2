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
public class Documento {
    
    private String nameDoc; 
    private int size; 
    private String type; 

    public Documento(String nameDoc, int size, String type) {
        this.nameDoc = nameDoc;
        this.size = 0;
        this.type = type;
    }
    
    public String askNameDoc() { 
        String nombreDoc = JOptionPane.showInputDialog(null, "Ingrese el nombre de su documento: "); 
        return nombreDoc;     
    }
    
    public Double asksizeDoc() { 
        Double sizeDoc = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tamaño de su documento: "));
        return sizeDoc;
    }
    
    public String askType() { 
        String tipoDoc = JOptionPane.showInputDialog(null, "Ingrese el tipo del documento: "); 
        return tipoDoc; 
    }
} 

