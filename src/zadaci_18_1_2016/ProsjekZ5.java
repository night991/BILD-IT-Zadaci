package zadaci_18_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji uèitava neodreðeni broj cijelih brojeva 
//(nula prekida unos) te ispisuje koliko je brojeva bilo iznad 
//ili jednako prosjeku svih unešenih brojeva a koliko je bilo 
//brojeva ispod prosjeka. Pretpostavimo da je maksimalan niz brojeva 
//koje korisnik može unijeti 100.
public class ProsjekZ5 {

	public static void main(String[] args) { // main metoda

		int iznad = 0; // definisemo poèetne vrijednosti
		int ispod = -1; // izbjegavamo brojanje 0
		int identican = 0;
		double prosjek = 0;
		double suma = 0;
		int broj = 1; // osiguravamo ulaz u petlju
		int brojac = 0;

		ArrayList<Integer> niz = new ArrayList<>(); // kreiramo niz za
													// smjestanje unosa
		Scanner unos = new Scanner(System.in); // kreiramo skener
		System.out.print("Unesite niz brojeva, 0 prekida unos: "); // poruka
																	// korisniku
		do { // osiguravamo izvrsavanje
			broj = unos.nextInt(); // uzimamo unos od korisnika
			niz.add(broj); // dodajemo ga nizu
			brojac++; // inkrement brojaca
			suma += broj; // inkrement sume
		}

		while (broj != 0); // ako unos nije 0
		prosjek = (double) suma / (brojac - 1); // racunamo prosjek

		for (int i = 0; i < niz.size(); i++) {// idemo kroz petlju
			if (niz.get(i) < prosjek) {// manji od prosjeka radimo
				ispod++;// inkrement
			} else if (niz.get(i) > prosjek) {// ako je veci
				iznad++;// inkrement
			} else { // ako nije prethodna 2 onda je identican
				identican++;
			}

		}

		// ispisi rezultate
		System.out.println("Brojevi iznad prosjeka : " + iznad);
		System.out.println("Broj ispod prosjeka: " + ispod);
		System.out.println("Broj identican prosjeku: " + identican);
		System.out.println("Suma svih brojeva: " + suma);
		System.out.println("Prosjek svih brojeva: " + prosjek);
	}
}