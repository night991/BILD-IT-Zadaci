package zadaci_25_1_2016;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) 
 * te ispiše korisniku koliko je to u godinama i danima. Zbog jednostavnosti, 
 * pretpostavimo da godina ima 365 dana.  */
public class Z4MinutaU {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt user for number of minutes
		System.out.println("Unesite broj minuta:");
		int minutes = input.nextInt();

		// godine i dani
		int year = minutes / (365 * 24 * 60);
		int day = (minutes % (365 * 24 * 60)) / (24 * 60);
		// ispis konverzije
		System.out.println(minutes + " minuta je " + year + " godina i " + day + " dana ");
	}

}