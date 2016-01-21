package zadaci_20_1_2016;

import java.util.Scanner;

/*Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, 
 * možemo izračunati minimalnu dužinu piste potrebne da avion uzleti 
 * koristeći se sljedećom formulom: dužina = v * v / 2a. 
 * Napisati program koji pita korisnika da unese v u m/s i a u m/s² 
 * te ispisuje korisniku minimalnu dužinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)*/
public class PistaZ5 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in); // novi Scanner
		System.out.println("Unesite brzinu uzlijetanja u m/s"); // poruka unesi brzinu uzlijetanja
		double brzinaUzlijetanja = unos.nextDouble(); // ucitavanje brzine uzlijetanja
		System.out.println("Unesite ubrzanje aviona u m/s2"); // poruka unesi ubrzanje
		double ubrzanje = unos.nextDouble(); // ucitavanje ubrzanja
		double duzina = (brzinaUzlijetanja * brzinaUzlijetanja) / (2 * ubrzanje);//racunanje duzine
		System.out.println(" Ukoliko imamo brzina uzlijetanja: " + brzinaUzlijetanja + " m/s"
				+ " i ubrzanje od: " + ubrzanje +" m/s2" + " potrebna je pista duzine minimalno " + duzina + " m ");
	}

}
