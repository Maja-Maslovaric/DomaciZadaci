package primeri;

import java.util.Scanner;

public class Domaci01 {

	public static void main(String[] args) {
		/*
		 * 
		 * -Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan
		 * broj prikaze mu se suma svih prethodno unetih brojeva i na kraju
		 * zakomentarisati koje ste brojeve sve unosili po testu na primer: //test 1 x,
		 * y, z //test 2 x, y, z //test 3 x, y, z (Koristiti do while petlju)
		 */

		Scanner s = new Scanner(System.in);
		int zbir = 0;
		int broj = 0;

		do {

			System.out.println("Unesite broj: ");
			broj = s.nextInt();
			if (broj > 0) {
				zbir = zbir + broj;
			}
		} while (broj > 0);

		System.out.println("Zbir prethodno unetih brojeva je: " + zbir);

		s.close();
	}

}
