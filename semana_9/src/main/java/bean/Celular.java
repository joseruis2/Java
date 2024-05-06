
package bean;

public class Celular {
    private int codigo; //atributos
    private String marca, modelo;
    private double precio;

    public Celular(int codigo, String marca, //constructor 
            String modelo, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getCodigo() { //lectura
        return codigo;
    }

    public void setCodigo(int codigo) { //escritura
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String ver(){ //metodo ver
        return codigo + "\t" + marca + "\t" + modelo + "\t" + precio;
    }
}
