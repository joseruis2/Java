
package vista;
import hija.B;
public class Principal { 
    public static void main(String[] args) {
        B r = new B(1,3,5,7);
        imprimir("Objeto r de tipo B: "+r);
        imprimir("v1: "+r.v1);
        imprimir("v2: "+r.getV2());
        imprimir("v3: "+r.getV3());
        imprimir("v4: "+r.v4);
        imprimir("suma: "+r.suma());       
    }
    
    public static void imprimir(String m){
        System.out.println(m+ "\n");}  
}
