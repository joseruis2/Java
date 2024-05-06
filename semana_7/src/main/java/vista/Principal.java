
package vista;

import hijo.Circulo;
import hijo.Cuadrado;
import hijo.Rectangulo;
import padre.Poligono;

public class Principal {

    public static void main(String[] args) {
        Cuadrado cu = new Cuadrado(5, "Cuadrado");
        Rectangulo rec = new Rectangulo(2, 8, "Rectángulo");
        Circulo cir = new Circulo(4, "Círculo");
        
        listar(cu);
        listar(rec);
        listar(cir);    
    }

    private static void imprimir(String x) {
        System.out.println(x);
    }

    private static void listar(Poligono p) {
        imprimir(p.mostrar());
    }
}
