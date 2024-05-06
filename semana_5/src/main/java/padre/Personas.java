
package padre;

public class Personas {
    protected String nombre; //atributos
    protected String apellido;
    protected int edad;

    public Personas(String nombre, String apellido, int edad) {//constructor para iniciar los atributos
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //metodo generar codigos
    public String generarCorreo(){
        return String.valueOf(nombre.charAt(0)) //valueOf convierte en valeores
                +String.valueOf(apellido.charAt(0))
                +String.valueOf(edad)
                + "@idat.edu.pe";
    
    
    }
        
    //metodo mostrardatos
    public String mostrarDatos() {
        return "Nombre Completo: " + nombre + " " + apellido;
    }

    

    
}
