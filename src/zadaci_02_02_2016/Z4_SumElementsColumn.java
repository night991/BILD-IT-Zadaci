package zadaci_02_02_2016;

/*(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)*/
public class Z4_SumElementsColumn {

	// public class SumColumnMethod {

	public static void sumColumn(double[][] m, int columnIndex) {

		double sum = 0;

		// prodji kroz niz i saberi sve brojeve u koloni
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}

		// ispisi zbir svih brojeva u koloni
		System.out.println("Suma svih brojeva u koloni " + columnIndex + " je " + sum);
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// pitati korisnika da unese broj redova i kolona matrice
		System.out.print("Unesite broj redova vaše matrice: ");
		int brojRedova = input.nextInt();
		System.out.print("Unesite broj kolona vaše matrice: ");
		int brojKolona = input.nextInt();

		// napraviti matricu za spremanje korisnikovog unosa
		double[][] matrix = new double[brojRedova][brojKolona];

		// pitati korisnika da unese matricu i pohraniti ju
		System.out.print("Unesite vašu matricu (" + matrix.length + "x" + matrix[0].length + "):");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				matrix[row][column] += input.nextDouble();
			}
		}

		// zatvoriti scanner
		input.close();

		// ispisi niz koji je korisnik unio
		System.out.println("Niz koji ste unijeli je: \n");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println(); // predji u novi red

		// pozvati metodu i ispisati zbir svih kolona
		for (int i = 0; i < matrix[0].length; i++) {
			sumColumn(matrix, i);
		}
	}
}
