package appliVISITEUR;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class menu extends JFrame{JMenu menu;  
JMenuItem i1, i2, j1, j2,k1,k2,l1,l2,m1,m2;  
menu(){  
	  Font p = new Font("open-sans", Font.PLAIN, 24);
      UIManager.put("Menu.font", p);
      UIManager.put("MenuItem.font", p);
  
	JFrame f= new JFrame("GSB-Intranet"); 
	JMenuBar mb=new JMenuBar();
	mb.setBackground(new Color (0,63,128));
	mb.setForeground(Color.WHITE);
    UIManager.put("Menu.foreground", Color.white);
    UIManager.put("MenuItem.background", new Color (0,63,128));
    UIManager.put("MenuItem.foreground", Color.white);
    UIManager.put("Menu.selectionBackground", new Color (0,63,128));
    UIManager.put("Menu.selectionForeground", Color.white);
    UIManager.put("MenuItem.selectionBackground", new Color (0,63,128));
    UIManager.put("MenuItem.selectionForeground", Color.white);


    
	
	//first link
	menu = new JMenu("Accueil");
	mb.add(menu);
	
	//second link
	menu=new JMenu("Compte rendu");  
	//submenu=new JMenu("Sub Menu");  
	i1=new JMenuItem("Saisie");  
	i2=new JMenuItem("Consultation");    
	menu.add(i1); menu.add(i2);  
	mb.add(menu); 
	
	//third link
	menu = new JMenu("Générateur de power point");
	j1= new JMenuItem("Saisie");
	j2 = new JMenuItem("Consultation");
	menu.add(j1); menu.add(j2);
	mb.add(menu);
	
	//fourth link
	menu = new JMenu("Messagerie");
	k1= new JMenuItem("Ecrire un message");
	k2 = new JMenuItem("Consultation");
	menu.add(k1);menu.add(k2);
	mb.add(menu);
	
	//fifth link
	menu = new JMenu("Agenda");
	mb.add(menu);
	
	//six link 
	menu = new JMenu("Informations Médecins");
	l1= new JMenuItem("Ajouter un médecin");
	l2 = new JMenuItem("Consultation de la liste des médecins");
	menu.add(l1);menu.add(l2);
	mb.add(menu);
	
	//seven link
	menu = new JMenu("Utilisateurs");
	m1 = new JMenuItem("Ajouter un utilisateur");
	m2 = new JMenuItem("Consultation de la liste des utilisateurs");
	menu.add(m1);menu.add(m2);
	mb.add(menu);
	//last link 
	menu = new JMenu("Déconnexion");
	mb.add(menu);
	
	//windows size
	f.setJMenuBar(mb);  
	f.setSize(1800,1000);  
	f.setLayout(null);  
	f.setVisible(true);  
}  
public static void main(String args[])  
{  
new menu();  
}}  

