
package main;

import clases.Persona;
import java.util.ArrayList;


public class NewMain {

    
    public static void main(String[] args) {
        // Esto declara que estamos creando un ArrayList que contendrá objetos del tipo Persona
        ArrayList<Persona> personas = new ArrayList<>();
        
        Persona p1 = new Persona("jose",50,"doctor"), //creamos el objeto
                p2 = new Persona("Juan", 30, "Ingeniero"),
                p3 = new Persona("josue",49,"ingeniero"),
                p4 = new Persona("Maria", 25, "Doctora"),
                p5 = new Persona("Pedro", 40, "Abogado");

        // Agregar objetos Persona al ArrayList
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        // Imprimir todas las personas en la lista
        for (Persona persona : personas) {
            System.out.println(persona.ver());
        }
    }   
}
