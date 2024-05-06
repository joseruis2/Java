
package vista;


public class NewMain {

    
    public static void main(String[] args) {
        for(int i =1; i<=10; i++){
             System.out.println("Tabla de multiplicar del " + i + ":");
             
            for(int j =2; j<=10;j++){
            int resul = i*j;
                System.out.println(i + "*" + j + "=" + resul);
            }
            
            System.out.println();
        }
        
    }
    
}
