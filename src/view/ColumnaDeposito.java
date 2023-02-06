package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import view.elementos.Botonera;
import view.elementos.Desplegable;
import view.elementos.Lista;

public class ColumnaDeposito {

	static JPanel panelColumnaDeposito = new JPanel();
	public ColumnaDeposito() {
	
		panelColumnaDeposito.setBorder(BorderFactory.createTitledBorder("Deposito"));
		panelColumnaDeposito.setPreferredSize(new Dimension(500,800));
		
		panelColumnaDeposito.setLayout(new GridLayout(0, 1));
		
		for (int bindex = 0; bindex < 1; bindex++) {
			
			panelColumnaDeposito.add(new Lista());
			panelColumnaDeposito.add(new Desplegable());
			panelColumnaDeposito.add(new Botonera());
			
		}
		
	}
	
}
