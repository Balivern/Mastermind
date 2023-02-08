package mastermind;

import java.awt.Color;
import java.awt.*;

public class Modele extends Frame {
	
	static final Color[] COULEURS = {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	static final int N_TENTATIVES = 10;
	static final int DIFFICULTE = 4;
	
	
	public enum Etat{
		EN_COURS,GAGNE,PERDU
	}
	
	private Etat etat;
	private Rangee combinaison;
	private Rangee[] propositions;
	private int tentative;
	
	
	public Modele() {
		this.etat=Etat.EN_COURS;
		this.combinaison = new Rangee(DIFFICULTE,COULEURS);
		this.combinaison.TirerRnd();
		this.propositions = new Rangee[N_TENTATIVES];
		for (int i = 0; i < N_TENTATIVES; i++) {
			this.propositions[i] = new Rangee(DIFFICULTE, COULEURS);
			
		}
		this.tentative = 0;
	}
	
	public PlatDeJeu() {
		setTitle("Mastermind");
		setSize(400,400);
		setVisible(true);
	}
	
	
	


}
