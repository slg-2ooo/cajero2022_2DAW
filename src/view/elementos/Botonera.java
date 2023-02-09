package view.elementos;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Objects;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Botonera extends JPanel {
	
	private int valorBotonera;

	public Botonera() {
		
		this.setBorder(BorderFactory.createTitledBorder("Botonera"));
		this.setPreferredSize(new Dimension(300, 200));
		this.setLayout(new GridLayout(0, 1));
		
		
		JPanel displayBotonera = new JPanel();
		JTextField areaDisplayBotonera = new JTextField();
		areaDisplayBotonera.setEditable(false);
		areaDisplayBotonera.setPreferredSize(new Dimension(300, 50));
		
		areaDisplayBotonera.setText(Integer.toString(this.valorBotonera));
		areaDisplayBotonera.setColumns(10);
		
		displayBotonera.add(areaDisplayBotonera);
		this.add(displayBotonera);
		
		
		JPanel botonesNumeros = new JPanel();
		botonesNumeros.setLayout(new GridLayout(0, 2));
		
		for (int ibutton = 0; ibutton < 10; ibutton++) {
			Boton boton = new Boton("" + ibutton, ibutton);
			
			boton.addActionListener( e ->  {
				this.valorBotonera += boton.getValor();
				areaDisplayBotonera.setText(Integer.toString(this.valorBotonera));
				System.out.println(this.valorBotonera);
	        });
			
			botonesNumeros.add(boton);
		}
		
		this.add(botonesNumeros);
		
		
		JPanel botonesAccion = new JPanel();
		botonesAccion.setPreferredSize(new Dimension(100, 50));
		botonesAccion.setLayout(new GridLayout(0, 2));
		Boton botonAccionConfirmar = new Boton("Aceptar");
		Boton botonAccionCancelar = new Boton("Cancelar");
		
		
		botonAccionConfirmar.addActionListener( e ->  {
			
			System.out.println(Integer.parseInt(areaDisplayBotonera.getText()));
			areaDisplayBotonera.setText("0");
			
        });
		
		botonAccionCancelar.addActionListener( e ->  {
			
			System.out.println(areaDisplayBotonera);
			areaDisplayBotonera.setText("0");
			
        });
		
		
		botonesAccion.add(botonAccionConfirmar);
		botonesAccion.add(botonAccionCancelar);
		
		this.add(botonesAccion);
		
	}
	
	private void botonBotonera(int boton) {
		
	}
	
}
