package view.admin;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.ColumnaDeposito;
import view.ColumnaDisplay;
import view.Menu;
import view.elementos.Desplegable;
import view.elementos.Lista;

public class AdminUsuarios extends JFrame {
	
    public AdminUsuarios() {
    	
    	this.setTitle("Usuarios");
    	this.setLayout(new GridLayout(0, 1));
    	
    	JPanel panel = new JPanel();
    	panel.setLayout(new GridLayout(3, 1));
    	
    	/*
    	 * Panel de creacion de usuarios
    	 */
    	JPanel panelCreacion = new JPanel();
    	panelCreacion.setBorder(BorderFactory.createTitledBorder("Crear usuario"));
    	panelCreacion.setLayout(new FlowLayout());

			
		panelCreacion.add(new Lista());
		panelCreacion.add(new Desplegable());
		
		JButton botonCreacion = new JButton("Crear");
		botonCreacion.addActionListener( e -> {
			
			
			System.out.println(e);
			
			
		});
		panelCreacion.add(botonCreacion);

			
		/*
    	 * Panel de edicion de usuarios
    	 */
		JPanel panelEdicion = new JPanel();
		panelEdicion.setBorder(BorderFactory.createTitledBorder("Editar usuario"));
		panelEdicion.setLayout(new FlowLayout());

		panelEdicion.add(new Lista());
		panelEdicion.add(new Desplegable());
		panelEdicion.add(new Lista());
		panelEdicion.add(new Desplegable());
		
		JButton botonEdicion = new JButton("Editar");
		botonEdicion.addActionListener( e -> {
			
			
			System.out.println(e);
			
			
		});
		panelEdicion.add(botonEdicion);

		
		/*
    	 * Panel de eliminacion de usuarios
    	 */
		JPanel panelBorrado = new JPanel();
		panelBorrado.setBorder(BorderFactory.createTitledBorder("Eliminar usuarios"));
		panelBorrado.setLayout(new FlowLayout());

		panelBorrado.add(new Lista());
		panelBorrado.add(new Desplegable());
		
		JButton botonBorrado = new JButton("Eliminar");
		botonBorrado.addActionListener( e -> {
			
			
			System.out.println(e);
			
			
		});
		panelBorrado.add(botonBorrado);

		
		/*
    	 * Anadir paneles a la vista de administracion de usuarios
    	 */
		panel.add(panelCreacion);
		panel.add(panelEdicion);
		panel.add(panelBorrado);

        
		
		this.add(panel);
        this.setPreferredSize(new Dimension(1000,650));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
		
	}
	
}
