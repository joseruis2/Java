
package vista;

import bean.Alumno;
public class Principal {   
    public static void main(String[] args) {        
        Alumno a1 = new Alumno("Juan", 10, 20), //Objetos
                a2 = new Alumno("pedro", 20, 15),
                a3 = new Alumno("pablo", 20, 20);
        
        listado(a1);
        listado(a2);
        listado(a3);       
        imprimir("Objeto creado: "+Alumno.cantidad);        
    }
    //Metodo listado y tiene un parametro de la clase Alumno que se va a llamar a   
    private static void listado(Alumno a){ 
        imprimir("Nombre: "+ a.getNombre());
        imprimir("Promedio: "+ a.promedio());   
    }
    private static void imprimir(String m){ //metodo imprimir
        System.out.println(m);   
    }    
}
