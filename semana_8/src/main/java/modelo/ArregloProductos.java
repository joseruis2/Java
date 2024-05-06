
package modelo;

import bean.Producto; // 1)Jalamos propiedades de Productos
import java.util.ArrayList; //1)importamos ArrayList

public class ArregloProductos {
    //1)declara una variable llamada lista que contendrá objetos del tipo Producto.
    //1)creamos una lista
    private ArrayList<Producto> lista; 
    
    public ArregloProductos(){ // 1) se inicializa el atributo lista de tipo ArrayList<Producto>
        lista = new ArrayList<>();
    }
    
    //metodos adicionar
    public void adicionar(Producto p){ 
        lista.add(p);
    }
    
    //metodos eliminar
    public void eliminar(Producto p){ 
        lista.remove(p);
    }
    
    //metodos obtener
    public Producto obtener(int pos){ 
        return lista.get(pos);
    }
    
    //metodos buscar
    public Producto buscar(int cod){ 
        Producto p = null;
        //for x in lista --> esto es en Python
        for(Producto x: lista){
            if (x.getCodigo() == cod){
                p = x;
                break;
            }    
        }
        return p;
    }
    
    //2)metodos tamaño
    public int tamaño(){ 
        return lista.size();
    }
    
    //2)metodos actualizar
    public void actualizar(Producto p) { 
        int pos = 0;
        for(int i = 0; i < tamaño(); i ++){
            if (obtener(i).getCodigo() == p.getCodigo()){
                pos = i;
                break;
            }
        }
        lista.set(pos, p);
    }
    
    //2)metodos  mayor precio
    public Producto mayorPrecio(){ 
        double max = 0;
        int pos = 0;
        for(int i = 0; i < tamaño(); i ++){
            if (obtener(i).getPrecio() > max){
                max = obtener(i).getPrecio();
                pos = i;
            }
        }
        return obtener(pos);
    }
    
    //2)metodos menor precio
    public Producto menorPrecio(){ 
        double min = Double.MAX_VALUE;
        int pos = 0;
        for(int i = 0; i < tamaño(); i ++){
            if (obtener(i).getPrecio() < min){
                min = obtener(i).getPrecio();
                pos = i;
            }
        }
        return obtener(pos);
    }  
}
