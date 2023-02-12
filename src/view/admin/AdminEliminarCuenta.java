package view.admin;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.admin.ControllerAdminCuentas;
import controller.admin.ControllerAdminUsuarios;
import view.elementos.Desplegable;

public class AdminEliminarCuenta extends JFrame {

	private ControllerAdminCuentas controllerCuentas = new ControllerAdminCuentas(this);
	private JFrame ventanaadminCuentas;
 	

	public AdminEliminarCuenta(JFrame padre, Object idUsuario) {
		
		//this.ventanaadminCuentas = padre;
		this.setTitle("Seleccion de Cuenta");
    	this.setLayout(new GridLayout(0, 1));
    	
    	
    	JPanel panel = new JPanel();
    	panel.setBorder(BorderFactory.createTitledBorder("Cuentas"));
    	panel.setLayout(new FlowLayout());
    	
    	
    	
    	Desplegable desplegable = new Desplegable();
    	int idUsuarioSeleccionado = ControllerAdminUsuarios.getIdDeListaDeNombres(  (String)idUsuario  );
    	controllerCuentas.listarCuentas(desplegable, idUsuarioSeleccionado);
    	
    	JButton botonBorrado = new JButton("Eliminar");
    	botonBorrado.addActionListener( e -> {
    		
			
    		controllerCuentas.eliminarCuenta(  ControllerAdminUsuarios.getIdDeListaDeNombres(  (String)desplegable.getValor()  )  );
    		padre.dispose();
    		new AdminCuentas();
			this.dispose();
			
			
		});
		
    	panel.add(desplegable);
		panel.add(botonBorrado);
    	
    	this.add(panel);
        this.setPreferredSize(new Dimension(550,250));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	
	}
	
}
