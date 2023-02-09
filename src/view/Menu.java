package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {
	
	private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;

	public Menu() {
        
        menu1=new JMenu("Menú");
        
        JMenuItem mi1=new JMenuItem("Usuarios");
        mi1.addActionListener( e -> {
        	System.out.println(e);
        });
        menu1.add(mi1);
        mi2=new JMenuItem("Cuentas");
        mi2.addActionListener( e -> {
        	System.out.println(e);
        });
        menu1.add(mi2);
        
        this.add(menu1);
        
	}
	
}
