package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/Colegios"; //nombre de la base de datos
    public static final String USER = "root";// Nombre de usuario
    public static final String CLAVE = "";// Contraseña
    
    // Método para obtener una conexión a la base de datos
    public Connection getConexion(){
        Connection con = null; //Inicialización de la conexión
        try{
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE); // Establecer la conexión utilizando la URL, usuario y contraseña
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con; // Devolver la conexión
    }
}
