package zadaci_27_1_2016;

/* (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti 
 * kao i procenat tog ra�una kojeg �elimo platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu. 
 * Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu program treba da 
 * ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5. */
import java.util.Scanner;

public class Z1Naopojnica {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);// kreiranje Scanner-a
		System.out.println("Unesite iznos ra�una");// poruka korisniku da unese
													// iznos racuna
		// iznos racuna
		double racun = unos.nextDouble();// ucitavanje unosa racuna
		System.out.println("Unesite iznos napojnice (0,x)");// poruka korisniku da
														// unese
		// iznos racuna
		double procenat = unos.nextDouble();// ucitavanje unosa racuna
		double napojnica = racun * procenat;// racunanje napojnice
		double ukupno = racun + napojnica;// racun sa napojnicom
		System.out.println("Ukupan iznos ra�una je " + ukupno + " KM " + " \n napojnica je: " + napojnica + " KM ");
	}

}
