package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import view.elementos.Boton;
import view.elementos.Pantalla;

public class ColumnaDisplay {

	static JPanel panelColumnaDisplay = new JPanel();
	public ColumnaDisplay() {
	
		panelColumnaDisplay.setBorder(BorderFactory.createTitledBorder("Display"));
		panelColumnaDisplay.setPreferredSize(new Dimension(1000,800));
		
		panelColumnaDisplay.setLayout(new GridLayout(0, 2));
		
		for (int bindex = 0; bindex < 2; bindex++) {
			
			panelColumnaDisplay.add(new Boton("Botón " + bindex));
			
		}
		
		
		panelColumnaDisplay.add(new Pantalla());

		
		for (int bindex = 3; bindex < 5; bindex++) {
			
			panelColumnaDisplay.add(new Boton("Botón " + bindex));
			
		}
		
	}
	
}
