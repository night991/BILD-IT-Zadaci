package zadaci_21_1_2016;

import java.util.Scanner;
//Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) 
//te mu ispiše broj dana u tom mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a 
//kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
public class Z3DanauMjesecuSlova {

	public static boolean prestupna(int godina) { // da li je godina prijestupna
		if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void danaUMjesecu(String mjesec, int godina) { //metoda za provjeru mjeseca
		
		if ((mjesec.matches("Feb")) && (prestupna(godina)))
			System.out.println("Februar ima 29 dana.");
		if (mjesec.matches("Jan"))
			System.out.println("Januar ima 31 dan.");
		if (mjesec.matches("Feb")&&(prestupna(godina)==false))
			System.out.println("Februar ima 28 dana.");
		if (mjesec.matches("Mar"))
			System.out.println("Mart ima 31 dan.");
		if (mjesec.matches("Apr"))
			System.out.println("April ima 30 dana.");
		if (mjesec.matches("Maj"))
			System.out.println("Maj ima 31 dan.");
		if (mjesec.matches("Jun"))
			System.out.println("Juni ima 30 dana.");
		if (mjesec.matches("Jul"))
			System.out.println("Juli ima 31 dan.");
		if (mjesec.matches("Aug"))
			System.out.println("August ima 31 dan.");
		if (mjesec.matches("Sep"))
			System.out.println("Septembar ima 30 dana.");
		if (mjesec.matches("Okt"))
			System.out.println("Oktobar ima 31 dan.");
		if (mjesec.matches("Nov"))
			System.out.println("Novembar ima 30 dan.");
		if (mjesec.matches("Dec"))
			System.out.println("Decembar ima 31 dan.");
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in); //kreiramo skener za unos podataka
		System.out.println("Unesite prva tri slova mjeseca (prvo slovo veliko): ");
		String mjesec = unos.nextLine();
		System.out.println("Unesite godinu: ");
		int godina = unos.nextInt();

		danaUMjesecu(mjesec, godina);
		unos.close();
	}

}