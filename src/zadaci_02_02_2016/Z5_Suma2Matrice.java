package zadaci_02_02_2016;

/*(Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix. Each element
cij is aij + bij.*/
public class Z5_Suma2Matrice {

	// Metoda za sabiranje dvije matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {

		// Definisanje trece matrice
		double[][] matrix3 = new double[a.length][a[0].length];

		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[0].length; j++) {
				matrix3[i][j] = a[i][j] + b[i][j];
			}
		}

		return matrix3;

	}

	// Main metoda
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// Unos redova i kolona
		System.out.print("Unesite broj redova matrice: ");
		int redovi = input.nextInt();
		System.out.print("Unesite broj kolona matrice: ");
		int kolone = input.nextInt();

		double[][] matrix1 = new double[redovi][kolone];
		double[][] matrix2 = new double[redovi][kolone];

		// Unos clanova prve matrice
		System.out.println("Unesite clanove prve matrice: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		// Unos clanova druge matrice
		System.out.println("Unesite clanove druge matrice: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		input.close();

		// Pozivanje i ispis zbira matrica
		System.out.println("Zbir matrica je: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				System.out.print(addMatrix(matrix1, matrix2)[i][j] + " ");
			}
			System.out.println();
		}

	}

}
