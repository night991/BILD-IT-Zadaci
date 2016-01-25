package zadaci_25_1_2016;

import java.util.*;

/*
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko
 * je pozitivnih brojeva korisnik unijeo, koliko negativnih te izraèunava ukupnu
 * sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese
 * nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše
 * da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
 * prosjek svih brojeva je 1.25.
 */
public class Z5PozitivniNegativniSuma {

	public static void main(String[] args) {

		// kreiraj relevantne varijable
		int pozitivni = 0;
		int negativni = 0;
		double suma = 0;
		int korisnik = -1; // osiguravamo ulaz u petlju

		// kreiraj novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitaj korisnika da unese niz brojeva
		System.out.print("unesite niz brojeva, 0 prekida unos: ");

		while (korisnik != 0) {
			// dodijeli korisnikov unos varijabli
			korisnik = unos.nextInt();

			// provjeri da korisnik nije unio nulu
			if (korisnik != 0) {
				// ukoliko je unos manji od 0, povecaj negativne za 1
				if (korisnik < 0) {
					negativni++;
					// ukoliko je unos veci od 0, povecaj pozitivne za 1
				} else {
					pozitivni++;
				}

				// dodaj korisnikov unos sumi
				suma += korisnik;
			}
		}

		// zatvori scanner
		unos.close();

		// ispisi rezultate
		System.out.println("Broj pozitivnih brojeva: " + pozitivni);
		System.out.println("Broj negativnih brojeva: " + negativni);
		System.out.println("Suma svih brojeva: " + suma);
		System.out.println("Prosjek svih brojeva: " + suma / (pozitivni + negativni));
	}
}
