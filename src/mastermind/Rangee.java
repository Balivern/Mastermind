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
		ArrayList<Integer> S = new ArrayList<Integer>();
		for (indicejeton=0;indicejeton<Modele.DIFFICULTE;indicejeton++) {
			if (this.jeton[indicejeton]==this.m.combinaison.jeton[indicejeton]) {
				S.add(2);
			}
			else {
				for (int j=0;j<Modele.DIFFICULTE;j++) {
					if (this.jeton[indicejeton]==this.m.combinaison.jeton[j]) {
						S.add(1);
					}
					else {
						S.add(0);
					}
				}
			}
		}
		return S;
	}
	
	public void anulation (Rangee r) {
		if (r.indicejeton<Modele.DIFFICULTE && r.indicejeton>=0) {
			r.indicejeton--;
		}
	}
	
	public void ajouter_jeton(Rangee r, Integer i) {
		if (r.indicejeton<Modele.DIFFICULTE && r.indicejeton>=0) {
			r.jeton[r.indicejeton]
		}
		
		
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

