
package bean;


public abstract class Empleado { 
    private String nombre;
    private double salario;
    private int telefono;
    private String tipo;

    public Empleado(String nombre, double salario, int telefono, String tipo) {
        this.nombre = nombre;
        this.salario = salario;
        this.telefono = telefono;
        this.tipo = tipo;
    }  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract String ver();
    
}
