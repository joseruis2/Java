
package modelo;

import bean.Celular;
import java.util.ArrayList; // Importar la clase ArrayList

public class ArregloCelulares {
    
    private ArrayList<Celular> lista; // variable llamada lista que contendrá objetos de tipo Celular   
    public ArregloCelulares(){ // Constructor de la clase ArregloCelulares
        lista = new ArrayList<>(); // Inicializar la lista como un nuevo objeto ArrayList vacío
    }
 
    // Agregar los objetos Celular a la lista utilizando el método add
    public void adicionar(Celular c){ //ejemplo listaCelulares.add(celular1);
        lista.add(c);
    }
    
    public void eliminar(Celular c){ //elimina una lista
        lista.remove(c);
    }
    
    // Método para obtener un celular de la lista basado en su posición
    public Celular obtener(int pos){ // Retorna el celular en la posición especificada
        return lista.get(pos);
    }
    
    public Celular buscar(int cod){
        Celular c = null; // Inicializa una variable de tipo Celular como null o nada
        for(Celular x: lista){ // Itera sobre cada elemento (Celular) en la lista ejemplo for x in lista py
            if (x.getCodigo() == cod){
                c = x; // Asigna el celular actual a la variable c
                break;
            }    
        }
        return c; // Retorna el celular encontrado, o null si no se encontró ninguno
    }
    
    
    public int tamaño(){ //obtener el número de elementos de una lista
        return lista.size();
    }
    
    public void actualizar(Celular p) {
        int pos = 0; // Inicializa una variable para almacenar la posición del celular a actualizar
        // Itera sobre cada elemento de la lista
        for(int i = 0; i < tamaño(); i ++){ 
            if (obtener(i).getCodigo() == p.getCodigo()){ // Comprueba si el código del celular actual es igual al código del celular que se quiere actualizar
                pos = i; // Almacena la posición del celular a actualizar
                break;
            }
        }
        // Actualiza el celular en la posición pos con el nuevo objeto celular p
        lista.set(pos, p);
    }
    
    public void aumentarPrecio(){
        // Itera sobre cada elemento (celular) en la lista
        for(Celular c:lista){
            if (c.getMarca().endsWith("a")){ // Verifica si la marca del celular termina con la letra "a"
                c.setPrecio(1.08 * c.getPrecio());
                actualizar(c); // Actualiza el celular en la lista con el nuevo precio
            }
        }
    }
    
    public ArrayList<String> listarXMarca(String m){
        // Crea un nuevo ArrayList para almacenar modelos de celulares
        ArrayList<String> modelos = new ArrayList<>();
        
        for(Celular c:lista){ // Itera sobre cada elemento (celular) en la lista
            if (c.getMarca().equals(m)){// Verifica si la marca del celular actual es igual a la marca especificada
                modelos.add(c.getModelo()); // Si es así, agrega el modelo del celular a la lista de modelos
            }
        }
        return modelos;// Retorna la lista de modelos de celulares
    }
}
