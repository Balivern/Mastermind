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
		this.propositions = new Rangee[N_TENTATIVES];
		for (int i = 0; i < N_TENTATIVES; i++) {
			this.propositions[i] = new Rangee(this);
			
		}
		this.tentative = 0;
	}
	public void initialiserCombinaison() {
		Random rand = new Random();
		for (int i = 0; i < DIFFICULTE; i++) {
			int couleurIndice = rand.nextInt(COULEURS.length);
			//this.combinaison.ajouterJeton(i,COULEURS[]);
		}
		
		
		
	}
	
	
	public void AjouterProposition(Rangee proposition) {
		if (etat !=Etat.EN_COURS) {
			return;
		}
		propositions[tentative] = proposition;
		
		//if(combinaison.e)
	}
	
	
	
	
	public void verfierPropostion() {
		int noirs = 0;
		int blancs = 0;
		for(int i=0; i<DIFFICULTE; i++) {
			//if(this.propositions[this.tentative].getJeton(i))==this.combinaison.getJeton(i)){
				//noirs++;
			//}else {
				//for(int j = 0; j<DIFFICULTE;j++) {
					
					
				//}
			//}
		//}
	}
		
		
	// verifier Gange
		
		
		
	// verifier Perdu
	
		
		
		
		
		
	
	
	


}
	
}
