package primeri;

import java.util.Scanner;

public class Domaci03 {

	public static void main(String[] args) {
		/*
		 * -Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik
		 * preko skenera. (Koristiti for petlju) Na primer N: 5
		 *
		 **
		 ***
		 ****
		 *****
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int N = s.nextInt();

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
