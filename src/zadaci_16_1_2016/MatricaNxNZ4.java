package zadaci_16_1_2016;

import java.util.Scanner;
import java.util.Random;

//Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
//public static void matricaIspis(int n)
//Svaki element u matrici je ili 0 ili 1, generisan nasumièno. 
//Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.

public class MatricaNxNZ4 {

	public static void main(String[] args) {

		try (Scanner unos = new Scanner(System.in)) { // try, skener velicina
														// matrice

			System.out.print("Unesite velicinu matrice: "); // poruka
			ispisMatrice(unos.nextInt()); // pozvi metode ispis matrice
		}
	}

	public static void ispisMatrice(int n) { // metoda ispis matrice

		Random rand = new Random(); // random generator - da generisemo 0 ili 1
		for (int i = 0; i < n; i++) { // prvi niz
			for (int j = 0; j < n; j++) { // drugi niz

				System.out.print(rand.nextInt(2) + " "); // ispis 0 ili 1
			}

			System.out.println(""); // novi red
		}
	}
}