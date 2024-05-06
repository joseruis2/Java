
package clases;


public class hecbanco {
    private int prestamo_1;
    private int prestamo_2;
    private int prestamo_3;

    public hecbanco(int prestamo_1, int prestamo_2, int prestamo_3) {
        this.prestamo_1 = prestamo_1;
        this.prestamo_2 = prestamo_2;
        this.prestamo_3 = prestamo_3;
    }

    public int getPrestamo_1() {
        return prestamo_1;
    }

    public void setPrestamo_1(int prestamo_1) {
        this.prestamo_1 = prestamo_1;
    }

    public int getPrestamo_2() {
        return prestamo_2;
    }

    public void setPrestamo_2(int prestamo_2) {
        this.prestamo_2 = prestamo_2;
    }

    public int getPrestamo_3() {
        return prestamo_3;
    }

    public void setPrestamo_3(int prestamo_3) {
        this.prestamo_3 = prestamo_3;
    }
      
    public int total(){
    return prestamo_1+ prestamo_2+prestamo_3;
    }
    
        public String ver(){
        return "prestamo 1:" + prestamo_1 + " "+ "prestamo 2:"+ prestamo_2 + " " + "prestamo 3:" + " " +prestamo_3;
    }  
}
