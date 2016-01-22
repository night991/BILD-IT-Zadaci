package zadaci_21_1_2016;

import java.util.Scanner;

/*Neke web stranice forsiraju odreðena pravila za passworde. Napisati metodu koja provjerava da li je 
 * unijeti string validan password. Pravila da bi password bio validan su sljedeæa: 
 * 1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 2. Password smije da se sastoji samo od slova i brojeva. 
 * 3. Password mora sadržati najmanje 2 broja. 
 * Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" 
 * ukoliko su sva pravila ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.*/
public class Z5Password {

	public static boolean provjera(String sifra) {
		// provjeravamo da li su karakteri slova i brojevi
		int broj = 0;
		int slova = 0;
		for (int i = 0; i < sifra.length(); i++) {
			if (Character.isDigit(sifra.charAt(i))) {
				broj++;
			}
			if (Character.isLetter(sifra.charAt(i))) {
				slova++;
			}
		}
		// da li ima min 2 broja i 8 ili vise karaktera
		if (broj >= 2 && sifra.length() >= 8 && (broj + slova) == sifra.length()) {
			return true;
			// else returns false
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// kreiramo skener za unos i vrsimo provjeru
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite sifru:");
		String sifra = unos.next();
		if (provjera(sifra)) {
			System.out.println("Ispravna sifra");
		} else {
			System.out.println("Neispravna sifra");
		}
		unos.close();
	}

}
