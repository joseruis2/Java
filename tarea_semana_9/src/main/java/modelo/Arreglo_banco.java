package modelo;

import bean.Hecbanco;
import java.util.ArrayList;


public class Arreglo_banco {
    private ArrayList<Hecbanco> lista; //creamos una lista

    public Arreglo_banco() {//constructor
        lista = new ArrayList<>();
    }
    
    public void adicionar(Hecbanco A){
    lista.add(A);
    }
    
    public int contar(){
        return lista.size();
    }
    
    //Obtener posicion ejemplo 1,2,3
    public Hecbanco obtener(int pos){
        return lista.get(pos);
    }
    
    //////////////////////////////////////////////
    public void eliminar(Hecbanco h){
        lista.remove(h);
    }
    
    //metodos buscar
    public Hecbanco buscar(int cod){ 
        Hecbanco p = null;
        //for x in lista --> esto es en Python
        for(Hecbanco x: lista){
            if (x.getDni()== cod){
                p = x;
                break;
            }    
        }
        return p;
    }
      
}
