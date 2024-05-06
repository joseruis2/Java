package bean;

import java.util.Arrays;
public class Alumnos {   
    private String codigo,nombre,sexo;
    private String distrito;
    private int nota1,nota2,nota3,nota4,nota5;

    public Alumnos() {
    }
    
    public Alumnos(String codigo, String nombre, String sexo, String distrito, int nota1, int nota2, int nota3, int nota4, int nota5) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.distrito = distrito;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getNota5() {
        return nota5;
    }

    public void setNota5(int nota5) {
        this.nota5 = nota5;
    }
    
    ///////////////////////////
    public double promedio() {
    double[] notasOrdenadas = {getNota1(), getNota2(), getNota3(), getNota4(), getNota5()};
    Arrays.sort(notasOrdenadas);
    double promedio = (notasOrdenadas[2] + notasOrdenadas[3] + notasOrdenadas[4]) / 3;
    return promedio;
    }
    ////////////////////////////
    public String condicion(){
        if(promedio() >= 12.5){
        return "Estas aprobado";
        }
        else{
            return "estas desaprobado";   
        } 
    }
    /////////////////////////////
    public int beca(){
        if (promedio() >= 19) {
        return 40;
    } else if (promedio() >= 17) {
        return 30;
    } else if (promedio() >= 15) {
        return 20;
    } else {
        return 0;}     
    }    
}
    
 
   
