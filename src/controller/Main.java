package controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

import model.Conexion;
import model.Cuentas;
import model.Usuarios;
import view.Ventana;
import view.admin.AdminCuentas;
import view.admin.AdminEliminarCuenta;
import view.admin.AdminUsuarios;

public class Main {

	public static void main(String[] args) {

		System.out.println("Cajero iniciado");
		
		new Ventana();
		//new AdminUsuarios();
		//new AdminCuentas();
		//new AdminEliminarCuenta();
		
		
		/*
		String nombre = "sefefsef";
		String apellidos = "piopiop";
		char[] contrasenna = {'r', 'e', 'h', 'd', 'ñ'};
		Usuarios usuarios = new Usuarios();
		usuarios.insertarUsario(nombre, apellidos, contrasenna);
		*/
		
		/*
		Usuarios users = new Usuarios();
		
		for (Iterator iterator = users.listarUsarios().iterator(); iterator.hasNext();) {
			HashMap<String, Object> type = (HashMap<String, Object>) iterator.next();

			System.out.println(type);
			
		}
		
		System.out.println(users.buscarUsario(1));
		*/
		/*
		for (Iterator iterator = users.listarUsarios().iterator(); iterator.hasNext();) {
			HashMap<String, Object> type = (HashMap<String, Object>) iterator.next();

			System.out.println(type);
			
		}
		*/
		
	}

}
