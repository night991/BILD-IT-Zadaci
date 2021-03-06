package zadaci_04_02_2016;

import java.util.Scanner;

/*     Implement the following method to sort the rows in a two-dimensional array.
 *      A new array is returned and the original array is intact.
 *      public static double[][] sortRows(double[][] m)
 *      Write a test program that prompts the user to enter a 3 * 3 matrix of double
 *      values and displays a new row-sorted matrix. */
public class Z1_RowSorting {

	public static void main(String[] args) {
		// kreiramo 3x3 niz u koji korisnik unosi podatke
		double[][] m = new double[3][3];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3x3 matrix row by row: ");
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextDouble();

		// kreiramo niz za sortiranje i pozivamo metodu za sortiranje
		double[][] sorted = sortRows(m);
		displayMatrix(sorted);

	}

	// metoda za ispis matrice
	public static void displayMatrix(double[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2.3f ", m[i][j]);
			}
			System.out.println("");
		}
	}

	// metoda za sortiranje redova
	public static double[][] sortRows(double[][] m) {

		double[][] sortedRows = new double[m.length][m[0].length];

		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				sortedRows[i][j] = m[i][j];

		for (int i = 0; i < sortedRows.length; i++) {

			for (int j = 0; j < sortedRows[0].length - 1; j++) {

				double currentMin = sortedRows[i][j];
				int minIndex = j;
				for (int column = j + 1; column < sortedRows[0].length; column++) {

					if (currentMin > sortedRows[i][column]) {
						currentMin = sortedRows[i][column];
						minIndex = column;
					}
				}

				if (minIndex != j) {
					sortedRows[i][minIndex] = sortedRows[i][j];
					sortedRows[i][j] = currentMin;
				}
			}
		}

		return sortedRows;
	}

}
