package paquetePrincipal;
import paquete1.Empleado; //Importamos de la clases Empleado

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(1, "juan", 40, 10.0); //crea objeto del Empleado
        
        //LLAMAR EL METODO
        listar(empleado);
        
        //Establecer la nueva tarifa calculada utilizando el método setTarifa(double tarifa) en el objeto empleado. 
        //Este método toma la nueva tarifa como argumento y la asigna al atributo
        double nuevaTarifa = empleado.getTarifa()* 1.1;
        empleado.setTarifa(nuevaTarifa);
        System.out.println("Nueva tarifa es: "+empleado.getTarifa());
    }
    private static void listar(Empleado empleado) {
        System.out.println("Codigo: "+empleado.getCodigo());
        System.out.println("Nombre: "+empleado.getNombre());
        System.out.println("Horas: "+empleado.getHoras());
        System.out.println("Tarifa: "+empleado.getTarifa());
        System.out.println("Sueldo Neto: "+empleado.calcularSueldoNeto());
    }  
}
