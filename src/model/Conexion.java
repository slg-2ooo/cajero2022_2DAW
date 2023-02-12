package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	Connection conn = null;

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String baseDatos = "cajero";
    private String servidor = "localhost";
    private String puerto = "3306";

    private String url = "jdbc:mysql://" + servidor + ":" + puerto + "/" + baseDatos + "?useSSL=false";
    private String nombreUsuario = "root";
    private String contrasenna = "";

    
    public Conexion() {
        
        try {
            Class.forName(this.driver);
            this.conn = DriverManager.getConnection(url, nombreUsuario, contrasenna);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
    
    public Connection getConexion() {
    	return conn;
    }
    
    public void cerrarConexion() {
    	
    	try {
    		conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    	
    }
    
    
	
}
