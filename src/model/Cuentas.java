package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Cuentas {
	
	private Consultas consultas;

	public Cuentas() {
		
		this.consultas = new Consultas();
		
	}
	
	/*
	 * Mostrar la lista de cuentas
	 */
	public ArrayList< HashMap<?, ?> > listarCuentas(int idUsuario) {
		
		Conexion conexionDB = new Conexion();
		ArrayList< HashMap<?, ?> > result = null;
		
        try {
        	result = new ArrayList<>();

            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                            this.consultas.MOSTRAR_CUENTAS
                    );
            preparedStatement.setInt(1, idUsuario);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                HashMap<String, Object> row = new HashMap<>();
                row.put("idCuenta", rs.getInt("idCuenta"));
                row.put("idUsuario", rs.getInt("idUsuario"));
                row.put("saldo", rs.getInt("saldo"));
                result.add(row);
            }
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
        
        return result;
		
	}
	/*
	 * Mostrar una cuenta a partir de su id
	 */
	public HashMap<String, Object> buscarCuenta(int idCuenta) {
			
		Conexion conexionDB = new Conexion();
		HashMap<String, Object> result = null;
		
        try {

            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                            this.consultas.BUSCAR_CUENTA
                    );
            preparedStatement.setInt(1, idCuenta);
            ResultSet rs = preparedStatement.executeQuery();
            while( rs.next() ) {
	            result = new HashMap<>();
	            result.put("idCuenta", rs.getInt("idCuenta"));
	            result.put("idUsuario", rs.getInt("idUsuario"));
	            result.put("saldo", rs.getInt("saldo"));
            }
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
        
        return result;
		
	}
	/*
	 * Añadir una cuenta nueva
	 */
	public void insertarCuenta(int idUsuario, int saldo) {
		
		Conexion conexionDB = new Conexion();
        try {
        	
            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                    		this.consultas.INSERTAR_CUENTA
                    );
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.setInt(2, saldo);
            preparedStatement.execute();
            
        } catch (SQLException e) {
        	e.getStackTrace();
        	System.out.println(e);
        } finally { conexionDB.cerrarConexion(); }
		
	}
	/*
	 * Editar una cuenta a partir de su id
	 */
	public void editarCuenta(int idCuenta, int idUsuario, int saldo) {
		
		Conexion conexionDB = new Conexion();
        try {
        	
            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                    		this.consultas.EDITAR_CUENTA
                    );
            preparedStatement.setInt(3, saldo);
            
            preparedStatement.setInt(1, idCuenta);
            preparedStatement.setInt(2, idUsuario);
            preparedStatement.execute();
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
		
	}
	/*
	 * Eliminar una cuenta a partir de su id
	 */
	public void borrarCuenta(int idCuenta) {
		
		Conexion conexionDB = new Conexion();
        try {
        	
            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                    		this.consultas.BORRAR_CUENTA
                    );
            preparedStatement.setInt(1, idCuenta);
            preparedStatement.execute();
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
		
	}
	
}
