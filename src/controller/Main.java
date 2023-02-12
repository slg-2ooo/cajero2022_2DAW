package controller;

import java.sql.Connection;

import model.Conexion;
import view.Ventana;

public class Main {

	public static void main(String[] args) {

		System.out.println("Cajero iniciado");
		
		//new Ventana();
		Connection conexionDB = new Conexion().Conexion("usuarios");
		System.out.println(conexionDB);
		
	}

}
