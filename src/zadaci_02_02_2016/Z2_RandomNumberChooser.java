package zadaci_02_02_2016;
/*(Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)*/
public class Z2_RandomNumberChooser {

	public static int getRandom(int number) {

		// Biramo nasumicni broj
		int nasumicni = (int) (Math.random() * 54 + 1);

		// Sve dok je nasumicni jednak unesenom broju petlja ce nanovo birati
		while (nasumicni == number) {
			nasumicni = (int) (Math.random() * 54 + 1);
		}
		return nasumicni;
	}

	public static void main(String[] args) {

		// Importujemo Scanner i kreiramo objekat
		java.util.Scanner unos = new java.util.Scanner(System.in);

		System.out.print("Unesite broj: OD 1 DO 54 ");
		int number = unos.nextInt();

		unos.close();

		System.out.print("Nasumicni broj je: " + getRandom(number));

	}

}

