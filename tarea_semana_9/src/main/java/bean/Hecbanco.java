package bean;


public class Hecbanco {
    //Atributos
    private String nombre,apellido,correo,distrito,sexo;
    private int telefono,edad,Dni;
    private int deuda; 

    //constrictor para inicializar los atributos de la clase
    public Hecbanco(String nombre, String apellido, String correo, String distrito, int Dni, String sexo, int edad, int telefono, int deuda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.distrito = distrito;
        this.Dni = Dni;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono = telefono;
        this.deuda = deuda;
    }
    

    public String getNombre() { //lectura
        return nombre;
    }

    public void setNombre(String nombre) { //escritura
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String ver(){
        return nombre + "\t" + apellido + "\t" + correo + "\t" + distrito + "\t" + Dni + "\t" + sexo + "\t" + getEdad() + "\t" + telefono + "\t" + getDeuda(); 
    }

}
