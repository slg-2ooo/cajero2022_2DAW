package view.elementos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BotonImagen extends JButton {

	public BotonImagen(String nombreImagen) {
		
		try {
			
			String assetsPath = System.getProperty("user.dir") + "\\assets\\";
			
			BufferedImage myPicture = ImageIO.read(new File(assetsPath + nombreImagen));
			this.setIcon(new ImageIcon(myPicture.getScaledInstance(300, 150, 50)));
			this.setBorder(BorderFactory.createEmptyBorder());
			this.setContentAreaFilled(false);
			
		} catch (IOException e) {
			System.out.println(e);
			JLabel picLabel = new JLabel("La imagen no se ha podido cargar");
			this.add(picLabel);
		}
		
	}
	
}
