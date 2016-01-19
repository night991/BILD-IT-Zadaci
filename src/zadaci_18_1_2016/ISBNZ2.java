package zadaci_18_1_2016;

import java.util.Scanner;
//ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: 
//d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum i 
//njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom: 
//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
//Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
//Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše 
//desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 
//013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo 
//013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)

public class ISBNZ2 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in); //kreiramo skener
		System.out.println("Unesite prvih 9 brojeva:");//poruka za unos i unos prvih 9 brojeva
			int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();
		int broj3 = unos.nextInt();
		int broj4 = unos.nextInt();
		int broj5 = unos.nextInt();
		int broj6 = unos.nextInt();
		int broj7 = unos.nextInt();
		int broj8 = unos.nextInt();
		int broj9 = unos.nextInt();

		// racuna da li je deseti broj jednocifren ili je 10
		int broj10 = (((broj1 * 1) + (broj2 * 2) + (broj3 * 3) + (broj4 * 4) + (broj5 * 5) + (broj6 * 6) + (broj7 * 7)
				+ (broj8 * 8) + (broj9 * 9)) % 11);
		// ako je deseti broj  10 ispisuje rezultat
		if (broj10 == 10)
			System.out.println("ISBN-10 je: " + broj1 + "" + broj2 + "" + broj3 + "" + broj4 + "" + broj5 + "" + broj6
					+ "" + broj7 + "" + broj8 + "" + broj9 + "" + "X");

		// rezultat kada je deseti broj jednocifren
		else
			System.out.println("ISBN-10 je: " + broj1 + "" + broj2 + "" + broj3 + "" + broj4 + "" + broj5 + "" + broj6
					+ "" + broj7 + "" + broj8 + "" + broj9 + "" + broj10);
	}

}
