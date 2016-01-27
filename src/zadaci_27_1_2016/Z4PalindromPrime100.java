package zadaci_27_1_2016;

/*Palindrome prime je prosti broj koji je takoðer i palindrom. 
 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. */
public class Z4PalindromPrime100 {

	public static void main(String[] args) {

		// deklarisemo pocetne vrijednosti
		int count = 1, number = 2;
		String result = "";
		// za prvih 100 brojeva
		while (count <= 100) {
			// da li je palindromprime
			if (Prime(number) && Palindromic(number)) {
				if (count % 10 == 0) {
					result += " " + number + "\n";
				} else {
					result += " " + number;
				}
				count++;
			}
			number++;
		}
		// ispis brojeva
		System.out.println("Prvih sto palindromPrime brojeva je:");
		System.out.print(result);
	}

	// metod prime je li broj prosti
	public static boolean Prime(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// metod za provjeru da li je palindrom
	public static boolean Palindromic(int num) {
		int result = 0;
		int number = num;

		// unatrag
		while (num != 0) {
			int lastDigit = num % 10;
			result = result * 10 + lastDigit;
			num /= 10;

		}
		if (number == result) {
			return true;
		}
		return false;
	}
}