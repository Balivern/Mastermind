package mastermind;

import java.awt.Color;

public class Modele {
	
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
		this.combinaison = new Rangee
	}
	
	
	


}
