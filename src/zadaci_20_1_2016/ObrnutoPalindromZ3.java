package zadaci_20_1_2016;

import java.util.Scanner;

/*Napisati metode sa sljedeæim headerima: public static int reverse(int number) i 
 * public static boolean isPalindrome(int number). Prva metoda prima cijeli broj 
 * kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
 * Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
 * Koristite reverse metodu da implementirate isPalindrome metodu. Napišite 
 * program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. */
public class ObrnutoPalindromZ3 {

	public static int reverse(int number) { // metoda reverse za ispis obrnuto
											// broja
		int obrnut = 0;
		while (number != 0) {
			obrnut = obrnut * 10;
			obrnut = obrnut + number % 10;
			number = number / 10;

		}
		System.out.println(obrnut); // ispis broja obrnuto
		return obrnut;

	}

	public static boolean isPalindrome(int number) { // metoda da li je
														// palindrom
		if (number == reverse(number))
			return true;
		return false;

	}

	public static void main(String[] args) { // main metoda
		Scanner unos = new Scanner(System.in); // kreiramo skener za unos broja
		System.out.println("Unesite broj: ");
		int number = unos.nextInt();
		System.out.println("Uneseni broj obrnuto ispisan:");
		if (isPalindrome(number) == true) { // ako je palindrom
			System.out.println("Broj koji ste unijeli je palindrom.");// ispis
		} else { // ako nije palindrom
			System.out.println("Broj koji ste unijeli nije palindrom");
		}

		unos.close();
	}

}
