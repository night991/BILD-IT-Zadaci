package zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji prima karakter te vraæa njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu 
 * vraæa 69 kao unicode za taj karakter.*/
public class Z2_Unicode {

	public static void main(String[] args) {

		// kreiramo skener za unos
		Scanner unos = new Scanner(System.in);
		String karakter = null;
		// provera unosa
		boolean provjeraUslova = true;
		// radi dok unos ne bude karakter
		while (provjeraUslova) {
			System.out.println("Molimo unesite neki karakter: ");
			try {
				karakter = unos.next();
				// uslov karakter izmedju 0 i 127
				if (karakter.length() == 1) {
					provjeraUslova = false;
				} else {
					provjeraUslova = true;
				}
				// ukoliko unos nije valjan
			} catch (InputMismatchException e) {
				System.out.println("Molimo unesite neki karakter: ");
				unos.nextLine();
			}
		}
		unos.close();
		// ispis rezultata
		System.out.println("Uneseni karakter " + karakter + "je slijedeci broj: " + (int) (karakter.charAt(0)));
	}
}
