package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import controller.botones.ControllerBotones;
import view.elementos.Boton;
import view.elementos.Botonera;
import view.elementos.Pantalla;

public class ColumnaDisplay extends JPanel {
	
	public ColumnaDisplay() {
		
		this.setBorder(BorderFactory.createTitledBorder("Display"));
		this.setPreferredSize(new Dimension(1000,800));
		this.setLayout(new GridLayout(2, 1));
		
		
		JPanel displaySuperior = new JPanel();
		displaySuperior.setBorder(BorderFactory.createTitledBorder("Display Superior"));
		displaySuperior.setPreferredSize(new Dimension(1000,600));
		displaySuperior.setLayout(new BorderLayout());
		
		
		JPanel botonesIzquierda = new JPanel();
		botonesIzquierda.setLayout(new GridLayout(3, 1));
		for (int bindex = 0; bindex <= 2; bindex++) {
			
			int numAccion = bindex + 1;
			
			botonesIzquierda.add(new Boton( "Acción " + numAccion, new ControllerBotones() ));
			
		}
		displaySuperior.add(botonesIzquierda, BorderLayout.LINE_START);
		
		
		displaySuperior.add(new Pantalla(), BorderLayout.CENTER);

		
		JPanel botonesDerecha = new JPanel();
		botonesDerecha.setLayout(new GridLayout(3, 1));
		for (int bindex = 3; bindex <= 5; bindex++) {
			
			int numAccion = bindex + 1;
			botonesDerecha.add(new Boton( "Acción " + numAccion, new ControllerBotones() ));
			
		}
		displaySuperior.add(botonesDerecha, BorderLayout.LINE_END);
		
		
		
		this.add(displaySuperior);
		this.add(new Botonera());
		
	}
	
}
