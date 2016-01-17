package zadaci_16_1_2016;

import java.util.Scanner;

// Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
// godine 101 do 2100,
// odvojene jednim spaceom. Takoðer ispisati i ukupan broj prijestupnih
// godina u ovom vremenskom periodu.

public class PrijestupneZ1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // pravimo skener
		System.out.print("Unesite poèetnu godinu (101) : "); // poruka korisniku
		int pocetna = input.nextInt(); // unos poèetne godine
		System.out.print("Unesite krajnju godinu (2100) : "); // poruka
																// korisniku
		int krajnja = input.nextInt(); // unos krajnje godine
		int ukupno = prijestupna(pocetna, krajnja);// poziv metoda za provjeru
													// prestupnih
		// godina i vraæa iste
		System.out.println("\nUkupno imamo " + ukupno + " prijestupnih godina."); // prikaz
		// rezultata
		input.close(); // zatvaranje unos
	}

	public static int prijestupna(int pocetna, int krajnja) { // metoda
																// prijestupne
		int prijestupna = 0;
		int brojac = 1;
		int brojac2 = 1;
		for (int i = pocetna; i <= krajnja; i++) {
			// ako je godina prestupna,
			if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) { // uslov
																// prijestupna
				prijestupna++; // inkrement brojac prestupnih godina
				if (brojac2 == 10) { // ispis po deset u redu
					System.out.println(i + " ");
					brojac2 = 1;
				} else {
					System.out.print(i + " ");
					brojac2++;
				}
				brojac++;
			}
		}
		return prijestupna;
	}
}
