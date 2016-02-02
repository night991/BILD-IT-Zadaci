package mini2_CrapsCreditCards;

/*(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player.*/
public class Craps {

	public static void main(String[] args) {
		int kockice; // definisemo kockice
		kockice = (int) (6.0 * Math.random() + 1.0) + (int) (6.0 * Math.random() + 1.0);
		// ako vaze pravila igre
		if (kockice == 2 || kockice == 3 || kockice == 12) {
			System.out.println("Gubis: " + kockice);
		} else if (kockice == 7 || kockice == 11) {
			System.out.println("Pobjeda: " + kockice);
		} else {
			int point = kockice; // bodovi: 4, 5, 6, 8, 9, or 10
			System.out.println("Bodovi: " + point);
			while (true) { // nastavljamo dalje
				kockice = (int) (6.0 * Math.random() + 1.0) + (int) (6.0 * Math.random() + 1.0);
				System.out.println("\nNovo bacanje: " + kockice);
				if (kockice == point) {
					System.out.println("Bravo pobjeda!");
					break; // pobjeda
				}
				if (kockice == 7) {
					System.out.println("Gubis: 7");
					break; // poraz
				} else
					System.out.println("Vise srece drugi put");
			}
		}
	}
}