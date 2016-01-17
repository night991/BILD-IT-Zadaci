package zadaci_16_1_2016;

import java.io.*;
import java.util.Scanner;
import java.io.File;

//Napišite program koji æe brojati broj karakteria, rijeèi i linija teksta u nekom fileu. 
//Rijeèi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program. 
//(Ovo je text koji æu jakoristiti za testiranje, ukoliko nema ideja)

public class KarakteriZ3 {

	public static void main(String[] args) throws FileNotFoundException {

		try { // pokusaj
			File tekst = new File("src\\zadaci_16_1_2016\\AL.txt"); // Ucitaj
			// fajl
			Scanner unos = new Scanner(tekst); // Skeniranje teksta
			int linije = 0, rijeci = 0, karakteri = 0; // setovanje pocetnih
			// vrijednosti
			while (unos.hasNextLine()) { // provjera postoje li linije
				linije++; // dok postoje linije inkrement

				String linija = unos.nextLine(); // linije

				Scanner unos2 = new Scanner(linija); // skener za citanje linija

				while (unos2.hasNext()) { // provjera postojanje
					rijeci++; // dok postoje rijeci inkrement
					String word = unos2.next(); // ucitava rijeci
					karakteri += word.length(); // uvecavamo karaktere
				}
			}
			System.out.println(
					"Tekst sadrzi " + linije + " linija " + rijeci + " rijeci te " + karakteri + " karakteria."); // ispis
																													// rezultata
		} catch (FileNotFoundException e) { // greska, nepostoji tekst
			System.out.println("Tekst ne postoji.");
		}
	}
}