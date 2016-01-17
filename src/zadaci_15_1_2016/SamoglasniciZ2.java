package zadaci_15_1_2016;

import java.util.Scanner;
//Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam) 
//Napisati program koji pita korisnika da unese string te mu ispište broj samoglasnika i suglasnika u datom stringu.
public class SamoglasniciZ2 {

		public static void main(String[] args) {  //main
			int samoglasnici = 0; // deklarisemo suglasnike
			int ostalo = 0; // deklarisemo samoglasnike
			char slovo; // deklarisemo slova

			Scanner unos = new Scanner(System.in); // kreiramo skener za unos
													// podataka
			System.out.print("Unesite neku rijec : "); // poruka korisniku
			String rijec = unos.next(); // unos iz konzole, rijec

			for (int i = 0; i < rijec.length(); i++) { // idemo kroz unesenu rijec
				slovo = rijec.charAt(i);

				if (slovo == 'a' || slovo == 'A' || slovo == 'e' || slovo == 'E' || slovo == 'i' || slovo == 'I'
						|| slovo == 'o' || slovo == 'O' || slovo == 'u' || slovo == 'U') //ukoliko je uneseni karakter samoglasnik
					samoglasnici++;                                                     // broj samoglasnika uvecavamo za 1
			}
			System.out.println("Unesena rijec " + rijec + " sadrzi " + samoglasnici + " samoglasnika," + " kao i "
					+ (rijec.length() - samoglasnici) + " druga znaka"); //ispisujemo broj samoglasnika i drugih znakova (suglasnika)
		}
	}
