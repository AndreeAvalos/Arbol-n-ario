/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.n.ario;

import java.util.ArrayList;

/**
 *
 * @author Andree
 */
public class ArbolNArio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglos [] = {1};
        
        ArbolN arreglo = new ArbolN();
        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(10);
        indices.add(10);
        indices.add(10);
        arreglo.crearArbol(indices);
        
        arreglo.print();
    }
    
}
