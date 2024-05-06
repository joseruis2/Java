
package main;

import clases.Personas_public;


public class Principal_Personas_public {
    public static void main(String[] args) {
        Personas_public p = new Personas_public("jesus","ruiz",20); //objeto
        listar(p);//llama el metodo     
    }
    
    //metodo listar
    public static void listar(Personas_public p){
        imprimir("tu nombre es: "+p.nombre);
        imprimir("tu apellido es: "+p.apellido);
        imprimir("tu edad es: "+p.edad);
    }
    //metodo imprimir
    public static void imprimir(String m){
        System.out.println(m);
    }   
}
