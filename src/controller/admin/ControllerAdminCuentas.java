package controller.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;

import model.Cuentas;
import model.Usuarios;
import view.admin.AdminUsuarios;
import view.elementos.Lista;

public class ControllerAdminCuentas {
	
	private JFrame ventanaAdministracionUsuarios;

	public ControllerAdminCuentas(JFrame frame) {
		
		this.ventanaAdministracionUsuarios = frame;
		
	}
	
	public void listarCuentas(Lista lista) {
		Cuentas cuentas = new Cuentas();
		ArrayList<String> itemsLista = new ArrayList<String>();
		
		ArrayList<HashMap<?, ?>> listaCuentas = cuentas.listarCuentas();
		
		for (Iterator iterator = listaCuentas.iterator(); iterator.hasNext();) {
			HashMap<String, Object> type = (HashMap<String, Object>) iterator.next();

			int idCuenta = (int)type.get("idCuenta");
			itemsLista.add("(" + idCuenta +")");
			
		}
		
		String[] info = itemsLista.toArray(new String[itemsLista.size()]);
		lista.setModel(info);
	}
	
	public HashMap<String, Object> buscarUsuario(int idUsuario) {
		
		Usuarios usuarios = new Usuarios();
		return usuarios.buscarUsario(idUsuario);
		
	}
	
	public int getIdDeListaDeNombres(String nombreConId) {
		
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
