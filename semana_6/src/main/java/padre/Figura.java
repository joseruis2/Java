
package padre;


public abstract class Figura {
    private double x,y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public String ubicacion(){
    return "("+x+","+y+")";
    }
    
    public abstract double area();
    
    public abstract double perimetro();
    
}
