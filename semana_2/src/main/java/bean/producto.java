
package bean;


public class producto {
    private int codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitarioCompraSoles;
    private double preciounitarioventasoles;

    public producto(int codigo, String descripcion, int cantidad, double precioUnitarioCompraSoles, double preciounitarioventasoles) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitarioCompraSoles = precioUnitarioCompraSoles;
        this.preciounitarioventasoles = preciounitarioventasoles;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitarioCompraSoles() {
        return precioUnitarioCompraSoles;
    }

    public void setPrecioUnitarioCompraSoles(double precioUnitarioCompraSoles) {
        this.precioUnitarioCompraSoles = precioUnitarioCompraSoles;
    }

    public double getPreciounitarioventasoles() {
        return preciounitarioventasoles;
    }

    public void setPreciounitarioventasoles(double preciounitarioventasoles) {
        this.preciounitarioventasoles = preciounitarioventasoles;
    }
    
    ///////////////////////////////////////
    
    public double costodeinventariosoles(){
        return cantidad * precioUnitarioCompraSoles;
    }
    
    public double utilidadUnitariaSoles() {
        return preciounitarioventasoles-precioUnitarioCompraSoles;
    }
    
    public double utilidadUnitariaDolares(double tipoCambio) {
        return utilidadUnitariaSoles() / tipoCambio;
    }
    
}
