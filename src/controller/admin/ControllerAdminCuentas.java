package controller.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;

import model.Cuentas;
import model.Usuarios;
import view.admin.AdminCuentas;
import view.admin.AdminUsuarios;
import view.elementos.Desplegable;
import view.elementos.Lista;

public class ControllerAdminCuentas {
	
	private JFrame ventanaAdministracionCuentas;

	public ControllerAdminCuentas(JFrame frame) {

		this.ventanaAdministracionCuentas = frame;
		
	}
	
	
	public void listarCuentas(Desplegable lista, int idUsuario) {
		Cuentas cuentas = new Cuentas();
		ArrayList<String> itemsLista = new ArrayList<String>();
		
		ArrayList<HashMap<?, ?>> listaCuentas = cuentas.listarCuentas(idUsuario);
		
		for (Iterator iterator = listaCuentas.iterator(); iterator.hasNext();) {
			HashMap<String, Object> type = (HashMap<String, Object>) iterator.next();

			int idCuenta = (int)type.get("idCuenta");
			itemsLista.add("(" + idCuenta +")");
			
		}
		
		String[] info = itemsLista.toArray(new String[itemsLista.size()]);
		lista.setModel(info);
	}
	
	
	public void crearCuenta(int idUsuario, int saldo) {
		
		Cuentas cuentas = new Cuentas();
		cuentas.insertarCuenta(idUsuario, saldo);
		
		ventanaAdministracionCuentas.dispose();
		new AdminCuentas();
		
	}
	
	public void eliminarCuenta(int idCuenta) {
		
		Cuentas cuentas = new Cuentas();
		cuentas.borrarCuenta(idCuenta);
		
		ventanaAdministracionCuentas.dispose();
		
	}
	
}
