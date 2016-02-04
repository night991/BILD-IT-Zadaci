package zadaci_03_02_2016;

import java.util.Arrays;

/*Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
most 1s. Here is a sample run of the program:
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2*/
public class Z3_LargestRowAndColumn {

	// Program prima 4x4 niz i vraca sortiran svaki red u 2D nizu

		public static void main(String[] args) {

			java.util.Scanner input = new java.util.Scanner(System.in);

			int[][] matrix = new int[4][4];
			int[] niz = new int[4];

			// Unos clanova matrice i sortiranje
			System.out.println("Unesite vrijednosti u matricu: ");

			for (int i = 0; i < matrix.length; i++) {
				// Prva petlja-niz
				for (int j = 0; j < niz.length; j++) {
					niz[j] = input.nextInt(); // unosimo vrijednosti u niz
				}
				Arrays.sort(niz); // Uneseni niz sortiramo
				// Druga petlja-matrica
				for (int j = 0; j < matrix.length; j++) {
					matrix[i][j] = niz[j]; // Sortirani niz dodajemo matrici
				}

			} // Kraj for ciklusa
			input.close();

			// Ispis matrice
			System.out.println();

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

