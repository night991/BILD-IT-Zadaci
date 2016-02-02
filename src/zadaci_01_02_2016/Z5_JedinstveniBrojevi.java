package zadaci_01_02_2016;

import java.util.HashSet;
/*Napisati program koji uèitava 10 brojeva te ispisuje koilko 
 * je jedinstvenih brojeva unijeto te sve jedinstvene brojeve 
 * koji su unijeti, razmaknute jednim spaceom. Ukoliko se neki 
 * broj pojavljuje više puta, broj treba ispisati samo jednom.*/
import java.util.Scanner;

public class Z5_JedinstveniBrojevi {
	public static void main(String[] args) {
		// kreiramo hashset
		HashSet<String> set = new HashSet<String>();
		// kreiramo skener za unos brojeva
		Scanner unos = new Scanner(System.in);

		// Brojac jedinstvenih brojeva
		int brojac = 0;

		// kreiramo niz brojeva
		String[] brojevi = new String[5];

		// popunjavanje niza
		System.out.println("Molimo unesite 10 brojeva:");
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = unos.nextLine();
		}

		// ispis brojeva i brojanje jedinstvenih
		System.out.println("Uneseni su sledeci brojevi:");
		for (String broj : brojevi) {
			if (set.add(broj)) {
				System.out.println(broj + " ");
				brojac++;
			}
		}
		// ispis broja jedinstvanih
		System.out.println("Jedinstvenih brojeva je: " + brojac);

		unos.close();
	}
}
