package view.elementos;

import java.awt.Dimension;

import javax.swing.JButton;

import controller.botones.ControllerBotones;

public class Boton extends JButton {
	
	private int valor;
	
	public Boton(String text) {
		
		this.setText(text);
		this.setPreferredSize(new Dimension(250, 150));
		
	}
	
	public Boton(String text, int valor) {
		
		this.valor = valor;
		this.setText(text);
		this.setPreferredSize(new Dimension(250, 150));
		
	}
	
	public Boton(String text, ControllerBotones accion) {
		
		this.setText(text);
		this.setPreferredSize(new Dimension(250, 150));
		
		this.addActionListener( e ->  {
            
			accion.funcionPrueba(text);
			accion.funcionPrueba(e);

        });
		
	}
	
	public int getValor() {
		return valor;
	}
	
}
