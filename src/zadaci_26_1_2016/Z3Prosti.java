package zadaci_26_1_2016;

/*Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) 
 * koja provjerava da li je broj prost/prime. Napsati test program 
 * koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.*/
public class Z3Prosti {

	public static boolean isPrime(int n) {
		// uslov da li je broj prost
		if ((n > 2) && ((n & 1) == 0) || (n == 0) || (n == 1))
			return false;
		for (int i = 3; i * i <= n; i += 2)
			if (n % i == 0) {
				return false;
			}
		return true;
	}

	public static void main(String[] args) {
		// ispis prostih brojeva u intervalu
		System.out.println("Prosti brojevi u intervalu od 0 do 100000:");

		// petljom prolazimo kroz zeljeni niz
		for (int i = 0; i <= 100000; i++) {
			// poziv metode za ispitivanje prostih brojeva
			if (isPrime(i)) {
				// ispis
				System.out.println(i + " ");
			}
		}
	}
}
