
package main;

import java.util.Scanner;

public class Ejercicio_1 {
    static double Evaluacion_1,Evaluacion_2,Evaluacion_3,Evaluacion_4,Evaluacion_5,Promedio;

    public static void main(String[] args) {
        IngresoDatos();
    }
    
    public static void Imprimir(String m){
        System.out.println(m);
    }
    
    public static void IngresoDatos(){
        Scanner input = new Scanner(System.in);
        Imprimir("Ingrese las 5 Notas");
        Imprimir("1ra Nota: ");
        Evaluacion_1 = input.nextDouble();
        Imprimir("2da Nota: ");
        Evaluacion_2 = input.nextDouble();
        Imprimir("3ra Nota: ");
        Evaluacion_3 = input.nextDouble();
        Imprimir("4ta Nota: ");
        Evaluacion_4 = input.nextDouble();
        Imprimir("5ta Nota: ");
        Evaluacion_5 = input.nextDouble();
        
        Promedio = (Evaluacion_1+Evaluacion_2+Evaluacion_3+Evaluacion_4+Evaluacion_5)/5.0;
        System.out.println("El promedio es: "+Promedio);
        
        if(Promedio == 20){
            System.out.println("Felicidades tienes 20 y beca completa");
        }else if(Promedio >= 18){
            System.out.println("Felicidades tienes media beca");
        }else if(Promedio >= 17){
            System.out.println("Felicidades tienes 1/4 Beca");
        }else{
            System.out.println("Mala suerte");}
    }
    
}
