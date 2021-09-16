package domaci_kviz;

import java.util.Scanner;

public class Kviz {

	public static void main(String[] args) {

		/*
		 * ZADATAK Napisati program koji oponasa kviz za pogadjanje glavnog grada. -
		 * Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z
		 * programa. 1. Francuska 2. Italija 3. Srbija 4. Izlaz - Nakon odabira drzave,
		 * potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako
		 * korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik
		 * odgovori netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja
		 * odgovora (bilo da je tacan ili netacan), ponovo treba da se postave sve
		 * pocetne opcije i ponudi korisniku da odabere neku od njih. - Program se
		 * zavrsava kad korisnik odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem
		 * dosad naucenog + do-while petlje
		 */

		int izbor;

		Scanner s = new Scanner(System.in);
		Scanner grad = new Scanner(System.in);
		do {
			System.out.println("\n 1. Francuska \n 2. Italija \n 3. Srbija \n 4. Izlaz ");

			izbor = s.nextInt();

			switch (izbor) {
			case 1:
				System.out.println("Koji je glavni grad drzave Francuske?");
				String odgovor1 = grad.nextLine();
				String tacanOdgovor1 = "Pariz";
				if (odgovor1.equals(tacanOdgovor1)) {
					System.out.println("Odgovor je tacan.");
				} else {
					System.out.println("Odgovor nije tacan.");

				}
				break;
			case 2:
				System.out.println("Koji je glavni grad drzave Italije?");
				String odgovor2 = grad.nextLine();
				String tacanOdgovor2 = "Rim";
				if (odgovor2.equals(tacanOdgovor2)) {
					System.out.println("Odgovor je tacan.");
				} else {
					System.out.println("Odgovor nije tacan.");
				}
				break;
			case 3:
				System.out.println("Koji je glavni grad drzave Srbije?");
				String odgovor3 = grad.nextLine();
				String tacanOdgovor3 = "Beograd";
				if (odgovor3.equals(tacanOdgovor3)) {
					System.out.println("Odgovor je tacan.");
				} else {
					System.out.println("Odgovor nije tacan.");

				}
				break;
			case 4:
				System.out.println("Izasli ste iz kviza!");
				break;
			default:
				System.out.println("Pogresna opcija!");
			}

		} while (izbor != 4);

		s.close();
		grad.close();
	}
}
