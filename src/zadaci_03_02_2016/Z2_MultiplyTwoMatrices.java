package zadaci_03_02_2016;
/*(Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:
public static double[][]
multiplyMatrix(double[][] a, double[][] b)
To multiply matrix a by matrix b, the number of columns in a must be the same as
the number of rows in b, and the two matrices must have elements of the same or
compatible types. Let c be the result of the multiplication. Assume the column size
of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.*/
public class Z2_MultiplyTwoMatrices {

	public static double[][] multiplyMatrix(double[][] matrica1, double[][] matrica2) {

		double[][] pomnozena = new double[matrica1.length][matrica1[0].length];

		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1[0].length; j++) {
				
				pomnozena[i][j] = matrica1[i][j] * matrica2[i][j];
			}
		}

		return pomnozena;
	}

	public static void main(String[] args) {

		java.util.Scanner unos = new java.util.Scanner(System.in);
		// Unos dimenzije redova i kolona
		System.out.print("Unesite broj redova matrice: ");
		int redovi = unos.nextInt();
		System.out.print("Unesite broj kolona matrice: ");
		int kolone = unos.nextInt();

		double[][] matrica1 = new double[redovi][kolone];
		double[][] matrica2 = new double[redovi][kolone];

		// Unos prve matrice
		System.out.print("Unesite matricu: ");
		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1[0].length; j++) {
				matrica1[i][j] = unos.nextDouble();
			}
		}
		// Unos druge matrice
		System.out.println();
		System.out.print("Unesite drugu matricu: ");
		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1[0].length; j++) {
				matrica2[i][j] = unos.nextDouble();
			}
		}
		unos.close();

		// Ispis niza
		System.out.println();
		System.out.println("Pomonozena matrica je: ");

		for (int i = 0; i < matrica2.length; i++) {
			for (int j = 0; j < matrica2[0].length; j++) {
				System.out.print(multiplyMatrix(matrica1, matrica2)[i][j] + " ");
			}
			System.out.println();
		}

	}

}

