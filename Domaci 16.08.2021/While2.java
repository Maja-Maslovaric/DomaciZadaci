package domaciZadatak;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {

		/*
		 * While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku
		 * noc!” onoliko puta koliko je korisnik zadao preko konzole. Primer: ako
		 * korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Koliko puta zelite ispisati \"Laku noc!\" ?");
		int brojPonavljanja = s.nextInt();
		int iterator = 0;
		while (iterator < brojPonavljanja) {
			System.out.println("Laku noc!");
			iterator++;
		}

		s.close();
	}

}
