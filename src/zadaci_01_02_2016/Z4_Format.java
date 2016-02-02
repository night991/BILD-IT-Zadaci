package zadaci_01_02_2016;

import java.util.Scanner;

/*Napisati metodu sa sljedeæim headerom: public static String format(int number, 
 * int width) koja vraæa string broja sa prefiksom od jedne ili više nula. 
 * Velièina stringa je width argument. Na primjer, ukoliko pozovemo metodu format(34, 4) 
 * metoda vraæa 0034, ukoliko pozovemo format(34, 5) metoda vraæa 00034. 
 * Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.*/
public class Z4_Format {

	public static void main(String[] args) {
		// unos broja i sirine
		Scanner unos = new Scanner(System.in);
		System.out.println("Molimo unesite broj: ");
		int num = unos.nextShort();
		System.out.println("Molimo unesite rang: ");
		int width = unos.nextShort();
		// Poziva metodu za uspis
		System.out.println(format(num, width));
		unos.close();
	}

	// Metoda formatira izlaz.
	public static String format(int num, int width) {
		// int u string
		String format = num + "";
		// broj nula
		int length = width - format.length();
		for (int i = 0; i < length; i++) {
			format = "0" + format;
		}
		return format;
	}
}
