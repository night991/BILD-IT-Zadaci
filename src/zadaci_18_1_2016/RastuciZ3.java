package zadaci_18_1_2016;

import java.util.Scanner;

//Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
//public static void displaySortedNumbers(double num1, double num2, double num3). 
//Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u 
//rastuæem redosljedu. 
public class RastuciZ3 {

	public static void displaySortedNumbers(double num1, double num2, double num3) { // kreiramo
																						// metodu
																						// za
																						// sortiranje
		if ((num3 > num2) && (num3 < num1)) { // poredimo 3 broja i ispisujemo
												// ih u rastucem red
			System.out.println("Sortirani brojevi su : " + num2 + ", " + num3 + ", " + num1);
		} else if ((num1 < num2) && (num1 < num3)) {
			System.out.println("Sortirani brojevi su : " + num1 + ", " + num2 + ", " + num3);
		} else if ((num1 < num3) && (num1 > num2)) {
			System.out.println("Sortirani brojevi su : " + num2 + ", " + num1 + ", " + num3);
		} else if ((num2 < num1) && (num2 > num3)) {
			System.out.println("Sortirani brojevi su : " + num3 + ", " + num2 + ", " + num1);
		} else if ((num1 < num3) && (num1 > num2)) {
			System.out.println("Sortirani brojevi su : " + num1 + ", " + num3 + ", " + num2);
		} else {
			System.out.println("Sortirani brojevi su : " + num3 + ", " + num1 + ", " + num2);
		}
	}

	public static void main(String[] args) { // main metoda
		Scanner unos = new Scanner(System.in);// generisanje scannera
		System.out.println("Unesite tri double broja:"); // unos tri broja
		double num1 = unos.nextDouble();
		double num2 = unos.nextDouble();
		double num3 = unos.nextDouble();
		displaySortedNumbers(num1, num2, num3); // poziv metode za sortiranje
	}
}
