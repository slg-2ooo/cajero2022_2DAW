package view.elementos;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Botonera extends JPanel {

	public Botonera() {
		
		this.setBorder(BorderFactory.createTitledBorder("Display"));
		this.setPreferredSize(new Dimension(300, 200));
		this.setLayout(new GridLayout(0, 1));
		
		
		JPanel botonesNumeros = new JPanel();
		botonesNumeros.setLayout(new GridLayout(0, 2));
		
		for (int ibutton = 0; ibutton < 10; ibutton++) {
			botonesNumeros.add(new Boton("" + ibutton));
		}
		
		this.add(botonesNumeros);
		
		
		JPanel botonesAccion = new JPanel();
		//botonesAccion.setPreferredSize(new Dimension(300, 150));
		botonesAccion.setLayout(new GridLayout(0, 2));
		Boton botonAccionConfirmar = new Boton("Aceptar");
		Boton botonAccionCancelar = new Boton("Cancelar");
		botonesAccion.add(botonAccionConfirmar);
		botonesAccion.add(botonAccionCancelar);
		
		this.add(botonesAccion);
		
	}
	
}
