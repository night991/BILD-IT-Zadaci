package zadaci_19_1_2016;
/* Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi 
 * zajednièki prefix za ta dva stringa, ukoliko isti postoji. Na primjer, 
 * ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i 
 * "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki 
 * prefix za dva stringa je "Dobrodošli u". */
import java.util.Scanner;
public class PrefixZ3 {

	public static void main(String[] args) {
		// kreiranje ulaza
		Scanner unos = new Scanner(System.in);
		// unos prvog stringa
		System.out.println("Unesite prvi string: ");
		String string1 = unos.nextLine();
		// unos drugog stringa
		System.out.println("Unesite drugi string: ");
		String string2 = unos.nextLine();
		// poziv metode za provjeru dva stringa
		String zajednicki = zajednickiString(string1, string2);
		// provjera da li dobojeni string ima rezultata
		if (zajednicki.length() > 0) {
			// ako ima prikazi zajednicki string
			System.out.println("Zajednicki string je: " + zajednicki);
		} else {
			// ako nema prikazi poruku
			System.out.println("Nema zajednickih stringova");
		}
		unos.close();
	}

	//Metod koji izdvaja zajednicke karaktere dva stringa.
	public static String zajednickiString(String string1, String string2) {
		// kreiramo novi string koji ce sadrzati zajednicke karakre
		String zajednicki = "";
		// odredujemo koji string ima najmanju duzinu, kao se ovo ne uradi doce
		// do pada programa.
		int length = string1.length() >= string2.length() ? string2.length() : string1.length();
		// petlja kroz koju se provjeravajau karaktrei u stringu
		for (int i = 0; i < length; i++) {
			// ako su karakteri jednaki,
			if (string1.charAt(i) == string2.charAt(i)) {
				// dodaj karakter u zajednicki string
				zajednicki += string1.charAt(i);
			} else {
				// ako nisu, izadji iz petlje da se ne bi vrsila dalja provjera
				break;
			}
		}
		// vracamo zajednicki string
		return zajednicki.trim();
	}

}
