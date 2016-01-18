package zadaci_17_01_2016;

import java.util.Scanner;

//Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. 
//Metoda treba da koristi sljedeæi header:
//public static int[ ] locateLargest(double[ ][ ] a)
//Napisati test program koji pita korisnika da unese 2D niz te mu 
//ispisuje lokaciju najveæeg elementa u nizu.

public class Najveci2DNizZ4 {

	public static int[] locateLargest(double[][] a) { // metoda

		double max = 0; // pocetna vrijednost
		int[] niz = new int[2]; // kreiramo niz od 2 elementa

		for (int i = 0; i < a.length; i++) { // petlja za trazenje najveceg
												// clana
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					niz[0] = i;// Na poziciji 0 je index reda
					niz[1] = j;// Na poziciji 1 je index kolone
				}
			}
		}
		return niz;
	}

	public static void main(String[] args) {// Main metoda

		Scanner unos = new Scanner(System.in); // kreiramo skener

		System.out.print("Unesite broj redova matrice: "); // poruka za unos
															// redova i kolona
		int redovi = unos.nextInt();
		System.out.print("Unesite broj kolona matrice: ");
		int kolone = unos.nextInt();

		double[][] matrica = new double[redovi][kolone]; // kreramo 2D niz

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++) {
				matrica[i][j] = (int) (Math.random() * 100); // punimo ga
																// slucajnim
																// brojevima
																// 0-99
			}
		}

		for (int i = 0; i < matrica.length; i++) { // ispis matrice
			for (int j = 0; j < matrica[0].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Najveci element se nalazi na lokaciji " + locateLargest(matrica)[0] + ", "
				+ locateLargest(matrica)[1]); // Pozivanje metode i ispis
												// rjesenja

	}

}
