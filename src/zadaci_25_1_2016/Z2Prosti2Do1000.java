package zadaci_25_1_2016;

/*Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.*/
public class Z2Prosti2Do1000 {
	// metoda za provjeru je li broj prost
	public static void main(String[] args) {
		boolean prost = true;
		int brojac = 0;
		for (int x = 2; x < 1000; x++) {
			prost = true; // pretpostavimo da je broj prost
			for (int i = 2; i < x && prost == true; i++) // kreiramo umnozak
															// svih brojeva do x
				if (x % i == 0) // ako nema ostatka - djeljiv je
					prost = false;

			if (prost == true) // ako nema umnozka onda je prost

			{
				System.out.print(" " + x);
				brojac++;
				// ispis 8 brojeva u redu
				if (brojac % 8 == 0) {
					System.out.println();
				}
			}

		}
	}
}
