package zadaci_22_1_2016;

import java.util.Scanner;

/*Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
 * Metoda treba da koristi sljedeæi header: 
 * public static String convertMillis(long millis). 
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
*/
public class Z5Sekunde {
	// metod za sekunde minute sati
	public static String convertMillis(long millis) {
		long sekunde = (millis / 1000) % 60;
		long minute = (millis / (1000 * 60)) % 60;
		long sati = (millis / (1000 * 60 * 60)) % 24;

		String vrijeme = String.format("%02d:%02d:%02d", sati, minute, sekunde);

		return vrijeme;
	}

	public static void main(String[] args) {
		System.out.println(convertMillis(100000));
	}

}