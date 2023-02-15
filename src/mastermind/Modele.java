package mastermind;

import java.awt.*;
import java.util.*;

public class Modele {
	
	static final Color[] COULEURS = {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	static final int N_TENTATIVES = 10;
	static final int DIFFICULTE = 4;
	
	
	public enum Etat{
		EN_COURS,GAGNE,PERDU
	}
	
	public Etat etat;
	public Rangee combinaison;
	public Rangee[] propositions;
	public int tentative;
	
	
	public Modele() {
		this.etat=Etat.EN_COURS;
		this.combinaison.aleatoire();
		this.propositions = new Rangee(this)[N_TENTATIVES];
		for (int i = 0; i < N_TENTATIVES; i++) {
			this.propositions[i] = new Rangee();
			
		}
		this.tentative = 0;
	}
	public void initialiserCombinaison() {
		Random rand = new Random();
		for (int i = 0; i < DIFFICULTE; i++) {
			int couleurIndice = rand.nextInt(COULEURS.length);
			this.combinaison.jeton(i,COULEURS[])
		}
		
	}
	
	
	
	


}
