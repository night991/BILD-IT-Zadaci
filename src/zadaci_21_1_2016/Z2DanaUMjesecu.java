package zadaci_21_1_2016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše 
 * broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao 
 * godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana. 
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, 
 * program treba ispisati da je Mart 2015 imao 31 dan.*/

public class Z2DanaUMjesecu {
	// kreiramo metodu za vracnje datuma
	public static void dateReturn(int mjesec, int godina) {
		// postavljamo pocetne vrijednosti i format za mjesec i godinu
		int mjesec1 = mjesec;
		int godina1 = godina;
		String str = mjesec1 + "." + godina1;
		SimpleDateFormat sd = new SimpleDateFormat("MM.yyyy");

		try { //koristime metode za kalendar koja nam vraca broj dana u mjesecu
			Date d = sd.parse(str);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			System.out.println("Uneseni mjesec u godini ima: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " dana.");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);// generisemo skener
		System.out.println("Unesite mjesec: ");// poruka za mjesec
		int mjesec = unos.nextInt(); // dodjeljujemo vrijednost
		System.out.println("Unesite godinu: "); // poruka za godinu
		int godina = unos.nextInt(); // dodjeljujemo vrijednost

		dateReturn(mjesec, godina); // vracamo vunesene vrijednosti

	}

}
// public static void main(String[] args) {
//
// String date = "01-03-2015";
// String[] input = date.split("-");
// int day = Integer.valueOf(input[0]);
// int month = Integer.valueOf(input[1]);
// int year = Integer.valueOf(input[2]);
// Calendar cal = Calendar.getInstance();
// cal.set(Calendar.YEAR, year);
// cal.set(Calendar.MONTH, month - 1);
// cal.set(Calendar.DATE, day);
// // since month number starts from 0 (i.e jan 0, feb 1),
// // we are subtracting original month by 1
// int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
// System.out.println(days);
// }
// }