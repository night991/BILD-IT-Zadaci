package zadaci_22_1_2016;
/* Napisati program koji pita korisnika da unese cijeli broj za dana�nji dan
 *  u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon 
 *  dana�njeg dana te mu ispi�e koji je to dan u budu�nosti. (Primjer: ako 
 *  korisnik unese 1 kao dana�nji dan a 3 kao dan u budu�nosti program mu 
 *  ispisuje da je danas utorak a dan u budu�nosti je petak.) */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z1DanBroj {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in); // za unos od korisnika

		// dani u sedmici
		String[] dani = { "?","ponedjeljak", "utorak", "srijeda", "cetvrtak", "petak", "subota", "nedjelja" };

		int dan = 0; // danasnji dan
		int dan1 = 0; // broj dana nakon danasnjeg
		boolean uslov = true; // za while loop sa exceptionom
		while (uslov) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite broj danasnjeg dana (1-7): ");
				dan = unos.nextInt();
					while ((dan < 1) || (dan > 7)) {
					System.out.println("Unesite ispravan broj: ");
					dan = unos.nextInt();
				}
				uslov = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Unesite ispravan broj:");
				unos.nextLine();
			}
		}
		uslov = true;
		while (uslov) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite broj dana poslije: ");
				dan1 = unos.nextInt();
				// nisu dozvoljeni negativni brojevi
				while (dan1 < 0) {
					System.out.println("Unesite ispravan broj: ");
					System.out.println("Unesite broj dana poslije:");
					dan1 = unos.nextInt();
				}
				uslov = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Unesite ispravan broj:");
				unos.nextLine();
			}
		}

		// ispis rezultata
		System.out.println("Danas je " + dani[dan]+".");
		System.out.println("Dan u buducnosti ce biti " + dani[(dan + dan1) % 7] + ".");

		unos.close();
	}

}