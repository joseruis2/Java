
package vista;

import bean.Producto;
import modelo.ArregloProductos;

public class Principal {

    public static void main(String[] args) {
        ArregloProductos lista = new ArregloProductos(); //objeto de la lista
        
        Producto p1 = new Producto(101, "Arroz", 4.80, 100); //objeto del producto
        Producto p2 = new Producto(102, "Azúcar", 3.80, 130);
        
        lista.adicionar(p1);
        lista.adicionar(p2);
        
        imprimir("LISTA DE PRODUCTOS");
        
        for(int i = 0; i < lista.tamaño(); i ++)
            imprimir(lista.obtener(i).ver());
        
    }

    private static void imprimir(String x) {
        System.out.println(x);
    }
    
}
