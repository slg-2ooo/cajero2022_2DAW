package controller;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;

import model.Conexion;
import model.Usuarios;
import view.Ventana;

public class Main {

	public static void main(String[] args) {

		System.out.println("Cajero iniciado");
		
		//new Ventana();
		Usuarios users = new Usuarios();
		
		for (Iterator iterator = users.listarUsarios().iterator(); iterator.hasNext();) {
			HashMap<String, Object> type = (HashMap<String, Object>) iterator.next();

			System.out.println(type);
			
		}
		
		

		System.out.println(users.buscarUsario(1));
		
		/*
		for (Iterator iterator = users.listarUsarios().iterator(); iterator.hasNext();) {
			HashMap<String, Object> type = (HashMap<String, Object>) iterator.next();

			System.out.println(type);
			
		}
		*/
		
	}

}
