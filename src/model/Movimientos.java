package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Movimientos {
	
	private Consultas consultas;

	public Movimientos() {
		
		this.consultas = new Consultas();
		
	}

	/*
	 * Listar todos los movimientos de una cuenta a partir de id de cuenta
	 */
	public ArrayList< HashMap<?, ?> > listarMovimientos(int idCuenta) {
			
		Conexion conexionDB = new Conexion();
		ArrayList< HashMap<?, ?> > result = null;
		
        try {

            PreparedStatement preparedStatement = conexionDB.getConexion()
                    .prepareStatement(
                            this.consultas.MOSTRAR_MOVIMIENTOS
                    );
            preparedStatement.setInt(1, idCuenta);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                HashMap<String, Object> row = new HashMap<>();
                row.put("idMovimiento", rs.getInt("idMovimiento"));
                row.put("importe", rs.getString("importe"));
                row.put("esIngreso", rs.getString("esIngreso"));
                row.put("idCuenta", rs.getString("idCuenta"));
                result.add(row);
            }
            
        } catch (SQLException e) {
        	e.getStackTrace();
        } finally { conexionDB.cerrarConexion(); }
        
        return result;
		
	}
	
}
