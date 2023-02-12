package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.elementos.BotonImagen;
import view.elementos.Desplegable;
import view.elementos.Lista;

public class ColumnaDeposito extends JPanel {

	public ColumnaDeposito() {
	
		this.setBorder(BorderFactory.createTitledBorder("Deposito"));
		this.setPreferredSize(new Dimension(500,800));
		
		this.setLayout(new GridLayout(0, 1));	
			
		this.add(new BotonImagen("tarjeta-credito.png"));
		
		this.add(new BotonImagen("billete5.jpg"));
		this.add(new BotonImagen("billete10.jpeg"));
		this.add(new BotonImagen("billete20.jpg"));
		this.add(new BotonImagen("billete50.jpg"));
		
	}
	
}
