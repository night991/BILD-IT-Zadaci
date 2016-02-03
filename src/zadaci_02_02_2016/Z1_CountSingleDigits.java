package zadaci_02_02_2016;

/*(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)*/
public class Z1_CountSingleDigits {

	public static void main(String[] args) {
		// kreiramo broj i niz brojeva
		int broj = 0;
		int niz[] = new int[10];
		// generisemo 100 brojeva od 0 do 9 i dodajemo u niz
		for (int i = 0; i < 100; i++) {
			broj = (int) (Math.random() * 10);
			for (int j = 0; j < 10; j++) {
				if (broj == j) {
					niz[j] = niz[j] + 1;
				}
			}
		}
		// ispis brojeva i ponavljanja
		for (int i = 0; i < 10; i++) {
			System.out.println("Broj " + i + " se ponovio " + niz[i] + " puta");
		}
	}
}
