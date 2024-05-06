
package hijo;

import padre.Figura;
import padre.Poligono;

public class Circulo extends Poligono implements Figura{
    public double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }


    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar() +
                "Área: " + area() + 
                "\nPerímetro: " + perimetro();
    }
}
