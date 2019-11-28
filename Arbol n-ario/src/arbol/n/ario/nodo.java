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
public class nodo {
    private Object dato;
    private nodo padre;
    public ArrayList<nodo> hijos;
    private int nivel;

    public nodo(Object dato, nodo padre, int nivel) {
        this.dato = dato;
        this.padre = padre;
        this.nivel = nivel;
        this.hijos = new ArrayList<>();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public nodo getPadre() {
        return padre;
    }

    public void setPadre(nodo padre) {
        this.padre = padre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
