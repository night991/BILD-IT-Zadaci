package zadaci_26_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

/*Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 
 * te broji i ispisuje koliko je koji broj puta unijet. 
 * Pretpostavimo da nula prekida unos brojeva. 
 * Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 
 * program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, 
 * broj 6 2 puta, broj 23 jednom, itd.*/

public class Z5Ponavljanje {
	// metoda za unos brojeva u niz, 0 prekida
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		ArrayList<Integer> niz = new ArrayList<Integer>();
		int broj = 1;
		System.out.println("Unesite niz brojeva, nula prekida unos");
		while (broj != 0) {
			broj = unos.nextInt();
			niz.add(broj);
		}
		// kreiramo niz od 100 brojeva i prolazimo kroz iste
		int[] brojac = new int[100];
		for (int i = 1; i <= 100; i++) {
			// prolaz kroz listu koju je unijeo korisnik
			for (int j = 0; j < niz.size(); j++) {
				// ako je i jednak broju u nizu uvecavamo brojac
				if (i == niz.get(j)) {
					brojac[i]++;
				}
			}
		}
		for (int i = 1; i < brojac.length; i++) {
			// za brojeve od 1 do sto ispis brojeva koji se ponavljaju
			if (brojac[i] > 0) {
				System.out.println("Broj " + i + " se ponavlja " + brojac[i] + " puta.");
			}
		}
		unos.close();

	}

}