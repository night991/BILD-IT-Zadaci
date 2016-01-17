package zadaci_15_1_2016;

//Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9 
//te ispisuje koliko se puta koji broj ponovio.

public class NasumicniPonavljanjeZ4 {

	public static void main(String[] args) {
		int nula = 0, jedinica = 0, dvica = 0, trica = 0, cetvorka = 0, petica = 0, sestica = 0, sedmica = 0,
				osmica = 0, devetka = 0; // definisemo brojeve
		for (int i = 1; i <= 100; i++) { // petlja za 100 brojeva
			int nasumicnibroj = (int) (Math.random() * 10); // nasumicni 0-9
			System.out.print(nasumicnibroj + ", ");

			if (nasumicnibroj == 0) // ukoliko je uneseni broj jednak
				nula++; // broj cifara uvecavamo za 1
			else if (nasumicnibroj == 1) // ukoliko je uneseni broj jednak
				jedinica++;
			else if (nasumicnibroj == 2)
				dvica++;
			else if (nasumicnibroj == 3)
				trica++;
			else if (nasumicnibroj == 4)
				cetvorka++;
			else if (nasumicnibroj == 5)
				petica++;
			else if (nasumicnibroj == 6)
				sestica++;
			else if (nasumicnibroj == 7)
				sedmica++;
			else if (nasumicnibroj == 8)
				osmica++;
			else if (nasumicnibroj == 9)
				devetka++;
		}

		System.out.println("Broj nula ponavlja se " + nula + " puta"); // ispisujemo
																		// koliko
																		// se
																		// puta
																		// odredeni
																		// broj
																		// ponavlja
		System.out.println("Broj jedinica ponavlja se " + jedinica + " puta");
		System.out.println("Broj dvica ponavlja se " + dvica + " puta");
		System.out.println("Broj trica ponavlja se " + trica + " puta");
		System.out.println("Broj cetvorki ponavlja se " + cetvorka + " puta");
		System.out.println("Broj petica ponavlja se " + petica + " puta");
		System.out.println("Broj sestica ponavlja se " + sestica + " puta");
		System.out.println("Broj sedmica ponavlja se " + sedmica + " puta");
		System.out.println("Broj osmica ponavlja se " + osmica + " puta");
		System.out.println("Broj devetki ponavlja se " + devetka + " puta");

	}

}
