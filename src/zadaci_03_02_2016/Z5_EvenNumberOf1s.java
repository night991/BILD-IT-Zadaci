package zadaci_03_02_2016;
/*Write a program that generates a 6-by-6 two-dimensional
matrix filled with 0s and 1s, displays the matrix, and checks if every row and
every column have an even number of 1s.*/
public class Z5_EvenNumberOf1s {

	// Program generise nasumican niz 6x6 sa 0 ili 1 i provjerava koji red ili
		// kolona ima podjednak broj nula i jedinica

		public static void main(String[] args) {

			int[][] matrica = new int[6][6];
			int zbirReda = 0;
			int zbirKolone = 0;
			int[] nizReda = new int[6];
			int[] nizKolone = new int[6];

			// Kreiranje matrice nasumicnih brojeva
			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica[0].length; j++) {
					matrica[i][j] = (int) (Math.random() * 2);
					zbirReda += matrica[i][j]; // odmah racunamo i zbir reda
				}
				nizReda[i] = zbirReda; // Dodamo zbir na mjesto u nizu poslije cemo
										// pomocu tog niza provjeriti sve zbirove
				zbirReda = 0;
			}

			// Sumiranje kolona
			for (int j = 0; j < matrica[0].length; j++) {
				for (int i = 0; i < matrica.length; i++) {
					zbirKolone += matrica[i][j];
				}
				nizKolone[j] = zbirKolone;
				zbirKolone = 0;
			}

			// Ispis matrice
			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica[0].length; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();

			// Provjera redova
			for (int i = 0; i < nizKolone.length; i++) {
				System.out.println("Red " + i + ": " + (nizReda[i] == 3));
			}
			System.out.println();

			// Provjera kolona
			for (int i = 0; i < nizKolone.length; i++) {
				System.out.println("Kolona " + i + ": " + (nizKolone[i] == 3));
			}
		}

	}

