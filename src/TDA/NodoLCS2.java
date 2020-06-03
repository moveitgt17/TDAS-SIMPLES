package TDA;

import Clases.Producto;

public class NodoLCS2 {
    private NodoLCS2 siguiente;
    private Producto producto;
    public int posicion;

    public NodoLCS2() {
    }

    public NodoLCS2(NodoLCS2 siguiente, Producto producto) {
        this.siguiente = siguiente;
        this.producto = producto;
        this.posicion = 0;
    }

    /**
     * @return the siguiente
     */
    public NodoLCS2 getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLCS2 siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
}
