package TDA;

import Clases.Producto;

public class ListaCircularDoble {
    public NodoLCD primero;
    public int tamaño;

    public ListaCircularDoble() {
        tamaño = 0;
        primero = null;
    }
    
    public void ingresar(Producto x){
        NodoLCD nuevo = new NodoLCD();
       
        nuevo.dato = x;
         nuevo.dato.setIdentificador(tamaño+1);
        if(estaVacia()){
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = primero;
            tamaño++;
        }else{
            NodoLCD aux = primero;
             while (aux.siguiente != primero) {
                aux = aux.siguiente;
            }
             aux.siguiente = nuevo;
             nuevo.siguiente = primero;
             nuevo.anterior = aux;
             aux = nuevo;
             primero.anterior = aux;
             tamaño++;
        }
    }
    
    public boolean estaVacia(){
        return primero==null;
    }
    
    public void imprimir(){
       
        NodoLCD actual = primero;
      if(!estaVacia()){
          do{
            System.out.println(actual.dato);
            actual = actual.siguiente;  
        }while(actual!=primero);
      }else{
          System.out.println("lista vacia");
      }
        
    
    }
    
    public void buscar(String x){
       NodoLCD aux = primero;
       boolean encontrado = false;
       if(estaVacia()){
           System.out.println("Lista Vacia");
       }else{
          while (aux.siguiente!=primero){
            aux = aux.siguiente; 
       }

           NodoLCD actual = aux;
           do {
               if(actual.dato.getNombre().equals(x)){
                   encontrado = true;
               }
               actual = actual.anterior;
           } while (actual != aux);
           
           if(encontrado){
               System.out.println("nodo encontrado");
           }else{
               System.out.println("nodo no encontrado");
           }
       }
       
    }
    
     public Producto buscarProducto(int x){
          NodoLCD aux = primero;
       boolean encontrado = false;
       if(estaVacia()){
           System.out.println("Lista Vacia");
       }else{
          while (aux.siguiente!=primero){
            aux = aux.siguiente; 
       }

           NodoLCD actual = primero;
           do {
               actual = actual.anterior;
           } while (actual.dato.getIdentificador()!=x);
           encontrado = actual.dato.getIdentificador() ==x;
           if(encontrado){
               return actual.dato;
           }else{
               System.out.println("Nodo encontrado"); 
           }
           
       }
       return null;
    }
     
     public void elim(){
         
         this.primero = null;
     }
    
 
}
