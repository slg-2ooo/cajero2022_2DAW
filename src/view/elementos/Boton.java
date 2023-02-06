package view.elementos;

import java.awt.Dimension;

import javax.swing.JButton;

import controller.botones.ControllerBotones;

public class Boton extends JButton {
	
	public Boton(String text) {
		
		this.setText(text);
		this.setPreferredSize(new Dimension(250, 150));
		
		this.addActionListener( e ->  {
            
			ControllerBotones.funcionPrueba(text);
			ControllerBotones.funcionPrueba(e);

        });
		
	}
	
}
