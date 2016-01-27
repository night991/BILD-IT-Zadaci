package zadaci_27_1_2016;

import java.util.Scanner;

/*Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je 
 * proslijeðen kao argument: public static void reverse(int number). 
 * Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita 
 * korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. */
public class Z2Naopako {
	// kreiramo metodu za ispis broja naopako
	public static void naopako(int num) {
		int reversenum = 0;
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;

		}
		// ispis broja naopako
		System.out.println("Uneseni broj ispisan naopako je: " + reversenum);
	}

	// glavna metoda za unos broja od korisnika
	public static void main(String args[]) {
		System.out.println("Molimo unesite neki broj: ");
		Scanner unos = new Scanner(System.in);
		int num = 0;
		num = unos.nextInt();
		unos.close();
		// poziv metode naopako
		naopako(num);
	}
}
