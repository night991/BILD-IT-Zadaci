package zadaci_16_1_2016;

import java.util.Scanner;

//Napisati metodu koja prima jedan argument te simulira bacanje novèiæa toliko puta. 
//Nakon što se simulacija završi, program ispisuje koliko puta je novèiæ 
//pokazao glavu a koliko puta pismo.
public class KovanicaZ5 {

	public static void main(String[] args) {
		// pocetne stanja varijabli glava i pismo
		int glava = 0;
		int pismo = 0;

		Scanner unos = new Scanner(System.in); // kreiramo skener za unos
		// podataka
		System.out.print("Unesite zeljeni broj bacanja kovanice : "); // poruka
		// korisniku
		int bacanje = unos.nextInt(); // unos iz konzole broj bacanja

		// petlja koja se vrti milion puta

		for (int i = 0; i < bacanje; i++) {
			// nasumicno generisanje 0 ili 1 za simulaciju bacanje novcica
			int random = (int) (Math.random() * 2);

			if (random == 0) {
				glava++; // povecaj glava varijablu za 1
			} else {
				pismo++; // povecaj pismo varijablu za 1
			}
		}

		// Ispisi rezultate simulacije
		System.out.println("Kovanica bacena " + bacanje + " puta, o toga pala je " + glava + " puta na glavu a " + pismo
				+ " na pismo.");

	}
}
