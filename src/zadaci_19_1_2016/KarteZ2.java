package zadaci_19_1_2016;
/*Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K)
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.*/
public class KarteZ2 {

	public static void main(String[] args) { //main
		String[] karte = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K" }; //kreiramo niz karte
		String[] znakovi = { "srce", "pik", "djetelina", "kocka" }; //kreiramo niz znakovi
		String karta = karte[(int) (Math.random() * 13 + 1)]; // random od karata
		String znak = znakovi[(int) (Math.random() * 4)]; //random od znaka
			System.out.println("Karta koju ste izvukli je " + karta + " u znaku " + znak); //ispis
	}
}