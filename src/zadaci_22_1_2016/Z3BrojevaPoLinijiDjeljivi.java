package zadaci_22_1_2016;

/*Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, 
 * koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti taèno jedan space. */
public class Z3BrojevaPoLinijiDjeljivi {

	public static void main(String[] args) {
		// definisemo pocetni i krajnji broj te brojac
		int broj1 = 100;
		int broj2 = 1000;
		int brojac = 0;
		// ako je broj djeljiv sa 5 i 6 ispisujemo 10 po liniji
		System.out.println("Brojevi od 100 do 1000 djeljivi sa 5 i 6 su:");
		for (int i = broj1; i <= broj2; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				brojac++;
				System.out.print((brojac % 10 == 0) ? i + "\n" : i + " ");
			}
		}
	}

}
