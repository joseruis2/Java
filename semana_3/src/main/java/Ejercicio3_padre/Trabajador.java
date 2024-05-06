package Ejercicio3_padre;

public class Trabajador {
    protected String nombre;
    protected String apellido;
    protected String telefono;

    public Trabajador(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public String generarCodigo(){
        return String.valueOf(nombre.charAt(0) //primer caracter del nombre
        + String.valueOf(apellido.charAt(apellido.length() -1)) //el ultimo caracter de apellido
        + String.valueOf(telefono.charAt(telefono.length() -1))); //el ultimo caracter de telefono
        //apellido.charAt(apellido.length() - 1)
    }
    
    
    
}
