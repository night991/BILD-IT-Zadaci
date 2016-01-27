package zadaci_27_1_2016;

/* (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti 
 * kao i procenat tog raèuna kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu. 
 * Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program treba da 
 * ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5. */
import java.util.Scanner;

public class Z1Naopojnica {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);// kreiranje Scanner-a
		System.out.println("Unesite iznos raèuna");// poruka korisniku da unese
													// iznos racuna
		// iznos racuna
		double racun = unos.nextDouble();// ucitavanje unosa racuna
		System.out.println("Unesite iznos napojnice (0,x)");// poruka korisniku da
														// unese
		// iznos racuna
		double procenat = unos.nextDouble();// ucitavanje unosa racuna
		double napojnica = racun * procenat;// racunanje napojnice
		double ukupno = racun + napojnica;// racun sa napojnicom
		System.out.println("Ukupan iznos raèuna je " + ukupno + " KM " + " \n napojnica je: " + napojnica + " KM ");
	}

}
