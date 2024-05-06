package padre;
public class A {
    public int v1; //cualquier parte
    private int v2; //solo con get y set
    protected int v3; //solo en el mismo archivo se comparte almenos que sea herencia

    public A(int v1, int v2, int v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }   
    public int getV2() { //lectura
        return v2;
    }

    
    public int getV3() { //lectura
        return v3;
    }   
}
