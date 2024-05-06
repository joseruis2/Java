
package hija;

import padre.Personas;

public class Alumno extends Personas{
    private double n1,n2,n3;

    public Alumno(String nombre, String apellido, int edad,double n1,double n2,double n3) {
        super(nombre, apellido, edad);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    //metodo calcular promedio
    public double calcularPromedio(){
        return (n1+n2+n3)/3;
    }
    
    @Override
    public String mostrarDatos(){
        return "Alumno\n"+super.mostrarDatos();
    
    }
    
}
