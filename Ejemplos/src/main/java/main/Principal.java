
package main;

import clases.Personas;

public class Principal {

    
    public static void main(String[] args) {
        
        Personas p = new Personas(18,"jose","ruiz");
        listar(p);
    }
    
    public static void listar(Personas p){
        imprimir("tu edad es: "+p.getEdad());
        imprimir("tu nombre es: "+p.getNombre());
        imprimir("tu apellido es: "+p.getApellido());   
    }
    
    public static void imprimir(String m){
        System.out.println(m);
    }   
}
