package zadaci_21_1_2016;

import java.io.IOException;
import java.util.Scanner;

/*Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom. */

public class Z1ZbirTriBroja {

	public static void main(String[] args) {
		// generisemo nasimicne brojeve do 10
		int broj1 = (int) (Math.random() * 10);
		int broj2 = (int) (Math.random() * 10);
		int broj3 = (int) (Math.random() * 10);
		boolean nastaviti = true;
		while (nastaviti) {
			// poruka korisniku da unese rjesenje
			System.out.print("Izracunajte slijedeci zbir: " + broj1 + "+" + broj2 + "+" + broj3 + " = ");
			System.out.println();
			int rjesenje = provjera(); // pozivamo metodu provjera

			if (rjesenje == (broj1 + broj2 + broj3)) {// provjera rjesenja
				System.out.println("Tacan odgovor!"); // da
				break;
			} else {
				System.out.println("Odgovor pogresan, pokusajte ponovo");// ne
			}
		}

	}

	public static int provjera() { // metoda za provjeru
		Scanner unos = new Scanner(System.in);// skener za unos rjesenja
		int rjesenje = 0; // pocetna vrijednost
		boolean pokusaj = true;
		while (pokusaj) { // petlja za ponavljanje dok ne pogodimo
			try {
				rjesenje = unos.nextInt(); // ucitavamo odgovor korisnika
				pokusaj = false; // netacan odgovor - izlaz
				unos.nextLine();
			} catch (Exception e) { // izuzetak
				System.out.println("Odgovor pogresan, pokusajte ponovo");
				unos.nextLine();
			}
		}
		return rjesenje;
	}

}