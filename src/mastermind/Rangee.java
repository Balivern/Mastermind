package mastermind;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Rangee {
	int indicejeton;
	Color[] jeton;
	int[] resultat;
	Modele m;
	
	public Rangee(Modele mod) {
		this.m=mod;
		this.indicejeton=0;
		this.jeton = new Color[Modele.DIFFICULTE];
	}
	
	public  Rangee aleatoire() {
		Rangee solution = new Rangee(this.m);
		Random r = new Random();
		for (solution.indicejeton=0; solution.indicejeton<Modele.DIFFICULTE;solution.indicejeton++) {
			solution.jeton[solution.indicejeton]=Modele.COULEURS[r.nextInt(Modele.COULEURS.length)];
		}		
		return solution;
	}
	
	public ArrayList evaluation() {
		ArrayList<Boolean> S = new ArrayList<Boolean>();
		for (indicejeton=0;indicejeton<Modele.DIFFICULTE;indicejeton++) {
			if (this.indicejeton==this.m.combinaison.indicejeton) {
				S.add(true);
			}
			else {
				S.add(false);
			}
		}
		return S;
	}
	
	public String toString() {
		String retour="";
		for (int i = 0; i<jeton.length;i++ ) {
			retour=retour+jeton[i];
		}
		return retour;
		
	}
	
	public static void main(String[] args) {
	}
}

