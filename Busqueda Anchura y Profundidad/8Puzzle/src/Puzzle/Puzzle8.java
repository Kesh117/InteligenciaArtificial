package Puzzle;

import java.util.Collection;

public class Puzzle8 {

    public static String estadoInicial = "12578 346";
    public static String estadoFinal = "12345678 ";
    
    public static void main(String[] args) {
    	
    	
        //Instanciar el arbol
        ArbolBusqueda a = new ArbolBusqueda(new Nodo(estadoInicial), estadoFinal);
        //Ejecuta la busqueda

        
        //Anchura
        System.out.println("Busqueda por Anchura");
        a.busquedaPorAnchura();
 
        //Profundidad
        System.out.println("Busqueda por Profundidad");
        a.busquedaPorProfundidad();
 
     
        /*
        Nodo n = new Nodo(estadoInicial);
        Collection<String> c = n.generaHijos();
        c = c;
        */
    }
    
    
    
    
}
