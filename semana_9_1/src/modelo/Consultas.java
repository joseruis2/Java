//4)
package modelo;

import bean.ventas;//importamos ventas
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Consultas {
    // Declaración de una instancia de PreparedStatement
    PreparedStatement pst = null;
    
    // Método para registrar
    public boolean registrar(ventas a){
        //Crear una instancia de la clase Conexion
        Conexion conex = new Conexion();
        Connection cn = conex.getConexion(); //Obtener una conexión a la base de datos
        
        try {
            //Consulta SQL para insertar en la tabla un nuevo registro de ventas
            String consulta = "INSERT INTO ventas(codigo, producto, precio, cantidad) "
                    + "VALUES(?,?,?,?)";
            //Preparar la consulta SQL con los datos del ventas
            pst = cn.prepareStatement(consulta);
            pst.setString(1, a.getCodigo()); //Establecer el código
            pst.setString(2, a.getProducto());
            pst.setInt(3, a.getPrecio());
            pst.setInt(4, a.getCantidad());
            
            // Ejecutar la consulta y verificar si se inserta el registro correctamente
            if (pst.executeUpdate() == 1) return true;
            
        } catch (Exception e) {//Captura de excepciones
            System.err.println("Error: " + e.toString());
        } finally{//Cierre de recursos en un bloque finally
            try {
                if(cn != null) cn.close(); //Cerrar la conexión a la base de datos si no es nula
                if(pst != null) pst.close(); //Cerrar el PreparedStatement si no es nulo
            } catch (Exception e) {
                System.err.println("Error: "+e.toString()); // Imprimir el mensaje de error
            }
        }
        return false; // Retornar falso si no se registra la venta correctamente
    }
    
    // Método para listar todos las ventas almacenados en la base de datos
    public List<ventas> listar() throws SQLException{
        Conexion conex = new Conexion(); //Crear una instancia de la clase Conexion
        Connection cn = conex.getConexion(); //Obtener una conexión a la base de datos
        
        List<ventas> lista = new ArrayList<>(); //Crear una lista para almacenar las ventas
        
        String sql = "select * from ventas"; //Consulta SQL para seleccionar todos los registros de la tabla alumno
        
        
        try{
            pst = cn.prepareStatement(sql); //Preparar la consulta SQL
            ResultSet rs = pst.executeQuery(); // Ejecutar la consulta y obtener los resultados
            while(rs.next()){
                ventas a = new ventas(); //objeto
                a.setCodigo(rs.getString("codigo")); // Establecer el código del alumno
                a.setProducto(rs.getString("Producto"));
                a.setPrecio(rs.getInt("precio"));
                a.setCantidad(rs.getInt("cantidad"));
                lista.add(a); // Agregar el alumno a la lista
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.toString()); // Captura de excepciones
        }finally{
            try {
                if(cn != null) cn.close(); // Cerrar la conexión a la base de datos si no es nula
                if(pst != null) pst.close(); // Cerrar el PreparedStatement si no es nulo
            } catch (Exception e) {
                System.err.println("Error: "+e.toString());
            }
        }
        return lista; // Retornar la lista de ventas
    }
    
    // Método para eliminar ventas de la base de datos
    public boolean eliminar(String cod){
        
        Conexion conex = new Conexion(); // Crear una instancia de la clase Conexion
        Connection cn = conex.getConexion(); // Obtener una conexión a la base de datos
        
        try {
            // Consulta SQL para eliminar un registro de ventas
            String consulta = "delete from ventas where codigo=?";
            pst = cn.prepareStatement(consulta); // Preparar la consulta SQL
            pst.setString(1, cod); // Establecer el código de la ventas para a eliminar
            
            // Ejecutar la consulta y verificar si se elimina el registro correctamente
            if (pst.executeUpdate() == 1) return true;
            
        } catch (Exception e) {// Captura de excepciones
            System.err.println("Error: " + e.toString());
        }finally{
            try {
                if(cn != null) cn.close(); //Cerrar la conexión a la base de datos si no es nula
                if(pst != null) pst.close(); //Cerrar el PreparedStatement si no es nulo
            } catch (Exception e) {
                System.err.println("Error: "+e.toString());
            }
        }
        return false;
    }
    
    // Método para buscar ventas por su código en la base de datos
    public ventas buscar(String cod) {
        Conexion conex = new Conexion();
        Connection cn = conex.getConexion();
        
        // Consulta SQL para seleccionar un registro de alumno por código
        String sql = "select * from ventas where codigo=?";
        
        ventas a = new ventas(); // Crear un objeto de ventas
        try{
            pst = cn.prepareStatement(sql); // Preparar la consulta SQL
            pst.setString(1, cod); // Establecer el código del alumno a buscar
            ResultSet rs = pst.executeQuery(); // Ejecutar la consulta y obtener los resultados
            
            // Si se encuentra el registro, establecer los datos del alumno
            while(rs.next()){
                a.setCodigo(rs.getString("codigo")); // Establecer el código de las ventas
                a.setProducto(rs.getString("Producto"));
                a.setPrecio(rs.getInt("Precio"));
                a.setCantidad(rs.getInt("Cantidad"));
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.toString());
        }finally{
            try {
                if(cn != null) cn.close();
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("Error: "+e.toString());
            }
        }
        return a;
    }
    
    // Método para actualizar los datos
    public boolean actualizar(ventas a){
        
        Conexion conex = new Conexion(); // Crear una instancia de la clase Conexion
        Connection cn = conex.getConexion(); // Obtener una conexión a la base de datos
        
        try {//Consulta SQL para actualizar los datos de un registro de alumno
            String consulta = "update ventas set precio=?, cantidad=?"
                    + " where codigo=?";
            
            pst = cn.prepareStatement(consulta);
            pst.setInt(1, a.getPrecio());   // Establecer Precio del ventas
            pst.setInt(2, a.getCantidad());
            pst.setString(3, a.getCodigo());
            
            // Ejecutar la consulta y verificar si se actualiza el registro correctamente
            if (pst.executeUpdate() == 1) return true;
            
        } catch (SQLException e) {
            System.err.println("Error: " + e.toString());
        } finally{
            try {
                if(cn != null) cn.close();
                if(pst != null) pst.close();
            } catch (SQLException e) {
                System.err.println("Error: "+e.toString());
            }
        }
        return false;
    }
    
}
