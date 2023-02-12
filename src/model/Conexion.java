package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String driver = "com.mysql.jdbc.Driver";
    private String baseDatos;
    private String servidor = "localhost";
    private String puerto = "3306";

    
    private String url = "jdbc:mysql://" + servidor + ":" + puerto + "/" + baseDatos + "?useSSL=false";
    private String nombreUsuario = "root";
    private String contrasenna = "";

    
    public Connection Conexion(String baseDatos) {
        Connection conn = null;
        
        this.baseDatos = baseDatos;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, nombreUsuario, contrasenna);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
	
}
