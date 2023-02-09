package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import view.elementos.Botonera;
import view.elementos.Desplegable;
import view.elementos.Lista;

public class ColumnaDeposito extends JPanel {

	public ColumnaDeposito() {
	
		this.setBorder(BorderFactory.createTitledBorder("Deposito"));
		this.setPreferredSize(new Dimension(500,800));
		
		this.setLayout(new GridLayout(0, 1));
		
		for (int bindex = 0; bindex < 1; bindex++) {
			
			this.add(new Lista());
			this.add(new Desplegable());
			
		}
		
	}
	
}
