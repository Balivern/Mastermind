package mastermind;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application extends JFrame {
	
	public JFrame frame;
	public JPanel vueClavier;
	
	public Application() {
		
	this.frame = new JFrame();
	
	this.vueClavier = new JPanel();
	JButton bouton_jaune = new JButton();
	bouton_jaune.setBackground(Modele.COULEURS[0]);
	JButton bouton_vert = new JButton();
	bouton_vert.setBackground(Modele.COULEURS[1]);
	JButton bouton_bleu = new JButton();
	bouton_bleu.setBackground(Modele.COULEURS[2]);
	JButton bouton_magenta = new JButton();
	bouton_magenta.setBackground(Modele.COULEURS[3]);
	JButton bouton_rouge = new JButton();
	bouton_rouge.setBackground(Modele.COULEURS[4]);
	JButton bouton_orange = new JButton();
	bouton_orange.setBackground(Modele.COULEURS[5]);
	JButton bouton_blanc = new JButton();
	bouton_blanc.setBackground(Modele.COULEURS[6]);
	JButton bouton_noir = new JButton();
	bouton_noir.setBackground(Modele.COULEURS[7]);
	this.vueClavier.add(bouton_jaune);
	this.vueClavier.add(bouton_vert);
	this.vueClavier.add(bouton_bleu);
	this.vueClavier.add(bouton_magenta);
	this.vueClavier.add(bouton_rouge);
	this.vueClavier.add(bouton_orange);
	this.vueClavier.add(bouton_blanc);
	this.vueClavier.add(bouton_noir);
		
	Canvas vuePropositions = new Canvas();

	}
	public static void main(String[] args) {
		new Application();
	}
}
