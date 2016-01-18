package zadaci_17_01_2016;

//Implementirati sljedeæu metodu da sortira redove u 2D nizu.
//public static double[ ][ ] sortRows(double[ ][ ] array)
//Napisati testni program koji pita korisnika da unese 3x3 matricu 
//(ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje 
//na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
import java.util.Scanner;

public class Sort2D {

	public static double[][] sortRows(double[][] niz) {

		double[][] pomocniNiz = new double[niz.length][niz[0].length]; // novi
																		// 2D
																		// niz

		for (int i = 0; i < niz.length; i++) // punimo pomocni niz
			for (int j = 0; j < niz[0].length; j++)
				pomocniNiz[i][j] = niz[i][j];

		for (int i = 0; i < pomocniNiz.length; i++) { // upisujemo najmanje
														// elemente
			for (int j = 0; j < pomocniNiz[0].length - 1; j++) {
				double najmanji = pomocniNiz[i][j];
				int a = j;
				for (int kolona = j + 1; kolona < pomocniNiz[0].length; kolona++) {

					if (najmanji > pomocniNiz[i][kolona]) {
						najmanji = pomocniNiz[i][kolona];
						a = kolona;
					}
				}

				if (a != j) {
					pomocniNiz[i][a] = pomocniNiz[i][j];
					pomocniNiz[i][j] = najmanji;
				}
			}
		}

		return pomocniNiz;
	}

	public static void main(String[] args) { // main metod
		Scanner unos = new Scanner(System.in);// skener
		double[][] niz = new double[3][3]; // kreiramo 2D niz od po 3 elementa
		System.out.println("Unesite 3 x 3 matricu: "); // poruka
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = unos.nextDouble(); // unos upisujemo u matricu
			}
		}
		double[][] sortiranaMatrica = sortRows(niz);
		System.out.println("Matrica poslije sortiranja: "); // poruka
		for (int i = 0; i < sortiranaMatrica.length; i++) {
			for (int j = 0; j < sortiranaMatrica[i].length; j++) {
				System.out.print(sortiranaMatrica[i][j] + " "); // ispis
																// sortirane
																// matrice
			}
			System.out.println();
		}

	}

}