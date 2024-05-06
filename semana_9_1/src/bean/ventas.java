//3)
package bean;
public class ventas {
    
    private String codigo,producto; //atributos
    private int precio,cantidad;

    public ventas() { //constructor vacio
    }

    public ventas(String codigo, String producto, int precio, int cantidad) { //metodo de constructor
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    

    public String getCodigo() {//lectura
        return codigo;
    }

    public void setCodigo(String codigo) {//escritura
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    ///////////////////////////////////////
    //metodo importe de pagar   
    public double precio(){
    return precio*cantidad;
    }
    
}
