package TDA;

import Clases.Oferta;

public class NodoP {
    NodoP siguiente;    
    Oferta dato;
    int posicion;

    public NodoP() {
    }

    public NodoP(Oferta oferta) {
        siguiente = this;
        this.dato = oferta;
        this.posicion = 0;
    }
    
    
}
