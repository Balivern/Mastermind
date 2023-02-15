package mastermind;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Application extends JFrame implements WindowListener {
	
	Modele modele;
	JPanel bandeau;
	Canvas vuePropositions;
	JPanel vueClavier;
	JButton [] boutons = new JButton[Modele.COULEURS.length];
	
	public Application() {
		
		this.bandeau = new JPanel();
		JLabel titre = new JLabel("  Mastermind, à toi de jouer !");
		this.bandeau.add(titre);
		
		this.vuePropositions = new Canvas();
		
		this.vuePropositions.setBackground(Color.WHITE);
		
		this.vueClavier = new JPanel();
		
		for (int i=0; i<Modele.COULEURS.length; i++) {
			this.boutons[i]=new JButton();
		}
		for (int i=0; i<Modele.COULEURS.length; i++) {
			this.boutons[i].setBackground(Modele.COULEURS[i]);
		}
		
		this.setLayout(new BorderLayout(20,10));
		this.vueClavier.setLayout(new BoxLayout(vueClavier, BoxLayout.X_AXIS));
		
		for (int i=0; i<Modele.COULEURS.length; i++) {
			this.vueClavier.add(this.boutons[i]);
		}
		
		this.add(bandeau, BorderLayout.NORTH);
		this.add(vuePropositions, BorderLayout.CENTER);
		this.add(vueClavier, BorderLayout.SOUTH);
		this.setSize(300,500);
		this.setVisible(true);

	}
	
	public static void main(String[] args) {
		new Application();
	}
	
	public void afficher_proposition() {
		for (int i=0; i<this.modele.propositions.length; i++) {
			//this.vuePropositions.add(this.modele.propositions[i]);
		}
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
