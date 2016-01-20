package zadaci_19_1_2016;

import java.util.Scanner;
/* Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost 
 * na raèunu postaje 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na raèunu
 * postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treæeg mjeseca, vrijednost na raèunu 
 * postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji pita 
 * korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna. */

public class StednjaZ1 {
	public static void main(String[] args) { // main metoda
		Scanner unos = new Scanner(System.in);// generisemo skener
		System.out.println("Unesite mjesecni iznos stednje");// poruka mjesecni
																// iznos
		double iznos = unos.nextDouble(); // dodjeljujemo vrijednost
		System.out.println("Unesite zeljeni broj mjeseci"); // broj mjeseci
		double mjeseci = unos.nextDouble(); // dodjeljujemo vrijednost
		double stanje = 0; // pocetna vrijednost
		double stopa = (0.05 / 12); // stopa
		double kamata = 0; // pocetna vrijednost

		for (int i = 0; i < mjeseci; i++) { // kroz petlju vrtimo br mjeseci
			stanje += iznos; // uvecavamo stanje
			kamata = (1 + stopa); // uvecamo kamatu
			stanje = stanje * kamata; // stanje
		}
		System.out.print("Ako štedite " + mjeseci + " mjeseci ustedili bi " + stanje);// ispis
	}
}