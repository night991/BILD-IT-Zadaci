package zadaci_27_1_2016;

import java.util.Scanner;

/*Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te 
 * ispisuje koje pakovanje ima bolju cijenu.*/

public class Z5PoredenjeCijene {

	// glavna metoda za poredenje ponuda
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Molimo unesite tezinu prvog pakovanja");
		double pak1 = unos.nextDouble();
		System.out.println("Molimo unesite cijenu pakovanja");
		double cijena1 = unos.nextDouble();
		System.out.println("Molimo unesite tezinu drugog pakovanja");
		double pak2 = unos.nextDouble();
		System.out.println("Molimo unesite cijenu pakovanja");
		double cijena2 = unos.nextDouble();
		// poredenje cijena/kolicina
		double ponuda1 = cijena1 / pak1;
		double ponuda2 = cijena2 / pak2;
		// uslovi za izbor povoljnije ponude
		if (ponuda1 > ponuda2) {
			System.out.println("Ponuda 2 je povoljnija.");
		} else if (ponuda2 > ponuda1) {
			System.out.println("Ponuda 2 je povoljnija.");
		} else {
			System.out.println("Ponude su identicne.");
		}

	}

}