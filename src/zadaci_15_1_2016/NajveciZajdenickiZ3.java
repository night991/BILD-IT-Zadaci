package zadaci_15_1_2016;

import java.util.Scanner;

//Napisati metodu koja prima dva cijela broja kao argumente te vraæa najveæi zajednièki djelilac za ta dva broja.
//PRIMJER:
//Unesite prvi broj: 125
//Unesite drugi broj: 2525
//Najveæi zajednièki djelilac za brojeve 125 i 2525 je 25.

public class NajveciZajdenickiZ3 {

	public static double zajednickiDjelilac(double broj1, double broj2) {// metoda
																			// najvecizajednickidjelilac
		double najveciZajednicki = 1; // deklarisemo privremenu vrijednost
		double privremeni = 1;

		if (broj2 > broj1) { // ako je drugi broj > prvog mjenjamo mjesto
			privremeni = broj1;
			broj1 = broj2;
			broj2 = privremeni;
		}

		for (int i = 1; i <= broj2; i++) {
			if (broj1 % i == 0 && broj2 % i == 0) { // Ako su brojevi djeljivi
													// sa i
				najveciZajednicki = i; // privremeni je najvecizajdenicki
			}
		}
		return najveciZajednicki; // vracamo najveciZajdenicki
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in); // kreiramo skener za unos 2
												// broja
		System.out.print("Unesi prvi broj : ");
		double broj1 = unos.nextDouble();
		System.out.print("Unesi drugi broj : ");
		double broj2 = unos.nextDouble();

		double rezultat = zajednickiDjelilac(broj1, broj2); // pozivamo metodu i
															// ispisujemo
															// rezultat
		System.out.print("Najveci od ovih je : " + rezultat);

	}

}
