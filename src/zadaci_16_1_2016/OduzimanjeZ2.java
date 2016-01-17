package zadaci_16_1_2016;

import java.util.Scanner;

//Napisati metodu koja prima jedan argument, broj minus, te generiše toliko nasumiènih, 
//jednostavnih minus oduzimanja tipa : „Koliko je 5 - 2 ?“. 
//Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.
public class OduzimanjeZ2 {

	public static void minus(int c) { // metoda minus

		int a, b, rjesenje, tacno = 0, netacno = 0, rjesenjeKorisnik = 0; // setujemo
																			// pocetne
																			// vrijednosti

		for (int i = 0; i < c; i++) { // petlja za zadatke

			a = (int) (Math.random() * 100); // generisemo slucajen brojve
			b = (int) (Math.random() * 10);

			rjesenje = a - b; // rjesenje

			Scanner unos = new Scanner(System.in); // skener za unos
			System.out.println(a + "-" + b + "=");
			rjesenjeKorisnik = unos.nextInt(); //ocitanje rjesenja

			if (rjesenjeKorisnik == rjesenje) { // provjera odgovora
				tacno++; // tacni uvecanje
			} else
				netacno++; // netacni uvecanje
		}

		System.out.println("Imali ste " + tacno + " tacnih odgovora i " + netacno + " netacnih odgovora."); // ispis
																											// rezultata
	}

	public static void main(String[] args) { // main

		Scanner unos = new Scanner(System.in); // skener za unos

		System.out.println("Unesite broj zadataka:"); // poruka

		int a = unos.nextInt(); // ocitanje broja zadataka

		minus(a); // pozviv metode minus
	}
}