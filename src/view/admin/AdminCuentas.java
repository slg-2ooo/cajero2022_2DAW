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

public class AdminCuentas extends JFrame {
	
    public AdminCuentas() {
    	
    	this.setTitle("Cuentas");
    	this.setLayout(new GridLayout(0, 1));
    	
    	JPanel panel = new JPanel();
    	panel.setLayout(new GridLayout(2, 1));
    	
    	/*
    	 * Panel de creacion de cuentas
    	 */
    	JPanel panelCreacion = new JPanel();
    	panelCreacion.setBorder(BorderFactory.createTitledBorder("Crear Cuenta"));
    	panelCreacion.setLayout(new FlowLayout());

  
    	JLabel labelUsuarioCreacion = new JLabel("Selecciona Usuario");
    	Lista listaUsuariosCreacion = new Lista();
    	JLabel labelSaldoCreacion = new JLabel("Saldo");
    	JTextField saldoCreacion = new JTextField(20);
		
    	panelCreacion.add(labelUsuarioCreacion);
		panelCreacion.add(listaUsuariosCreacion);
		panelCreacion.add(labelSaldoCreacion);
		panelCreacion.add(saldoCreacion);

		
		JButton botonCreacion = new JButton("Crear");
		botonCreacion.addActionListener( e -> {
			
			
			System.out.println(e);
			System.out.println(listaUsuariosCreacion.getValor());
			System.out.println(saldoCreacion.getText());
			
			
		});
		panelCreacion.add(botonCreacion);
		
		
		/*
    	 * Panel de eliminacion de cuentas
    	 */
		JPanel panelBorrado = new JPanel();
		panelBorrado.setBorder(BorderFactory.createTitledBorder("Eliminar cuenta"));
		panelBorrado.setLayout(new FlowLayout());

		JLabel labelUsuarioBorrado = new JLabel("Selección Usuario");
    	Lista listaUsuariosBorrado = new Lista();
    	JLabel labelCuentaBorrado = new JLabel("Selección Cuenta");
    	Desplegable desplegableCuentaBorrado = new Desplegable();
    	JLabel labelSaldoBorrado = new JLabel("Saldo");
    	JTextField saldoBorrado = new JTextField(20);
    	saldoBorrado.setEditable(false);
		
    	panelBorrado.add(labelUsuarioBorrado);
    	panelBorrado.add(listaUsuariosBorrado);
    	panelBorrado.add(labelCuentaBorrado);
    	panelBorrado.add(desplegableCuentaBorrado);
    	panelBorrado.add(labelSaldoBorrado);
    	panelBorrado.add(saldoBorrado);
		
		JButton botonBorrado = new JButton("Eliminar");
		botonBorrado.addActionListener( e -> {
			
			
			System.out.println(e);
			System.out.println(listaUsuariosBorrado.getValor());
			System.out.println(desplegableCuentaBorrado.getSelectedItem());
			System.out.println(saldoBorrado.getText());
			
			
		});
		panelBorrado.add(botonBorrado);
		
		/*
    	 * Anadir paneles a la vista de administracion de usuarios
    	 */
		panel.add(panelCreacion);
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
