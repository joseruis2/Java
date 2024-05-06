package bean;

public class Empleado {
    private int codigo;
    private String nombre;
    private double horas;

    private static double tarifa;
    private static double porcD;
    
    public static int contador = 0;
    public static double netoAcumulado = 0;

    static { //inicializar static con el s/40 y 11%
        setTarifa(40);
        setPorcD(0.11);
    }

    public Empleado(int codigo, String nombre, double horas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        contador++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    /////////////////////////////////////////

    public double sueldoBruto() {
        return horas * tarifa;
    }

    public double descuento() {
        return porcD * sueldoBruto();

    }

    public double sueldoNeto() {
        double neto = sueldoBruto() - descuento();
        netoAcumulado += neto;
        return neto;
    }   
    public static void setTarifa(double aTarifa) {
        tarifa = aTarifa;
    }   
    public static void setPorcD(double aPorcD) {
        porcD = aPorcD;
    }
}
