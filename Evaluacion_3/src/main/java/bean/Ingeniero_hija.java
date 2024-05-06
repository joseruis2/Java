package bean;


public class Ingeniero_hija extends Empleado{
    private String especialidad;
    private int añosExperiencia;
    
    public Ingeniero_hija(String nombre, double salario, int telefono, String especialidad, int añosExperiencia,String tipo) {
        super(nombre, salario, telefono, tipo);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String ver() {
        return "Nombre: " + getNombre() + "\n" + "Salario: " +getSalario() + "\n" + "Telefono: " + getTelefono() +
                "\n" + "Especialidad: " + getEspecialidad() + "\n" + "Años de experiencia: " +getAñosExperiencia() + "\n" + "Tipo: " +getTipo() + "\n";
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    
    
}
