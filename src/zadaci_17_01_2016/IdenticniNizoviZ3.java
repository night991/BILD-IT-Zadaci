package zadaci_17_01_2016;

import java.util.Scanner;

//Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi
//na istim pozicijama jednaki. Napisati metodu koja vraæa true ukoliko su 
//nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
//public static boolean equals(int[ ] niz1, int[ ] niz2)
//Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva
//te provjerava da li su striktno identièni.

public class IdenticniNizoviZ3 {

	public static void main(String[] args) { // main
		Scanner input = new Scanner(System.in); // kreiramo skener

		int niz1[] = new int[8]; // kreiramo 2 niza od po 8 elemenata
		int niz2[] = new int[8];

		System.out.println("Unesite 8 elementa 1. niza"); // poruka

		for (int i = 0; i < niz1.length; i++) { // unos prvog niza
			niz1[i] = input.nextInt(); // upis vrijednosti 1. niza
		}

		System.out.println("Unesite 8 elementa 2. niza"); // poruka
		for (int i = 0; i < niz2.length; i++) { // Unos drugog niza
			niz2[i] = input.nextInt();// upis vrijednosti 1. niza
		}

		System.out.println("Nizovi su identicni? " + identicni(niz1, niz2) + ". "); // rezultat
																					// poredenja
																					// nizova

	}

	public static boolean identicni(int[] niz1, int[] niz2) { // bool metoda
																// identicni
		boolean identicno = true; // pretpostavka

		for (int i = 0; i < niz2.length; i++) { // ukoliko neki od elemenata
												// nije isti prekidamo petlju
			if (niz1[i] != niz2[i]) {
				identicno = false;
				break;
			}
		}
		return identicno; // vracamo rezultat
	}

}