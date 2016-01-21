package zadaci_20_1_2016;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese neki string te mu ispisuje
 *  sve karaktere koji se nalaze na neparnim pozicijama. Na primjer, 
 *  ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.*/
public class StringNeparniZ4 {

	public static void main(String[] args) { // main metoda
		Scanner unos = new Scanner(System.in);// kreiramo skener za unos
		System.out.print("Unesite text:");// poruka korisniku
		String text = unos.nextLine(); // ucitavanje texta
		for (int i = 0; i < text.length(); i++) { // petlja z prolazak kros text
			if (i % 2 == 0) { // biramo neparne pozicija
				System.out.print(text.charAt(i) + " ");// ispis
			}

		}
	}
}
