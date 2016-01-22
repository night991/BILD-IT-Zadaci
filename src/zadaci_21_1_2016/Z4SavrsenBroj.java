package zadaci_21_1_2016;

/*Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, 
 * iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. 
 * Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.*/
public class Z4SavrsenBroj {
	public static void main(String[] args) {

		System.out.println("U prvih 10 000 brojeva savrseni brojevi su: ");

		// kroz petlju prolazimo 10 000 puta, pocinjemo sa 2
		for (int i = 2; i < 10_000; i += 2) {
			int temp = 0;
			// provjerimo djelioce broja i
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					temp += j;
			}
			if (temp == i) //broj je savrsen
				System.out.println(i);
		}
	}
}