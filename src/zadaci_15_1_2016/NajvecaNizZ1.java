package zadaci_15_1_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
//Napisati sljedeću metodu koja vraća najveću vrijednosti u ArrayListu Integera. 
//Metoda vraća null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
//public static Integer max(ArrayList<Integer> list)

public class NajvecaNizZ1 {

	public static Integer max(ArrayList<Integer> list) { // metoda za max
		if (list.isEmpty()) { // provjera je li lista prazna
			return null;
		} else {
			int max = (int) list.get(0); // ako lista nije prazna upisujemo
											// vrijednost i postavljamo max
			for (int i = 1; i < list.size(); i++) {
				if ((int) list.get(i) > max) {
					max = (int) list.get(i);
				}

			}
			return max;
		}

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in); // kreiramo skener za unos u list
		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.println("Unesite zeljene brojeve niza ( nula prekida unos) :");
		try {
			while (true) {
				int broj = unos.nextInt();

				if (broj == 0) {
					System.out.println(max(a)); // ispis max
				} else
					a.add(broj); // dodajemo broj

			}
		} catch (InputMismatchException ex) {
			System.out.println("Molimo unesite broj");
			unos.close();

		}
	}
}
