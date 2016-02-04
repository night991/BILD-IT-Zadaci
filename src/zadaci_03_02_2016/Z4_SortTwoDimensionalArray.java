package zadaci_03_02_2016;

import java.util.Arrays;

/*Write a method to sort a two-dimensional array
using the following header:
public static void sort(int m[][])
The method performs a primary sort on rows and a secondary sort on columns.*/
public class Z4_SortTwoDimensionalArray {

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

