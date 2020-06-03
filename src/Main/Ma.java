package Main;

import Clases.Factura;
import Clases.Oferta;
import Clases.Producto;
import Clases.Usuario;
import TDA.ListaCircular;
import TDA.ListaCircularDoble;
import TDA.ListaSimple;
import TDA.NodoLS;
import TDA.Pila;
import TDA.PriorityQueue;
import java.io.IOException;

public class Ma {

    public static void main(String args[]) {
        ListaCircularDoble l = new ListaCircularDoble();
        Producto p = new Producto("nombre", "des", 45120, 852, "fasdf");
        Producto p1 = new Producto("nombre1", "des", 45120, 852, "fasdf");
        Producto p2 = new Producto("nombre2", "des", 45120, 852, "fasdf");
        Producto p3 = new Producto("nombre3", "des", 45120, 852, "fasdf");
        Producto p4 = new Producto("nombre4", "des", 45120, 852, "fasdf");
        Producto p5 = new Producto("nombre5", "des", 45120, 852, "fasdf");

        l.ingresar(p);
        l.ingresar(p1);
        l.ingresar(p2);
        l.ingresar(p3);
        l.ingresar(p4);
        l.ingresar(p5);
        l.imprimir();
        
        l.elim();
        l.imprimir();
        
        l.buscar("nombre5");
        System.out.println(l.tamaño);
    }

}
