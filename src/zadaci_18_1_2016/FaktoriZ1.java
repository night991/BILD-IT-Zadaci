package zadaci_18_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove najmanje
//faktore u rastuæem redosljedu. Na primjer, ukoliko korisnik unese 120 program 
//treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
public class FaktoriZ1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // kreiramo skener
		System.out.println("Molimo unesite cio broj: "); // poruka korisniku
		int broj = input.nextInt(); // ucitavanje broja
		int broj1 = broj; // saèuvamo unešeni broj za naknadni upis
		ArrayList<String> members = new ArrayList<>(); // kreiramo niz za
														// pamcenje rezultata
		int i = 2;
		while (broj != 1) { // trazimo faktore
			if (broj % i == 0) {
				broj = broj / i;
				String intToString = i + ""; // string u int
				members.add(intToString); // dodajemo u listu
			} else {
				// ako nijetrenutno i najmanji faktor povecaj i za 1
				i++; // ukoliko nije najmanji uvecaj za 1
			}
		}
		java.util.Collections.sort(members);
		System.out.print("Najmanji faktori unesenog broja su:\n ");// ispis
																	// faktora
		for (int j = 0; j < members.size(); j++) {
			if (j == members.size() - 1) {

				System.out.print(members.get(j) + " = " + broj1);// ispis
																	// unesenog
																	// broja
			} else {
				System.out.print(members.get(j) + " * ");
			}
		}
		input.close(); // prekid unosa
	}

}