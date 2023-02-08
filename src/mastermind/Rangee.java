package mastermind;

import java.awt.Color;
import java.util.Random;

public class Rangee {
	int indicejeton;
	Color[] jeton;
	int[] resultat;
	
	public Rangee() {
		this.indicejeton=0;
		this.jeton = new Color[Modele.DIFFICULTE];
	}
	public static Rangee aleatoire() {
		Rangee solution = new Rangee();
		Random r = new Random();
		for (solution.indicejeton=0; solution.indicejeton<Modele.DIFFICULTE;solution.indicejeton+=1) {
			solution.jeton[solution.indicejeton]=Modele.COULEURS[r.nextInt(Modele.COULEURS.length)];
		}		
		return solution;
	}
public static void main(String[] args) {
	System.out.println(aleatoire());
}
}

