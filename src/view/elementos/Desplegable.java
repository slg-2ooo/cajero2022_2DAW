package view.elementos;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Desplegable extends JPanel {
	
	private JComboBox desplegable = new JComboBox();
	private JScrollPane scroll = new JScrollPane();

	public Desplegable() {
		
		String[] catalogo = {"Seat Ibiza Passion", "Renault Megane CC", "Citroen Xsara Picasso"};
		
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel();
		
		for (int iitems = 0; iitems < catalogo.length; iitems++) {
			modelo.addElement(catalogo[iitems]);
		}
		
		desplegable.setModel(modelo);
		this.add(desplegable);
		//JComboBox<String> coches = new JComboBox<String>(catalogo);
		
	}
	
	
	public Object getValor() {
		return desplegable.getSelectedItem();
	}
	
	public void setModel(String[] lista) {
		
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();  
		
		for (int iintex = 0; iintex < lista.length; iintex++) {
			modelo.addElement(lista[iintex]); 
		}
		
		this.desplegable.setModel(modelo);
		
	}
	
}
