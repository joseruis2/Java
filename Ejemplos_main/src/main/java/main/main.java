package main;

import java.util.ArrayList;
import java.util.Collections;


public class main {

    public static void main(String[] args) {
        // Crear un ArrayList de números
        /*ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(50);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(50);

        // Ordenar el ArrayList en orden descendente
        Collections.sort(numeros, Collections.reverseOrder());

        // Sumar los dos primeros números (los dos mayores)
        int suma = numeros.get(0) + numeros.get(1);

        // Imprimir la suma de los dos números mayores
        System.out.println("La suma de los dos números mayores es: " + suma);*/
        
        // Crear un ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(100);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(50);

        // Inicializar las variables para almacenar los dos números mayores
        int max1 = Integer.MIN_VALUE; // Inicializar con el valor mínimo de un entero
        int max2 = Integer.MIN_VALUE; // Inicializar con el valor mínimo de un entero

        // Iterar sobre el ArrayList para encontrar los dos números mayores
        for (int num : numeros) {
            if (num > max1) {
                max2 = max1; // Mover el antiguo máximo al segundo máximo
                max1 = num; // Actualizar el nuevo máximo
            } else if (num > max2) {
                max2 = num; // Actualizar el segundo máximo
            }
        }

        // Sumar los dos números mayores
        int suma = max1 + max2;

        // Imprimir la suma de los dos números mayores
        System.out.println("La suma de los dos números mayores es: " + suma);
    
    }
    
}
