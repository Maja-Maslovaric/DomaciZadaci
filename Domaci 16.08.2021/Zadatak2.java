package domaciZadatak;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		// ZADATAK
		// 2. Naci sumu parnih i sumu neparnih brojeva izmedju dva proizvoljno uneta
		// broja

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj a: ");
		int a = s.nextInt();
		System.out.print("Unesite broj b: ");
		int b = s.nextInt();

		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		int zbirParnih = 0;
		int zbirNeparnih = 0;

		while (a < b) {
			if (a % 2 == 0) {
				zbirParnih = zbirParnih + a;
				System.out.println("a : " + a + ", zbirParnih: " + zbirParnih);
			} else {
				zbirNeparnih = zbirNeparnih + a;
				System.out.println("a : " + a + ", zbirNeparnih: " + zbirNeparnih);
			}
			a++;
		}

		s.close();

	}

}
