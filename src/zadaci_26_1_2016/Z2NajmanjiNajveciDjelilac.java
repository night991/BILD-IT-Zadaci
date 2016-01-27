package zadaci_26_1_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te
 * ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */
public class Z2NajmanjiNajveciDjelilac {

	public static void main(String[] args) {
		int najveciDjelilac = 0;

		// kreirati novi scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese dva cijela broja
		System.out.print("Molimo vas unesite dva cijela broja: ");

		// dodijeliti korisnikov unos varijablama
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();

		// zatvoriti scanner
		unos.close();

		// poredati brojeve po velicini
		if (broj1 > broj2) {
			int temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}
		// provjeriti da li je broj2 djeljiv sa brojem 1
		// ukoliko jeste, broj1 je najveci zajednicki djelilac
		if (broj2 % broj1 == 0) {
			najveciDjelilac = broj1;
		} else {
			// pronaci najveci zajednicki djelilac
			for (int i = 2; i < broj2; i++) {
				if (broj1 % i == 0 && broj2 % i == 0) {
					najveciDjelilac = i;
				}
			}
		}

		// ispisati rezultat
		System.out
				.println("Najveci zajednicki djelilac za brojeve " + broj1 + " i " + broj2 + " je " + najveciDjelilac);
	}
}
