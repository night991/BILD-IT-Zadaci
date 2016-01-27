package zadaci_26_1_2016;
import java.util.Scanner;

public class Z4Max3 {


	/*Napisati metodu koja prima tri argumenta (3 decimalna broja) i koja kao rezultat vraæa najveæi od tih brojeva. */

		// Vraca najveci broj od 3 broja
		public static double maxofthree(double broj1, double broj2, double broj3) {
			return Math.max(Math.max(broj1, broj2), broj3);
		}

		private static Scanner unos = new Scanner(System.in);

		public static void main(String[] args) {

			System.out.print("Unesi prvi broj : ");
			double broj1 = unos.nextDouble();
			System.out.print("Unesi drugi broj : ");
			double broj2 = unos.nextDouble();
			System.out.print("Unesi treci broj : ");
			double broj3 = unos.nextDouble();

			double rezult = maxofthree(broj1, broj2, broj3);
			System.out.print("Najveci od ovih je : " + rezult);

		}

	}
