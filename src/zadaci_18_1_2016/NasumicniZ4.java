package zadaci_18_1_2016;

import java.util.Scanner;

//Napisati metodu koja printa 100 nasumiènih uppercase karaktera 
//i 100 nasumiènih brojeva, 10 po liniji.
public class NasumicniZ4 {

	public static void nasumicniBrojevi() {// metoda nasumicni brojevi
		System.out.println("Random brojevi: ");// poruka
		for (int i = 1; i <= 100; i++) { // petlja do 100
			int slucajni = (int) (Math.random() * 10);// random 0-9
			System.out.print(slucajni + " "); // ispis
			if (i % 10 == 0) { // uslov 10 po liniji
				System.out.println(); // novi red
			}
		}
	}

	public static void nasumicnaSlova() {// metoda nasumicni slova
		System.out.println("Random slova: ");// poruka
		for (int i = 1; i <= 100; i++) {// petlja do 100
			int slucajni = (int) (Math.random() * 26) + 65; // random velika
															// slova
			System.out.print((char) slucajni + " ");// ispis
			if (i % 10 == 0) {// uslov 10 po liniji
				System.out.println();// novi red

			}
		}
	}

	public static void main(String[] args) { // main metoda

		nasumicniBrojevi(); // poziv metode za brojeve
		nasumicnaSlova(); // poziv metode za slova
	}
}
