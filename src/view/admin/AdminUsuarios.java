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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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

    	
    	JLabel labelNombreCreacion = new JLabel("Nombre");
    	JTextField nombreCreacion = new JTextField(20);
    	JLabel labelApellidoCreacion = new JLabel("Apellidos");
    	JTextField apellidosCreacion = new JTextField(20);
    	JLabel labelContrasennaCreacion = new JLabel("Contraseña");
    	JPasswordField contrasennaCreacion = new JPasswordField(10);
		
    	panelCreacion.add(labelNombreCreacion);
		panelCreacion.add(nombreCreacion);
		panelCreacion.add(labelApellidoCreacion);
		panelCreacion.add(apellidosCreacion);
		panelCreacion.add(labelContrasennaCreacion);
		panelCreacion.add(contrasennaCreacion);

		
		JButton botonCreacion = new JButton("Crear");
		botonCreacion.addActionListener( e -> {
			
			
			System.out.println(e);
			System.out.println(nombreCreacion.getText());
			System.out.println(apellidosCreacion.getText());
			System.out.println(contrasennaCreacion.getPassword());
			
			
		});
		panelCreacion.add(botonCreacion);

			
		/*
    	 * Panel de edicion de usuarios
    	 */
		JPanel panelEdicion = new JPanel();
		panelEdicion.setBorder(BorderFactory.createTitledBorder("Editar usuario"));
		panelEdicion.setLayout(new FlowLayout());

		
		Lista listaEdicion = new Lista();
    	Desplegable desplegableEdicion = new Desplegable();
    	
    	JLabel labelNombreEdicion = new JLabel("Nombre");
    	JTextField nombreEdicion = new JTextField(20);
    	JLabel labelApellidoEdicion = new JLabel("Apellidos");
    	JTextField apellidosEdicion = new JTextField(20);
    	JLabel labelContrasennaEdicion = new JLabel("Contraseña");
    	JPasswordField contrasennaEdicion = new JPasswordField(10);
		
		
    	panelEdicion.add(listaEdicion);
    	panelEdicion.add(labelNombreEdicion);
    	panelEdicion.add(nombreEdicion);
    	panelEdicion.add(labelApellidoEdicion);
    	panelEdicion.add(apellidosEdicion);
    	panelEdicion.add(labelContrasennaEdicion);
    	panelEdicion.add(contrasennaEdicion);
		
		
		JButton botonEdicion = new JButton("Editar");
		botonEdicion.addActionListener( e -> {
			
			
			System.out.println(e);
			System.out.println(listaEdicion.getValor());
			System.out.println(nombreEdicion.getText());
			System.out.println(apellidosEdicion.getText());
			System.out.println(contrasennaEdicion.getPassword());
			
			
		});
		panelEdicion.add(botonEdicion);

		
		/*
    	 * Panel de eliminacion de usuarios
    	 */
		JPanel panelBorrado = new JPanel();
		panelBorrado.setBorder(BorderFactory.createTitledBorder("Eliminar usuarios"));
		panelBorrado.setLayout(new FlowLayout());

		Lista listaBorrado = new Lista();
    	Desplegable desplegableBorrado = new Desplegable();
    	
    	JTextField nombreBorrado = new JTextField(20);
    	nombreBorrado.setEditable(false);
    	JTextField apellidosBorrado = new JTextField(20);
    	apellidosBorrado.setEditable(false);
		
    	panelBorrado.add(listaBorrado);
    	panelBorrado.add(nombreBorrado);
    	panelBorrado.add(apellidosBorrado);
		
		JButton botonBorrado = new JButton("Eliminar");
		botonBorrado.addActionListener( e -> {
			

			System.out.println(e);
			System.out.println(listaBorrado.getValor());
			System.out.println(nombreBorrado.getText());
			System.out.println(apellidosBorrado.getText());
			
			
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
