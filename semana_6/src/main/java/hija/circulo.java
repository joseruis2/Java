
package hija;

import padre.Figura;


public class circulo extends Figura{
    private double radio;

    public circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    @Override // estás asegurando al compilador que estás sobrescribiendo un método existente, y no creando uno nuevo por error.
    public double area() {
        return Math.PI  * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI *radio;
    }
    
}
