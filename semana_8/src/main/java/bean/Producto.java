
package bean;

public class Producto {
    private int codigo; //Atributos 
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(int codigo, String descripcion, double precio, int stock) { //constructor para iniciar
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //metodo ver
    public String ver(){
        return codigo + "\t" + descripcion + "\t" + precio + "\t" + stock;
    }
    
}
