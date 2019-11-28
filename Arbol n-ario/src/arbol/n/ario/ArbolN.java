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
public class ArbolN {
    
    private nodo raiz;
    
    public void crearArbol(ArrayList<Integer> indices) {
        raiz = new nodo(-1, null, -1);
        crear(raiz, indices, 0);
    }
    
    private void crear(nodo padre, ArrayList<Integer> indices, int nivel) {
        
        if (indices.size() > nivel) {
            for (int i = 0; i < indices.get(nivel); i++) {
                nodo nuevo = new nodo(i, padre, nivel);
                padre.hijos.add(nuevo);
                crear(nuevo, indices, nivel + 1);
            }
        }
    }
    
    public void print() {
        printArbol(raiz);
    }
    
    
    private void printArbol(nodo padre) {
        System.out.println("Celda: " + padre.getDato() + " Nivel: " + padre.getNivel());
        padre.hijos.forEach((hijo) -> {
            printArbol(hijo);
        });
    }
}
