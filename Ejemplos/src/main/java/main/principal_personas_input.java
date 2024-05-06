
package main;
import clases.personas_input;
import java.util.Scanner;

public class principal_personas_input {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese tu nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese tu apellido: ");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese tu edad: ");
        int edad = entrada.nextInt();
        
        personas_input p1 = new personas_input(nombre, apellido, edad);
        listar(p1);
    }
    public static void listar(personas_input p1){
        imprimir("Tu nombre es: " + p1.getNombre());
        imprimir("Tu apellido es: " + p1.getApellido());
        imprimir("Tu edad es: " + p1.getEdad());    
    }
    
    public static void imprimir(String m){
        System.out.println(m);
    }
}