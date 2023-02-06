package view.elementos;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Desplegable extends JComboBox {

	public Desplegable() {
		
		String[] catalogo = {"Seat Ibiza Passion", "Renault Megane CC", "Citroen Xsara Picasso"};
		
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel();
		
		for (int iitems = 0; iitems < catalogo.length; iitems++) {
			modelo.addElement(catalogo[iitems]);
		}
		
		this.setModel(modelo);
		//JComboBox<String> coches = new JComboBox<String>(catalogo);
		
	}
	
}
