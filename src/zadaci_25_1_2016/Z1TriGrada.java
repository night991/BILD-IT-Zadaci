package zadaci_25_1_2016;

/*Napisati program koji pita korisnika da unese imena tri grada te 
 * ih ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago, 
 * Los Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los Angeles.*/
import java.util.Scanner;

public class Z1TriGrada {

	// metod za sortiranje stringa
	public static void Sortiranje(String s1, String s2, String s3) {
		//
		String temp = "temp";
		// uslovi za sortiranje 3 stringa - grada
		if (s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		if (s1.compareTo(s3) > 0) {
			temp = s1;
			s1 = s3;
			s3 = temp;
		}
		if (s2.compareTo(s3) > 0) {
			temp = s2;
			s2 = s3;
			s3 = temp;
		}
		// ispis sortiranih gradova
		System.out.println("Sortirani naziv gradova: " + s1 + " " + s2 + " " + s3);
	}

	// glavna metoda
	public static void main(String[] args) {
		// kreiramo skener za unos naziva tri grada i pozivamo metodu za
		// sortiranje
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite tri grada");
		String s1 = unos.next();
		String s2 = unos.next();
		String s3 = unos.next();
		unos.close();
		Sortiranje(s1, s2, s3);
	}
}
