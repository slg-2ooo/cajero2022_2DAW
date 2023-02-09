package view.admin;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.ColumnaDeposito;
import view.ColumnaDisplay;
import view.Menu;
import view.elementos.Desplegable;
import view.elementos.Lista;

public class AdminUsuarios extends JFrame {
	
    public AdminUsuarios() {
    	
    	setTitle("Usuarios");

    	this.setLayout(new GridLayout(0, 1));
    	
    	
    	JPanel panel = new JPanel();
    	panel.setLayout(new GridLayout(2, 1));
    	
    	
    	JPanel panelCreacion = new JPanel();
    	panelCreacion.setLayout(new FlowLayout());
		for (int bindex = 0; bindex < 1; bindex++) {
			
			panelCreacion.add(new Lista());
			panelCreacion.add(new Desplegable());
			panelCreacion.add(new Lista());
			panelCreacion.add(new Desplegable());
			panelCreacion.add(new Lista());
			panelCreacion.add(new Desplegable());
			
		}
		
		
		JPanel panelBorrado = new JPanel();
		panelBorrado.setLayout(new FlowLayout());
		for (int bindex = 0; bindex < 1; bindex++) {
			
			panelBorrado.add(new Lista());
			panelBorrado.add(new Desplegable());
			
		}
		
		
		panel.add(panelCreacion);
		panel.add(panelBorrado);

        
		
		this.add(panel);
        this.setPreferredSize(new Dimension(1000,650));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
		
	}
	
}
