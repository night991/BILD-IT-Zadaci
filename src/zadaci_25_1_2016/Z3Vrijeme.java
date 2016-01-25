package zadaci_25_1_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi 
 * od 1. januara 1970 do trenutka pozivanja metode. Napisati program koji 
 * ispisuje trenutaèni datum i vrijeme u formatu "
 * Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"*/
public class Z3Vrijeme {
	// metoda za ispis trenutnog vremena i datuma u zeljenom formatu
	public static void main(String[] args) {
		// kreiramo objekat date
		Date date = new Date();

		// ispisujemo datum i vrijeme
		System.out.printf("%1$s %2$td. %2$tB, %2$tY %2$tT", "Trenutni datum i vrijeme:", date);

	}
}
