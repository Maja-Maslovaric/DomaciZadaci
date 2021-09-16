package domaci_fje;

import java.util.Scanner;

public class Funkcije_1 {

	public static void main(String[] args) {

		/*
		 * Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza (znaci da korisnik unosi tri broja) i taj program treba da pozove i
		 * ispise (u mainu) najmanji od ta tri unesena broja.
		 */

		int minimalniBroj;
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite brojeve: ");
		int broj1 = s.nextInt();
		int broj2 = s.nextInt();
		int broj3 = s.nextInt();
		s.close();
		minimalniBroj = minBroj(broj1, broj2, broj3);

		System.out.println("Najmanji broj je: " + minimalniBroj);

	}

	public static int minBroj(int x, int y, int z) {
		int min = x;
		if (y < min) {
			min = y;
			return y;
		} else if (z < min) {
			min = z;
			return z;
		} else {
			return x;
		}

	}

}
