package zadaci_15_1_2016;

import java.util.Scanner;

//Napisati program koji uèitava niz brojeva, pronalazi najveæi broj 
//te ispisruje koliko se puta taj broj ponavlja. 
//Pretpostavimo da se unos brojeva završava sa nulom.

public class NajveciPonavljanjeZ5 {

	public static void main(String[] args) {

		int[] niz = new int[50]; // kreiramo niz od 50 brojeva
		Scanner unos = new Scanner(System.in); // kreiramo skener za unos
		System.out.println("Molimo unesite niz brojeva"); // unos brojeva

		for (int i = 0; i < niz.length; i++) { // upis brojeva u niz
			niz[i] = unos.nextInt();
			if (niz[i] == 0) // ako unesemo nulu prekida
				break;
		}

		int max = 0; // pocetna vrijednost max
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max) { // maksimum
				max = niz[i];
			}
		}
		int brojac = 0; // pocetna vrijednost brojaca
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == max)
				brojac++;
		}

		System.out.println("Najveci uneseni broj je " + max + ", najveci se ponavlja " + brojac + " puta");
		unos.close(); // ispisujemo najveci i zatvaramo unos
	}
}