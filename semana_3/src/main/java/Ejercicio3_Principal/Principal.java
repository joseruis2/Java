
package Ejercicio3_Principal;

import Ejercicio3_Hija.Consultor;
import Ejercicio3_Hija.Empleado;


public class Principal {

    
    public static void main(String[] args) {
        Consultor con = new Consultor(48, 9, "jose", "ruiz", "998104890");
        imprimir("Mostrar datos: "+con.mostrarDatos());
        imprimir("Codigo generado: "+con.generarCodigo());
        
        Empleado emp = new Empleado(890, 10, "Alex", "rivas", "112104801");
        imprimir("Mostrar datos: "+emp.mostrarDatos());
        imprimir("Codigo generado: "+emp.generarCodigo());
        
    }
    
    public static void imprimir(String m){
        System.out.println(m);}
    
}
