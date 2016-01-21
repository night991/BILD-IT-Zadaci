package zadaci_20_1_2016;

import java.util.Scanner;

/*Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj
 *  godina te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 *  buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 *  Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 
 *  kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */
public class InvesticijaZ1 {

	public static void main(String[] args) { // main metoda
		Scanner unos = new Scanner(System.in);// generisemo skener
		System.out.println("Unesite pocetni iznos investicije");// poruka
																// pocetni iznos
		double iznosInvesticije = unos.nextDouble(); // dodjeljujemo vrijednost

		System.out.println("Unesite godisnju interesnu stopu "); // godisnja
																	// stopa
		double stopa = unos.nextDouble(); // dodjeljujemo vrijednost

		System.out.println("Unesite broj godina "); // broj godina
		double godina = unos.nextDouble(); // dodjeljujemo vrijednost
		unos.close();

		double mjesecnaInteresnaStopa = (stopa / 100) / 12; // vrijednost stope
		double buducaVrijednostInvesticije = iznosInvesticije * (Math.pow((1 + mjesecnaInteresnaStopa), (godina * 12)));// racunanje
																														// investicije
		System.out.println("Ako investirate " + iznosInvesticije + " za " + godina + " vasa investicija ce vrijediti: "
				+ buducaVrijednostInvesticije); // ispis
	}

}
