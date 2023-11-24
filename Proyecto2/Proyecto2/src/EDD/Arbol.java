/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author drali
 */
public class Arbol {
    private Nodo pRoot; 

    public Arbol(Nodo pRoot) {
        this.pRoot = pRoot;
    }

    public void create (Object data){
        Nodo newNodo = new Nodo(data, null, null); 
        setpRoot(newNodo); 
    }
            
    /**
     * @return the pRoot
     */
    public Nodo getpRoot() {
        return pRoot;
    }

    public void empty( ){ 
        this.pRoot = null; 
    }
    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(Nodo pRoot) {
        this.pRoot = pRoot;
    }
    
    public boolean isEmpty() {
        return pRoot == null;
    }   
   
    public void deleteMin(){ 
        
        
    }
    
    public void insert() { 
        
        
    }
}
