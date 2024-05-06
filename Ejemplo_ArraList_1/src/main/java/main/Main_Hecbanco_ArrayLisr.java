package main;

import clases.hecbanco;
import java.util.ArrayList;


public class Main_Hecbanco_ArrayLisr {

    public static void main(String[] args) {
        ArrayList<hecbanco> banco = new ArrayList<>(); //array
        hecbanco shande = new hecbanco(100,10,50); //objeto
        //agregar a lista
        banco.add(shande);
        //bucle for
        for(hecbanco x : banco){
            System.out.println(x.ver());
            System.out.println("el total es: "+ x.total());
        
        }
    }
    
}
