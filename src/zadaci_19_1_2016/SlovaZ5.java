package zadaci_19_1_2016;

import java.util.Scanner;
/* Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi 
 * header: public static int countLettersLetters(String s). Napisati program koji 
 * pita korisnika da unese neki string te mu vrati koliko taj string ima slova.*/
public class SlovaZ5 {
	public static int countLetters(String s) { // kreiramo metoda 
		int brojac = 0; //poc vrijednost
		for (int i = 0; i < s.length(); i++) { //petlja za brojanje slova u stringu
			if (Character.isLetter(s.charAt(i)))
				brojac++;
		}
		return brojac;
	}

	public static void main(String[] args) { //main metoda
		Scanner input = new Scanner(System.in); //kreiramo skener za unos
		System.out.print("Unesite string:"); //poruka
		String s = input.nextLine(); //dodajemo unos stringa
		System.out.println("Uneseni string sadrzi " + countLetters(s) +" slova."); //ispis rezulatata
	}
}