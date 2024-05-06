package hija;

import padre.Personas;


public class Docente extends Personas{   
    private double horas,tarifa;

    public Docente(String nombre, String apellido, int edad, double horas,double tarifa) {
        super(nombre, apellido, edad);//accede al contructor padre
        this.horas = horas; //iniciacion de horas y tarifa
        this.tarifa = tarifa;
    }
    
    //metodo calcular sueldo
    public double calcularSueldo(){
        return horas * tarifa;
    }
    
    @Override
    public String mostrarDatos(){
        return "Docente\n"+ super.mostrarDatos();
    
    }
    
    
    
}
