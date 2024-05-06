
package vista;

import hija.circulo;
import hija.triangulo;
import padre.Figura;

public class Principal {

    
    public static void main(String[] args) {
        
        circulo cir = new circulo(4,8,5); //objeto circulo      
        procesar(cir); //metodo
        
        
        
        triangulo tia = new triangulo(30, 40, 50, 8, 6);
        procesar(tia);   
    }
    
    //metodo imprimir
    public static void imprimir(String m){
        System.out.println(m);
    }
    
    //metodo procesar
    private static void procesar(Figura objeto) {
        imprimir("Ubicacion: " + objeto.ubicacion());
        imprimir("Area: " + objeto.area());
        imprimir("Perimetro: " + objeto.perimetro());
    }    
}
