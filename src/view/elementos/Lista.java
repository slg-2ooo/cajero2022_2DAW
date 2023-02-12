package view.elementos;

import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Lista extends JPanel {

	private JList lista = new JList();
	private JScrollPane scroll = new JScrollPane();
	
	public Lista() {
		
		String[] info = {"Pato", "Loro", "Perro", "Cuervo", "Pato", "Loro", "Perro", "Pato", "Loro", "Perro", "Pato", "Loro", "Perro", "Pato", "Loro", "Perro"};
		
		DefaultListModel<String> modelo = new DefaultListModel<>();  
		
		for (int iintex = 0; iintex < info.length; iintex++) {
			modelo.addElement(info[iintex]); 
		}

		lista.setModel(modelo);
		scroll.setViewportView(lista);
		lista.setLayoutOrientation(JList.VERTICAL);
		
		
		this.add(lista);
		this.setPreferredSize(new Dimension(100,150));
		
	  }
	
	public Object getValor() {
		return lista.getSelectedValue();
	}
	
	public void setModel(String[] lista) {
		
		DefaultListModel<String> modelo = new DefaultListModel<>();  
		
		for (int iintex = 0; iintex < lista.length; iintex++) {
			modelo.addElement(lista[iintex]); 
		}
		
		this.lista.setModel(modelo);
		
	}
	
	
}
