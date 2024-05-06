package Ejercicio3_Hija;

import Ejercicio3_padre.Trabajador;//importa del Trabajador


public class Empleado extends Trabajador{
    private double sueldoBasico, porcentajeBonificacion;

    public Empleado(double sueldoBasico, double porcentajeBonificacion, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.sueldoBasico = sueldoBasico;
        this.porcentajeBonificacion = porcentajeBonificacion;
    }
    public double boniSoles(){
    return sueldoBasico*porcentajeBonificacion;
    }
    
    public double sueldoBruto(){
    return sueldoBasico+boniSoles();
    }
    
    public String mostrarDatos() {
        return "Hola: " + nombre + " " + apellido + " " + telefono + " "+ boniSoles() + " " + sueldoBruto();
    }
    
    
    
    
}
