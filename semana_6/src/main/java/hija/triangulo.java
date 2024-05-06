
package hija;

import padre.Figura;


public class triangulo extends Figura{
    private double lado1,lado2,lado3;

    public triangulo(double lado1, double lado2, double lado3, double x, double y) {
        super(x, y);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override // estás asegurando al compilador que estás sobrescribiendo un método existente, y no creando uno nuevo por error.
    public double area() {
        double sp=(lado1+lado2+lado3)/2;
        return Math.pow(sp*(sp-lado1)*(sp-lado2)*(sp-lado3),0.5);
    }

    @Override
    public double perimetro() {
        return lado1+lado2+lado3;
    }
}
