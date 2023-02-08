package mastermind;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application extends JFrame implements WindowListener {
	
	Modele modele;
	JPanel vueClavier;
	JButton [] boutons;
	
	public Application() {
		
	this.setLayout(new BorderLayout());
	
	Canvas vuePropositions = new Canvas();
	
	this.vueClavier = new JPanel();
	for (int i=0; i<Modele.COULEURS.length; i++) {
		this.boutons[i].add(new JButton());
	}
	for (int i=0; i<Modele.COULEURS.length; i++) {
		this.boutons[i].setBackground(Modele.COULEURS[i]);
	}
	for (int i=0; i<Modele.COULEURS.length; i++) {
		this.vueClavier.add(this.boutons[i]);
	}	

	}
	
	public static void main(String[] args) {
		new Application();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); 
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
