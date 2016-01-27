package zadaci_27_1_2016;

/*Emirp brojevi (prime unazad) je nepalindromski prosti broj koji 
 * je prosti broj i kada ispišemo naopako. Na primjer, broj 17 i 
 * broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. 
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. */
public class Z3Emirp {

	public static void main(String[] args) {
		// trazimo 100 empirs brojeva
		int emrips = 100;
		int count = 1;
		// ako je broj prost, ako se moze ispisat unatrag i ako je polindrom
		System.out.println("Prvih 100 emrips brojeva: ");
		for (int i = 2;; i++) {
			if ((isPrime(i)) && (isPrime(reverseIt(i))) && (!isPalindrome(i))) {
				System.out.print(i + " ");
				// ispis 10 po liniji
				if (count % 10 == 0) {
					System.out.println();
				}
				// ako je broj veci od 100 prekidamo
				if (count == emrips) {
					break;
				}
				count++;
			}
		}
	}

	// metoda za provjeru da li je broj prosti
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
			if ((num == 1) || (num == 2)) {
				return true;
			}
		}
		return true;
	}

	// metoda za unatrag
	public static int reverseIt(int num) {
		int result = 0;

		while (num != 0) {
			int lastDigit = num % 10;
			result = result * 10 + lastDigit;
			num /= 10;
		}
		return result;
	}

	// ako je palindrom pozivamo metodu za unatrag
	public static boolean isPalindrome(int num) {
		return num == reverseIt(num);
	}
}