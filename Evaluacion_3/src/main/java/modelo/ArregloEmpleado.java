
package modelo;

import bean.Empleado;
import java.util.ArrayList; // Importar la clase ArrayList


public class ArregloEmpleado {
    private ArrayList<Empleado> lista;
    
    public ArregloEmpleado(){ // Constructor 
        lista = new ArrayList<>(); // Inicializar la lista 
    }
    
    public void agregarEmpleado(Empleado empleado) {
        lista.add(empleado);
    }
    
    public void eliminar(Empleado c){ //elimina una lista
        lista.remove(c);
    }
    
    // Método para obtener 
    public Empleado obtener(int pos){ // Retorna en la posición especificada
        return lista.get(pos);
    }
    
    public int tamaño(){ //obtener el número de elementos de una lista
        return lista.size();
    }
    
    public void adicionar(Empleado e){ //ejemplo listaCelulares.add(celular1);
        lista.add(e);
    }
}
