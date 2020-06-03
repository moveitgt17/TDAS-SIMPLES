package TDA;

import Clases.Producto;

public class NodoLCS {
    int posicion;
    Producto producto;
    NodoLCS siguiente;

    public NodoLCS() {
    }
       
    
    public NodoLCS(Producto p){
        this.producto = p;
        posicion = 0;
        siguiente = this;
    }
}
