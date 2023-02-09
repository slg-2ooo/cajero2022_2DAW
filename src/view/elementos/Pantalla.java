package view.elementos;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pantalla extends JPanel {
	
	private String texto = "Bienvenido a tu banco";
	
	public Pantalla() {
		
		JTextField areaDisplayBotonera = new JTextField();
		areaDisplayBotonera.setEditable(false);
		areaDisplayBotonera.setPreferredSize(new Dimension(900, 300));
		
		areaDisplayBotonera.setText(this.texto);
		areaDisplayBotonera.setColumns(10);
		
		this.add(areaDisplayBotonera);
	
	}

}
