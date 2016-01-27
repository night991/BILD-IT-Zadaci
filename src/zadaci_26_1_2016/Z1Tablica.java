package zadaci_26_1_2016;
/*Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 broja
 *  u sljedeæem formatu AAA-1234. Napisati program koji nasumièno generiše tablicu.*/

public class Z1Tablica {
	public static void main(String[] args) {
		// generišemo 4 nasumicna broja
		int br1 = (int) (Math.random() * 10);
		int br2 = (int) (Math.random() * 10);
		int br3 = (int) (Math.random() * 10);
		int br4 = (int) (Math.random() * 10);
		// definisemo moguce slovo
		String mogucBroj = "ABCDEFGHIJKLMNOPRSTUVZ";
		char sl1 = mogucBroj.charAt((int) (Math.random() * 22));
		char sl2 = mogucBroj.charAt((int) (Math.random() * 22));
		char sl3 = mogucBroj.charAt((int) (Math.random() * 22));
		// ispis registarske oznake
		System.out.println("Vaša registarska oznaka je: " + sl1 + "" + sl2 + "" + sl3 + "-" + br1 + "" + br2 + "" + br3
				+ "" + br4);

	}

}
