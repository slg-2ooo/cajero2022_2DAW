package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import view.admin.AdminCuentas;
import view.admin.AdminUsuarios;

public class Menu extends JMenuBar {
	
	private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;

	public Menu() {
        
        menu1=new JMenu("Menú");
        
        JMenuItem mi1=new JMenuItem("Usuarios");
        mi1.addActionListener( e -> {
        	new AdminUsuarios();
        });
        menu1.add(mi1);
        mi2=new JMenuItem("Cuentas");
        mi2.addActionListener( e -> {
        	new AdminCuentas();
        });
        menu1.add(mi2);
        
        this.add(menu1);
        
	}
	
}
