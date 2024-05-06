package Ejercicio3_Hija;

import Ejercicio3_padre.Trabajador;

public class Consultor extends Trabajador{
    private double horasTrabajadas;
    private double tarifaHoraria;

    public Consultor(double horasTrabajadas, double tarifaHoraria, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHoraria = tarifaHoraria;
    }
    
    public double SueldoBruto(){
    return horasTrabajadas*tarifaHoraria;
    }
    
    
    public String mostrarDatos() {
        return "Hola: " + nombre + " " + apellido + " " + telefono + " "+ SueldoBruto();
    }
    
    
    
}
