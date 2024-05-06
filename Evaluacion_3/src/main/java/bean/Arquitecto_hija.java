
package bean;


public class Arquitecto_hija extends Empleado{
    private double comision;
    private int cantidadProyecto;
    
    public Arquitecto_hija(String nombre, double salario, int telefono, double comision, int cantidadProyecto, String tipo){
        super(nombre, salario, telefono, tipo);
        this.comision = comision;
        this.cantidadProyecto = cantidadProyecto;
    }

    @Override
    public String ver(){
        return "Nombre: " + getNombre() + "\n" + "Salario: " + getSalario() + "\n" + "Telefono: " + getTelefono() +
                "\n" + "Comision: " + getComision() + "\n" + "Cantidad de proyectos: " + getCantidadProyecto() + "\n" + "Tipo: " +getTipo() + "\n";
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getCantidadProyecto() {
        return cantidadProyecto;
    }

    public void setCantidadProyecto(int cantidadProyecto) {
        this.cantidadProyecto = cantidadProyecto;
    }   
}
