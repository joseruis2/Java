package hija;
import padre.A;

public class B extends A{ //extends = hereda de la clase A
    public  int v4;
    
    //metodo constructor
    public B(int v1, int v2, int v3,int v4) { 
        super(v1, v2, v3);//clase padre o super accede ala clasea A
        this.v4 = v4;
    }
    
    public int suma(){
        return v1+getV2()+ v3 + v4;
    }   
}
