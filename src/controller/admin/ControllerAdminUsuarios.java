package controller.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;

import model.Usuarios;
import view.admin.AdminUsuarios;
import view.elementos.Lista;

public class ControllerAdminUsuarios {
	
	private JFrame ventanaAdministracionUsuarios;

	public ControllerAdminUsuarios(JFrame frame) {
		
		this.ventanaAdministracionUsuarios = frame;
		
	}
	
	public void listarUsuario(Lista lista) {
		Usuarios usuarios = new Usuarios();
		ArrayList<String> itemsLista = new ArrayList<String>();
		
		ArrayList<HashMap<?, ?>> listaUsuarios = usuarios.listarUsarios();
		
		for (Iterator iterator = listaUsuarios.iterator(); iterator.hasNext();) {
			HashMap<String, Object> type = (HashMap<String, Object>) iterator.next();

			int idUsuario = (int)type.get("idUsuario");
			itemsLista.add( (String)type.get("nombre") + "  (" + idUsuario +")" );
			
		}
		
		String[] info = itemsLista.toArray(new String[itemsLista.size()]);
		lista.setModel(info);
	}
	
	public HashMap<String, Object> buscarUsuario(int idUsuario) {
		
		Usuarios usuarios = new Usuarios();
		return usuarios.buscarUsario(idUsuario);
		
	}
	
	public static int getIdDeListaDeNombres(String nombreConId) {
		
		String [] splitNombre = nombreConId.split("[(]");
		splitNombre = splitNombre[1].split("[)]");
		
		String idUsuario = splitNombre[0];
		return Integer.parseInt(idUsuario);
	}
	
	public void editarUsuario(int idUsuario, String nombre, String apellidos, char[] contrasenna) {
		
		Usuarios usuarios = new Usuarios();
		usuarios.editarUsario(idUsuario, nombre, apellidos, contrasenna);
		
		ventanaAdministracionUsuarios.dispose();
		new AdminUsuarios();
		
	}
	
	public void crearUsuario(String nombre, String apellidos, char[] contrasenna) {
		
		Usuarios usuarios = new Usuarios();
		usuarios.insertarUsario(nombre, apellidos, contrasenna);
		
		ventanaAdministracionUsuarios.dispose();
		new AdminUsuarios();
		
	}
	
	public void eliminarUsuario(int idUsuario) {
		
		Usuarios usuarios = new Usuarios();
		usuarios.borrarUsario(idUsuario);
		
		ventanaAdministracionUsuarios.dispose();
		new AdminUsuarios();
		
	}
	
}
