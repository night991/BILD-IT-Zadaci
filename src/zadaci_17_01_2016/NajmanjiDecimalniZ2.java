package zadaci_17_01_2016;

import java.util.Scanner;
//Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se 
//sljedeæim headerom:
//public static double min(double[ ] array)
//Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu 
//metodu da vrati najmanji element u nizu.

public class NajmanjiDecimalniZ2 {

	public static double min(double[] array) { // kreiramo metodu min

		double minimum = array[0]; // definisemo minimalnu vrijednost
		for (int i = 0; i < array.length; i++) {// petlja za
			if (array[i] <= minimum) {// da li je elementi manji od minimum
										// vrijednosti
				minimum = array[i];// minimumu dodjeljujemo vrijednost
			}
		}
		return minimum;// vracamo minimum

	}

	public static void main(String[] args) { // main metoda
		double[] niz = new double[10]; // kreiramo niz
		Scanner unos = new Scanner(System.in); // skener za upis brojeva
		System.out.println("Unesite 10 decimalnih brojeva:");// poruka
		for (int i = 0; i < niz.length; i++) { // upis vrijednosti niza
			niz[i] = unos.nextDouble();
		}

		System.out.println("Najmanji elemenat unesenog niza je:" + min(niz)); // ispis

	}

}
