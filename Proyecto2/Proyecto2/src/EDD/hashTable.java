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
public class hashTable {
    
    public int hashFunction(String nombre) {
    int key = 0; 
    char [] usuario = nombre.toCharArray(); 
    for (int i = 0; i < usuario.length; i++) { 
        int value = usuario[i]*i+1;
        key = (value + key)%2069;
        
    }return key ; 
           
}
}
