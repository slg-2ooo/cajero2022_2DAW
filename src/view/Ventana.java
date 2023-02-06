package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Ventana {

	JFrame ventana = new JFrame("Cajero");
	private final GridBagConstraints constraints = new GridBagConstraints();
	
    public Ventana() {

    	ventana.setLayout(new GridBagLayout());


    	JPanel columnaDisplay = new ColumnaDisplay().panelColumnaDisplay;
    	JPanel columnaDeposito = new ColumnaDeposito().panelColumnaDeposito;
    	
    	
    	constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(2, 2, 2, 2);
        
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        ventana.getContentPane().add(columnaDisplay, constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        ventana.getContentPane().add(columnaDeposito, constraints);

        
        ventana.setPreferredSize(new Dimension(1525,850));
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        //ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
	
}
