package view.elementos;

import javax.swing.DefaultListModel;
import javax.swing.JList;


public class Lista extends JList {

	
	public Lista() {
		
		String[] info = {"Pato", "Loro", "Perro", "Cuervo"};
		
		DefaultListModel<String> modelo = new DefaultListModel<>();  
		
		for (int iintex = 0; iintex < info.length; iintex++) {
			modelo.addElement(info[iintex]); 
		}

		this.setModel(modelo);

		/* El valor de la propiedad model de JList es un objeto que proporciona una visión de sólo lectura del vector info[].
		El método getModel() permite recoger ese modelo en forma de Vector de objetos, y utilizarlo con los métodos de la clase
		Vector, como getElementAt(i), que proporciona el elemento de la posición i del Vector.  */
		/*
		for (int i = 0; i < listaDatos.getModel().getSize(); i++) {
		    System.out.println(listaDatos.getModel().getElementAt(i));
		}
		*/
		
	  }
	
	
}
