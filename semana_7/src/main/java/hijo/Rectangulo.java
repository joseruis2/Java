
package hijo;

import padre.Figura;
import padre.Poligono;

public class Rectangulo extends Poligono implements Figura{
    
    public double base, altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
    
    @Override
    public String mostrar(){
        return super.mostrar() +
                "Área: " + area() + 
                "\nPerímetro: " + perimetro();
    }
    
}
