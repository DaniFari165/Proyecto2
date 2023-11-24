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
public class Lista {
    private Nodo pFirst; 
    private Nodo pLast;  
    private int size; 
    
    public Lista() {
        this.pFirst = null; 
        this.pLast = null; 
        this.size = 0;
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty() {
        return getpFirst() == null; 
                
    }
    
    public void empty() { 
        this.setpFirst(null); 
        this.setpLast(null); 
        this.setSize(0); 
    }
    
    public void addFinal (Object data) { 
        Nodo nuevo = new Nodo(data); 
        if (isEmpty()) { 
            pFirst = nuevo; 
            pLast = nuevo; 
        }else { 
            Nodo aux = pLast; 
            aux.setRson(nuevo);
            pLast = nuevo; 
        }size = +1; 
    } 
}
