package mini1_Kalendar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/* ...
 * napraviti konzolnu kalendar aplikaciju.

Naime, program koji trebamo napisati treba da pita korisnika da unese mjesec i godinu te da mu ispiše, 
kao na slici ispod, kalendar za taj mjesec i tu godinu. Kada program ispiše dati mjesec korisniku na konzoli, 
program onda pita korisnika da li želi unijeti neki reminder za odreðeni dan ili želi vidjeti 
kalendar za neki drugi mjesec. Ukoliko korisnik želi neki podsjetnik/reminder/note za odreðeni dan, 
program treba da saèuva korisnikov unos i da ga prikaže pri sljedeæem pokretanju programa.
...
 */

public class Planer {

	// Metoda za ispis dana u mjesecu
	public static int day(int M, int D, int Y) {
		int y = Y - (14 - M) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = M + 12 * ((14 - M) / 12) - 2;
		int d = (D + x + (31 * m) / 12) % 7;
		return d;

	}

	public static void main(String[] args) throws IOException {
		// kreiramo menu sa opcijama
		int menu = 0;
		Scanner unos = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("DOBRO DOSLI! molimo izaberite opciju:");
		System.out.println("------------------------------------");
		System.out.println("  1 - Kalendar");
		System.out.println("  2 - Dodavanje dogadaja");
		System.out.println("  3 - Prikaz dogadaja");
		System.out.println("  0 - Kraj");
		System.out.println("------------------------------------");
		do {
			menu = unos.nextInt();
			// Kalendar
			if (menu == 1) {
				System.out.println("Molimo unesite mjesec (1-12):");
				int M = unos.nextInt();
				System.out.println("Unesite godinu:");
				int Y = unos.nextInt();
				// mjeseci
				String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August",
						"September", "October", "November", "December" };
				int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				// da li je prijestupna godina
				if ((M == 2 && ((Y % 4 == 0 && Y % 100 != 0)) || (Y % 400 == 0))) {
					days[M] = 29;
				}
				// stampanje kalendara za izabrani mjesec
				System.out.println("   " + months[M] + " " + Y);
				System.out.println("---------------------");
				System.out.println(" S  M Tu  W Th  F  S");
				System.out.println("---------------------");
				// pozivamo metod za prikaz kalendara
				int d = day(M, 1, Y);
				for (int i = 0; i < d; i++)
					System.out.print("   ");
				for (int i = 1; i <= days[M]; i++) {
					System.out.printf("%2d ", i);
					if (((i + d) % 7 == 0) || (i == days[M]))
						System.out.println();
				}
				System.out.println("---------------------");
				// ponovo prikazujemo menu
				System.out.println("------------------------------------");
				System.out.println("DOBRO DOSLI! molimo izaberite opciju:");
				System.out.println("------------------------------------");
				System.out.println("  1 - Kalendar");
				System.out.println("  2 - Dodavanje dogadaja");
				System.out.println("  3 - Prikaz dogadaja");
				System.out.println("  0 - Kraj");
				System.out.println("------------------------------------");
				menu = 4; // menu
			}
			// dodavanje dogadaja
			else if (menu == 2) {
				System.out.println("Unesite dan :");
				int dan = unos.nextInt();
				System.out.println("Unesite mjesec:");
				int mjesec = unos.nextInt();
				System.out.println("Unesite godinu:");
				int godina = unos.nextInt();
				unos.nextLine();
				System.out.println("Unesite dogadaj:");
				String dogadaj = unos.nextLine();
				try {
					// Dogadaj upisujemo u .txt fajl
					FileWriter pisac = new FileWriter("dogadaji.txt", true);
					pisac.write("Dogadaj: " + dogadaj);
					pisac.write("Datum :" + dan + ". ");
					pisac.write(mjesec + ". ");
					pisac.write(godina + ". ");
					pisac.write(System.getProperty("line.separator"));
					pisac.close();
					System.out.println("Dogadaj uspjesno upisan.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("------------------------------------");
				System.out.println("DOBRO DOSLI! molimo izaberite opciju:");
				System.out.println("------------------------------------");
				System.out.println("  1 - Kalendar");
				System.out.println("  2 - Dodavanje dogadaja");
				System.out.println("  3 - Prikaz dogadaja");
				System.out.println("  0 - Kraj");
				System.out.println("------------------------------------");
				menu = 4;
				// ispis dogadaja
			} else if (menu == 3) {
				try (BufferedReader citac2 = new BufferedReader(new FileReader("dogadaji.txt"))) {
					String text = null;
					while ((text = citac2.readLine()) != null) {
						System.out.println(text);
					}
					citac2.close();

					// ako jos nema dogadaja
				} catch (FileNotFoundException e) {
					System.out.println("Ne postoje dogadaji u buducnosti. ");
				}

				System.out.println("------------------------------------");
				System.out.println("DOBRO DOSLI! molimo izaberite opciju:");
				System.out.println("------------------------------------");
				System.out.println("  1 - Kalendar");
				System.out.println("  2 - Dodavanje dogadaja");
				System.out.println("  3 - Prikaz dogadaja");
				System.out.println("  0 - Kraj");
				System.out.println("------------------------------------");
				menu = 4;
			}
			// izlaz
			else if (menu == 0) {
			}

			else {
				System.out.println("Izaberite ponudene opcije");

				System.out.println("------------------------------------");
				System.out.println("DOBRO DOSLI! molimo izaberite opciju:");
				System.out.println("------------------------------------");
				System.out.println("  1 - Kalendar");
				System.out.println("  2 - Dodavanje dogadaja");
				System.out.println("  3 - Prikaz dogadaja");
				System.out.println("  0 - Kraj");
				System.out.println("------------------------------------");
				menu = 4;
			}
		} while (menu != 0); // nula prekida rad

		unos.close();
	}

}
