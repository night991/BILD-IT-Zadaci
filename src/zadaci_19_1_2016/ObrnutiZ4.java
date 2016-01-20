package zadaci_19_1_2016;

/* Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu.*/
public class ObrnutiZ4 {

	public static void main(String[] args) {

		java.util.Scanner unos = new java.util.Scanner(System.in);// kreiramo
																	// skener

		int[] niz = new int[10]; // kreiramo niz

		for (int i = 0; i < 10; i++) { // prolazimo kroz petlju
			System.out.print("Unesite " + (i + 1) + ". broj: "); // poruka za
																	// upis
			niz[i] = unos.nextInt(); // dodajemo vrijednost nizu
		}
		System.out.println("Obrnutim redosljedom: "); // ispis niza obrnuto
		for (int i = niz.length - 1; i >= 0; i--) { 
			System.out.print(niz[i] + " ");
		}

	}
}