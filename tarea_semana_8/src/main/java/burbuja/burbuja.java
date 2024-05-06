
package burbuja;

import java.util.ArrayList;
import java.util.Scanner;


public class burbuja {

    
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Creamos un ArrayList para almacenar los elementos de la lista
        ArrayList<Integer> lista = new ArrayList<>();

        // Pedimos al usuario que ingrese el tamaño de la lista
        System.out.print("Ingrese el tamaño de la lista: ");
        int n = scanner.nextInt();

        // Pedimos al usuario que ingrese los elementos de la lista uno por uno
        System.out.println("Ingrese los elementos de la lista uno por uno:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            // Añadimos cada elemento ingresado por el usuario al ArrayList
            lista.add(scanner.nextInt());
        }

        // Llamamos al método burbuja para ordenar la lista
        burbuja(lista);
        // Imprimimos la lista ordenada
        System.out.println("Lista ordenada:");
        imprimirLista(lista);

        // Cerramos el objeto Scanner para liberar recursos
        scanner.close();
    }

    // Método que implementa el algoritmo de ordenamiento de burbuja para ArrayList
    public static void burbuja(ArrayList<Integer> lista) {
        // Obtenemos el tamaño de la lista
        int n = lista.size();
        // Iteramos sobre la lista
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Comparamos elementos adyacentes y los intercambiamos si están en el orden incorrecto
                if (lista.get(j) > lista.get(j+1)) {
                    // Intercambio de elementos
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                }
            }
        }
    }

    // Método para imprimir los elementos de la lista
    public static void imprimirLista(ArrayList<Integer> lista) {
        // Iteramos sobre la lista y la imprimimos
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println(); // Agregamos un salto de línea al final
    }

}
