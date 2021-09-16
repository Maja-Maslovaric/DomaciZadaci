package domaciZadatak;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {

		/*
		 * While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen
		 * negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako
		 * korisnik unese 1 2 5 3 -1, program treba da ispise 11
		 */
		Scanner s = new Scanner(System.in);

		int broj = 0;
		int zbir = 0;

		while (broj >= 0) {
			System.out.println("Unesite broj: ");
			broj = s.nextInt();

			if (broj < 0) {
				System.out.println("Uneli ste negativan broj!");
				break;
			}
			zbir = zbir + broj;
			broj++;
			System.out.println("Zbir pozitivnih brojeva je: " + zbir);
		}
		System.out.println("Konacan zbir pozitivnih brojeva je: " + zbir);
		s.close();

	}

}
