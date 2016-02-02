package zadaci_01_02_2016;

import java.util.Scanner;

/*U javi, short vrijednost se sprema u samo 16 bita. 
 * Napisati program koji pita korisnika da unese short broj te mu ispiše 
 * svih 16 bita za dati cijeli broj. Na primjer, ukoliko korisnik 
 * unese broj 5 - program mu ispisuje 0000000000000101*/
public class Z3 {

	public static void main(String[] args) {
		// unos broja
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite short broj: ");
		short broj = unos.nextShort();
		// Poziva metodu i prikazuje 16bit-ni broj.
		System.out.println("Uneseni short broja prikazan kao binarni: " + konverzija(broj));
		unos.close();
	}

	// metoda za konverziju short u bin
	public static String konverzija(short n) {
		String binarni = "";
		while (n > 0) {
			binarni = n % 2 + binarni;
			n /= 2;
		}

		for (int i = binarni.length(); i < 16; i++) {
			binarni = "0" + binarni;
		}
		return binarni;
	}

}
