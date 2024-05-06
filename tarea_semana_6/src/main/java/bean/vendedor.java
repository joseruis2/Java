package bean;


public class vendedor {
    private int codigo;
    private String nombre;
    private double monto_vendido;
    
    public static double porcentaje_comision = 0.05;
    public static int contador_vendedores = 0;
    public static double sueldo_bruto = 0;

    public vendedor(int codigo, String nombre, double monto_vendido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.monto_vendido = monto_vendido;
        contador_vendedores++; //Aumenta 1 cada vendedor
                                        
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

    
    public double getMonto_vendido() {
        return monto_vendido;
    }

    
    public void setMonto_vendido(double monto_vendido) {
        this.monto_vendido = monto_vendido;
    }
    
    
    public double sueldo_basico(){
    return 500.00;
    }
    
    public double la_comision_soles(){
       return monto_vendido*porcentaje_comision;
    }
    
    public double calcular_sueldo_bruto(){
         double C_sueldo_bruto = sueldo_basico() + la_comision_soles();
         sueldo_bruto += C_sueldo_bruto;
         return C_sueldo_bruto;
                               
    
    }    
    
    
    
}
