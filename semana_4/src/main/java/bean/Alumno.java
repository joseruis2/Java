package bean;
public class Alumno {
    
    private String nombre;
    private int nota1,nota2;
    public static int cantidad = 0; //variable de clase
                                    //significa que la variable pertenece a la clase en sí misma en lugar de pertenecer a instancias individuales de la clase.

    public Alumno(String nombre, int nota1, int nota2) { //constructor
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        cantidad++;
    }  
    public String getNombre() { //lectura
        return nombre;
    }   
    public void setNombre(String nombre) { //escritura
        this.nombre = nombre;
    } 
    public int getNota1() {
        return nota1;
    }  
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }   
    public int getNota2() {
        return nota2;
    }   
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
    ////////////////////////////////////
    //Crea Metodo Promedio
    public double promedio(){
        return (nota1+nota2)/2.0;    
    }   
}
