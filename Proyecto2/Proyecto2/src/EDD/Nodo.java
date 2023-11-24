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
public class Nodo {
    
    private Object element; 
    private Nodo Lson; 
    private Nodo Rson; 

    public Nodo(Object element, Nodo Lson, Nodo Rson) {
        this.element = element;
        this.Lson = Lson;
        this.Rson = Rson;
    }

    public Nodo(Object element) { 
        this.element = element; 
        this.Lson = null; 
        this.Rson = null;         
    }
    
    /**
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * @return the Lson
     */
    public Nodo getLson() {
        return Lson;
    }

    /**
     * @param Lson the Lson to set
     */
    public void setLson(Nodo Lson) {
        this.Lson = Lson;
    }

    /**
     * @return the Rson
     */
    public Nodo getRson() {
        return Rson;
    }

    /**
     * @param Rson the Rson to set
     */
    public void setRson(Nodo Rson) {
        this.Rson = Rson;
    }
}
