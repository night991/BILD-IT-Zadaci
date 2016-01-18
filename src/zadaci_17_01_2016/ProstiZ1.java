package zadaci_17_01_2016;

import java.util.*;
//Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa 
//sve proste brojeve u zadanom rangu.
//BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.

public class ProstiZ1 {

	public static boolean uslovProst(int n) { // uslov prost broj,1 ili 0
		if ((n > 2) && ((n & 1) == 0) || (n == 0) || (n == 1))
			return false;
		for (int i = 3; i * i <= n; i += 2) // test neparnih brojeva
			if (n % i == 0) {
				return false;
			}
		return true;
	}

	public static void prosti(int pocetna, int krajnja, int linija) {
		int max = krajnja; // veci, manji
		int min = pocetna;
		if (pocetna > krajnja) {// ako je pocetna > nego krajnja zamjena
			min = krajnja;
			max = pocetna;
		}

		int k = 0; // zeljeni ispis po liniji
		System.out.println("\n# Prosti brojevi su od " + min + " do " + max + ": ");

		for (int i = min; i <= max; i++) { // prolazimo kroz petlju
			if (uslovProst(i)) { // metodom provjeravamo da li je prosti
				System.out.print(i + " "); // ispis
				k++;
				if (k % linija == 0) { // koliko brojeva zelimo po liniji
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in); // kreiramo skener za unos

		try {

			System.out.println("Unesite pocetni broj: "); // unos brojeva i
															// linija
			int pocetna = unos.nextInt();
			System.out.println("Unesite krajnji broj: ");
			int krajnja = unos.nextInt();
			System.out.println("Unesite zeljeni broj linija ");
			int linija = unos.nextInt();

			prosti(pocetna, krajnja, linija); // metoda prosti

		} catch (InputMismatchException e) { // izuzetak neispravan unos
			System.out.println("Neispravni brojevi");
		}
		unos.close();
	}
}
