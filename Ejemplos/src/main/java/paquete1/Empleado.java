package paquete1;
public class Empleado { //clase Empleado
    private int codigo; // atributo
    private String nombre;
    private int horas;
    private double tarifa;

    //Constructor es un método especial que se utiliza para inicializar objetos de una clase. 
    // Constructor que recibe un parámetro llamado nombre
    //Parametro codigo nombre, que representa el codigo de la persona que queremos asignar a la variable codigo de la clase.
    public Empleado(int codigo, String nombre, int horas, double tarifa) {
        this.codigo = codigo; //asigna el valor del parametro codigo del objeto empleado
        this.nombre = nombre; //this nombre se refiere a ala variable nombre luego asignamos el valor del parámetro nombre
        this.horas = horas;
        this.tarifa = tarifa;
    }

    /*
     Lectura
     obtener el valor del campo codigo.
     Retorna el valor actual del atributo codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /* Escritura
    establecer el valor del atributo codigo
    */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }   
    public String getNombre() {
        return nombre;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    public int getHoras() {
        return horas;
    }  
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    } 
    ////////////////////////////////////
    //Metodo para calcular el sueldo
    public double sueldoNeto(){
        return horas*tarifa;
    }   
    //Metodo para descuento 11%
    public double DescuentoSueldo(){
        return 0.11 * sueldoNeto();
    }
    public double calcularSueldoNeto(){
    return sueldoNeto()-DescuentoSueldo();
    }  
}
