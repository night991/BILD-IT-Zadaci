package zadaci_01_02_2016;

import java.util.Scanner;
import java.util.InputMismatchException;

/*Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) 
 * te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu 
 * ispisuje da je karakter sa tim brojem karakter E.*/
public class Z1_ASCII {

	public static void main(String[] args) {
		// kreiramo skener za unos
		Scanner unos = new Scanner(System.in);
		int broj = 0;
		// provera unosa
		boolean provjeraUslova = true;
		// radi dok unos ne bude ceo broj
		while (provjeraUslova) {
			System.out.println("Molimo unesite cijeli broj from od 0 to 127: ");
			try {
				broj = unos.nextInt();
				// uslov broj izmedju 0 i 127
				if (broj >= 0 && broj <= 127) {
					provjeraUslova = false;
				} else {
					provjeraUslova = true;
				}
				// ukoliko unos nije valjan
			} catch (InputMismatchException e) {
				System.out.println("Molimo unesite cijeli broj from od 0 to 127: ");
				unos.nextLine();
			}
		}
		unos.close();
		// ispis rezultata
		System.out.println("Uneseni cijeli broj " + broj + " je slijedeci karatker: " + (char) (broj));
	}

}
