package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;


public class Ventana extends JFrame {

	private final GridBagConstraints constraints = new GridBagConstraints();
	
    public Ventana() {
    	

    	this.setTitle("Cajero");
    	
    	Menu menu = new Menu();
    	this.setJMenuBar(menu);

    	this.setLayout(new GridBagLayout());


    	ColumnaDisplay columnaDisplay = new ColumnaDisplay();
    	ColumnaDeposito columnaDeposito = new ColumnaDeposito();
    	
    	
    	constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(2, 2, 2, 2);
        
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.getContentPane().add(columnaDisplay, constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        this.getContentPane().add(columnaDeposito, constraints);

        
        this.setPreferredSize(new Dimension(1525,865));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
	
}
