//1)Conexion y el 2do libreria
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    // Definición de las constantes para la conexión a la base de datos
    public static final String URL = "jdbc:mysql://localhost:3306/ventas"; //nombre de la base de datos
    public static final String USER = "root";// Nombre de usuario para acceder a la base de datos
    public static final String CLAVE = "";// Contraseña para acceder a la base de datos
    
    // Método para obtener una conexión a la base de datos
    public Connection getConexion(){
        Connection con = null; //Inicialización de la conexión
        try{
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE); // Establecer la conexión utilizando la URL, usuario y contraseña
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());// Imprimir el mensaje de error en la consola
        }
        return con; // Devolver la conexión
    }
    
}
