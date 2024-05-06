
package hijo;

import padre.Figura;
import padre.Poligono;

public class Cuadrado extends Poligono implements Figura{
    
    public double lado;

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar() +
                "Área: " + area() + 
                "\nPerímetro: " + perimetro();
    }
    
}
