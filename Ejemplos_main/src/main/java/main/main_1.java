
package main;

import java.util.ArrayList;


public class main_1 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        
        //crea variable mayor
        int Nmayor1 = Integer.MIN_VALUE;
        int Nmayor2 = Integer.MIN_VALUE;
        
        for(int x : n){ //bucle for lectura de n
            if(x > Nmayor1){
                Nmayor2 = Nmayor1; // Mover el antiguo máximo al segundo máximo
                Nmayor1 = x; // Actualizar el nuevo máximo
                
            }else if(x > Nmayor2){
                Nmayor2 = x; // Actualizar el segundo máximo
            
            }
        }
        int suma = Nmayor1+Nmayor2;
        System.out.println("la suma de numero mayor es: "+suma);
        
        
        
    }
    
}
