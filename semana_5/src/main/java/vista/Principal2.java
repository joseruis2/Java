
package vista;

import hija.Alumno;
import hija.Docente;
import padre.Personas;


public class Principal2 {

    
    public static void main(String[] args) {
        Docente d = new Docente("juan", "Perez", 30, 30, 100); //objeto
        procesar(d);
        
        Alumno a = new Alumno("pedro", "martinez", 20, 10, 20, 10); //objeto
        procesar(a);
    }
    
    //metodo imprimir
    private static void imprimir(String m) {
        System.out.println(m);                
    }
    
    //metodo procesar
    private static void procesar(Personas p) {
        imprimir(p.mostrarDatos());
        imprimir("Correo: " + p.generarCorreo());
        if (p instanceof Docente){
            Docente doc = (Docente) p; //hacer casting
            imprimir("Sueldo: " + doc.calcularSueldo());
        }
        else{
            Alumno alum = (Alumno) p;
            imprimir("Promedio: " + alum.calcularPromedio());
        }
    }
   
    
}
