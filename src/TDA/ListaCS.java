package TDA;

import Clases.Producto;

public class ListaCS {

    NodoLCS2 inicio;
    int tamaño;

    public ListaCS() {
        this.inicio = null;
        this.tamaño = 0;
    }
    
    public boolean isEmpty(){
        return inicio == null;
    }
    
    public void insert(Producto product){
        NodoLCS2 nuevo = new NodoLCS2();
        nuevo.posicion++;
        nuevo.setProducto(product);
        if(isEmpty()){
            this.inicio = nuevo;
            inicio.setSiguiente(inicio);
            tamaño++;
        }else{
            NodoLCS2 aux = inicio;
            while(aux.getSiguiente() != inicio){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            tamaño++;
        }
    }
    
    public void imprimir(){
       
        if(isEmpty()){
            System.out.println("La lista esta vacia");
        }else if(inicio.getSiguiente().equals(inicio)){
            System.out.println("dato:[" + inicio.getProducto().toString() + "]");
        }else if(inicio.getSiguiente() != inicio){
             NodoLCS2 aux = inicio.getSiguiente();
               System.out.println("Prueba: [" + aux.getProducto().toString() + "]");
             while(aux != inicio){
                aux = aux.getSiguiente();
                System.out.println("Prueba: [" + aux.getProducto().toString() + "]");
                
            }
        }
        }

}
