package zadaci_02_02_2016;
/*(Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays
if the series contains four consecutive numbers with the same value.*/
public class Z3_FourEqualNumbers {

	// Metoda za provjeru 4 uzastopna ista broja
		public static boolean isConsecutiveFour(int[] values) {

			int brojac = 0;
			int granica = 0;

			for (int i = 0; i < values.length - 1; i++) {
				// Poredimo prvi s drugim, drugi s trecim itd
				if (values[i] == values[i + 1]) {
					brojac++; // Brojimo da li ce se 3 puta poredjenje podudariti
					if (brojac >= 3) {
						granica = brojac; // ako se podudari 3 ili vise puta
											// pohranimo ga
					}
				} else {
					brojac = 0; // Ukoliko se ne poklapaju restartujemo brojac
				}
			}
			return granica >= 3;
		}

		// Main metoda
		public static void main(String[] args) {

			java.util.Scanner unos = new java.util.Scanner(System.in);

			// Unos velicine niza
			System.out.print("Unesite velicinu niza: ");
			int velicina = unos.nextInt();

			// definisanje niza
			int[] niz = new int[velicina];

			// Unos clanova niza
			for (int i = 0; i < niz.length; i++) {
				System.out.print("Unesite " + (i + 1) + ". clan niza: ");
				niz[i] = unos.nextInt(); // Unosimo clanove niza
			}
			unos.close();

			// Pozivanje metode i ispis
			System.out.println("Da li niz sadrži 4 uzastopna ista broja:");
			System.out.print(isConsecutiveFour(niz));
		}

	}


