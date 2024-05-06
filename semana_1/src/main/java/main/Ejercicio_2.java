
package main;

import java.util.Scanner;


public class Ejercicio_2 {
    static String dias,producto;
    static int cantidad;
    static double ImpCompra,ImpDesc,ImpTotal,Precio_Producto;

    public static void main(String[] args) {
        IngresoDatos();
        operaciones();
        resultado();
        
    }
    
    public void Imprimir(String m){
        System.out.println(m);
    }
    
    //ingrese dia,producto,cantidad
    public static void IngresoDatos(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        dias = input.next();
        
        System.out.println("Ingrese el producto: ");
        producto = input.next();
        
        System.out.println("Ingrese la cantidad: ");
        cantidad = input.nextInt();
    }
    public static void operaciones(){
    double porcDescuento;
    
        switch (dias) {
            case "lunes":
                porcDescuento = 0.05;
                break;
                
            case "martes":
                porcDescuento = 0.10;
                break;
                
            case "miercoles":
                porcDescuento = 0.12;
                break;
                
            case "jueves":
                porcDescuento = 0.13;
                break;
                
            case "viernes":
                porcDescuento = 0.15;
                break;    
              
            case "sabado":
                porcDescuento = 0.18;
                break;    
                
            case "domingo":
                porcDescuento = 0.20;
                break;    
                
            default:
                porcDescuento = 0.0;
        }
        Precio_Producto = 15.0;
        ImpCompra = Precio_Producto * cantidad;
        ImpDesc = ImpCompra * porcDescuento;
        ImpTotal = ImpCompra-ImpDesc;
    }
    private static void resultado(){
        System.out.println("Importe de la compra: "+ImpCompra);
        System.out.println("Inporte descuento: "+ImpDesc);
        System.out.println("Importe pagar: "+ImpTotal);
    
    }
    
    
}
