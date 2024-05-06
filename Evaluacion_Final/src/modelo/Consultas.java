package modelo;

import bean.Alumnos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    PreparedStatement pst = null; //Declaración de una instancia de PreparedStatement
    
    public boolean registrar(Alumnos a){
        //Crear una objeto de la clase Conexion
        Conexion conex = new Conexion();
        Connection cn = conex.getConexion(); //Obtener la conexión BD
        
        try {
            //Consulta SQL para insertar en la tabla un nuevo registro de alumnos
            String consulta = "{call registrar_alumnos(?,?,?,?,?,?,?,?,?)}";
            //Preparar la consulta SQL con los datos del alumnos
            pst = cn.prepareCall(consulta);
            pst.setString(1, a.getCodigo()); //Establecer el código
            pst.setString(2, a.getNombre());
            pst.setString(3, a.getSexo());
            pst.setString(4, a.getDistrito());
            pst.setInt(5, a.getNota1());
            pst.setInt(6, a.getNota2());
            pst.setInt(7, a.getNota3());
            pst.setInt(8, a.getNota4());
            pst.setInt(9, a.getNota5());           
            // Ejecutar la consulta y verificar si se inserta el registro correctamente
            if (pst.executeUpdate() == 1) return true;
            
        } catch (Exception e) {
            System.err.println("Error: " + e.toString());
        } finally{//Cierre de recursos en un bloque finally
            try {
                if(cn != null) cn.close(); //Cerrar la conexión  si no es nula
                if(pst != null) pst.close(); //Cerrar el PreparedStatement si no es nulo
            } catch (Exception e) {
                System.err.println("Error: "+e.toString());
            }
        }
        return false; // Retornar falso si no se registra la venta correctamente
    }
    
    
    
    // Método para listar todos los alumnos almacenados en la base de datos
    public List<Alumnos> listar() throws SQLException{
        Conexion conex = new Conexion(); //Crear un objeto de la clase Conexion
        Connection cn = conex.getConexion(); //Obtener una conexión a la base de datos
        
        List<Alumnos> lista = new ArrayList<>(); //Crear una lista para almacenar los alumnos
        
        String sql = "{call listar_alumnos()}"; //Consulta SQL para seleccionar todos los registros de la tabla alumno
        
        try{
            pst = cn.prepareCall(sql); //Preparar la consulta SQL
            ResultSet rs = pst.executeQuery(); // Ejecutar la consulta y obtener los resultados
            while(rs.next()){
                Alumnos a = new Alumnos(); //objeto
                a.setCodigo(rs.getString("codigo")); // Establecer el código del alumno
                a.setNombre(rs.getString("Nombre"));
                a.setSexo(rs.getString("Sexo"));
                a.setDistrito(rs.getString("Distrito"));
                a.setNota1(rs.getInt("Nota1"));
                a.setNota2(rs.getInt("Nota2"));
                a.setNota3(rs.getInt("Nota3"));
                a.setNota4(rs.getInt("Nota4"));
                a.setNota5(rs.getInt("Nota5"));
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
    
    
    
    public boolean eliminar(String cod){
        
        Conexion conex = new Conexion();
        Connection cn = conex.getConexion();
        
        try {
            String consulta = "{call eliminar_alumnos(?)}";
            pst = cn.prepareCall(consulta);
            pst.setString(1, cod);
            
            if (pst.executeUpdate() == 1) return true;
            
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
        return false;
    }
    
    
    //////////////////////////////////
    public Alumnos buscar(String cod) {
        Conexion conex = new Conexion();
        Connection cn = conex.getConexion();
        
        // Consulta SQL para seleccionar un registro de alumno por código
        String sql = "{call buscar_alumnos(?) }";
        
        Alumnos a = new Alumnos(); // Crear un objeto de alumnos
        try{
            pst = cn.prepareCall(sql); // Preparar la consulta SQL
            pst.setString(1, cod); // Establecer el código del alumno a buscar
            ResultSet rs = pst.executeQuery(); // Ejecutar la consulta y obtener los resultados
            
            // Si se encuentra el registro, establecer los datos del alumno
            while(rs.next()){
                a.setCodigo(rs.getString("codigo")); // Establecer el código de las ventas
                a.setNombre(rs.getString("Nombre"));
                a.setSexo(rs.getString("sexo"));
                a.setDistrito(rs.getString("Distrito"));
                a.setNota1(rs.getInt("Nota1"));
                a.setNota2(rs.getInt("Nota2"));
                a.setNota3(rs.getInt("Nota3"));
                a.setNota4(rs.getInt("Nota4"));
                a.setNota5(rs.getInt("Nota5"));
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
    
    ////////////////////////////////
    // Método para actualizar
    public boolean actualizar(Alumnos a){
        
        Conexion conex = new Conexion(); //objeto
        Connection cn = conex.getConexion(); // Obtener una conexión a la base de datos
        
        try {//Consulta SQL para actualizar los datos de un registro de alumno
            String consulta = "{call actualizar_Notas(?,?,?,?,?,?)}";
            
            pst = cn.prepareCall(consulta);
            pst.setInt(1, a.getNota1());   // Establecer Precio del ventas
            pst.setInt(2, a.getNota2());
            pst.setInt(3, a.getNota3());
            pst.setInt(4, a.getNota4());
            pst.setInt(5, a.getNota5());
            pst.setString(6, a.getCodigo());
            
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
