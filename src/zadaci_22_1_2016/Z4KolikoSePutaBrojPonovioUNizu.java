package zadaci_22_1_2016;

import java.util.Scanner;

/*Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), 
 * pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio.  
 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveæi broj 5 
 * te ispisuje da se isti ponavlja 4 puta. */
public class Z4KolikoSePutaBrojPonovioUNizu {

	public static void main(String[] args) {

		// Kreiramo varijable.
		int brojac = 0;
		int broj = 1;
		int max = 0;
		// skener za unos, 0 prekida
		System.out.println("Unesite broj, 0 prekida unos:");
		while (broj != 0) {
			Scanner unos = new Scanner(System.in);
			broj = unos.nextInt();
			if (broj > max) {
				max = broj;
				brojac = 0;
			}
			if (broj == max) {
				brojac++;
			}
		}
		System.out.println("Najveci uneseni broj je " + max + " ponovio je se: " + brojac + " puta.");
	}
}
