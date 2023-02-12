package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Usuarios {
	
	private Consultas consultas;

	public Usuarios() {
		
		this.consultas = new Consultas();
		
	}
	
	/*
	 * Mostrar la lista de usuarios
	 */
	public ArrayList< HashMap<?, ?> > listarUsarios() {
		
		Conexion conexionDB = new Conexion();
		ArrayList< HashMap<?, ?> > result = null;
		
        try {
        	result = new ArrayList<>();
            //HashMap<?,?> user = selectOne(idUsuario);
            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                            this.consultas.MOSTRAR_USUARIOS
                    );
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                HashMap<String, Object> row = new HashMap<>();
                row.put("idUsuario", rs.getInt("idUsuario"));
                row.put("nombre", rs.getString("nombre"));
                row.put("apellidos", rs.getString("apellidos"));
                row.put("contrasenna", rs.getString("contrasenna"));
                result.add(row);
            }
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
        
        return result;
		
	}
	/*
	 * Mostrar un usuario a partir de su id
	 */
	public HashMap<String, Object> buscarUsario(int idUsuario) {
			
		Conexion conexionDB = new Conexion();
		HashMap<String, Object> result = null;
		
        try {

            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                            this.consultas.BUSCAR_USUARIO
                    );
            preparedStatement.setInt(1, idUsuario);
            ResultSet rs = preparedStatement.executeQuery();
            while( rs.next() ) {
	            result = new HashMap<>();
	            result.put("idUsuario", rs.getInt("idUsuario"));
	            result.put("nombre", rs.getString("nombre"));
	            result.put("apellidos", rs.getString("apellidos"));
	            result.put("contrasenna", rs.getString("contrasenna"));
            }
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
        
        return result;
		
	}
	/*
	 * Añadir un usuario nuevo
	 */
	public void insertarUsario(int idUsuario, String nombre, String apellidos, String contrasenna) {
		
		Conexion conexionDB = new Conexion();
        try {
        	
            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                    		this.consultas.INSERTAR_USUARIO
                    );
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, apellidos);
            preparedStatement.setString(4, contrasenna);
            preparedStatement.execute();
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
		
	}
	/*
	 * Editar un usuario a partir de su id
	 */
	public void editarUsario(int idUsuario, String nombre, String apellidos, String contrasenna) {
		
		Conexion conexionDB = new Conexion();
        try {
        	
            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                    		this.consultas.EDITAR_USUARIO
                    );
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellidos);
            preparedStatement.setString(3, contrasenna);
            
            preparedStatement.setInt(4, idUsuario);
            preparedStatement.execute();
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
		
	}
	/*
	 * Eliminar a un usuario a partir de su id
	 */
	public void borrarUsario(int idUsuario) {
		
		Conexion conexionDB = new Conexion();
        try {
        	
            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                    		this.consultas.BORRAR_USUARIO
                    );
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.execute();
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
		
	}
	
}
