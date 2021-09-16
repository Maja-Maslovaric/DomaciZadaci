package domaci_fje;

import java.util.Scanner;

public class Funkcije_3 {

	public static void main(String[] args) {

		/*
		 * 
		 * DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima ->
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
		 * i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca
		 * najveci od unetih brojeva.
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite brojeve: ");
		int broj1 = s.nextInt();
		int broj2 = s.nextInt();
		int broj3 = s.nextInt();
		s.close();

		int zbir = sum(broj1, broj2, broj3);
		System.out.println("Zbir unetih brojeva je: " + zbir);

		int najveciBroj = maxBroj(broj1, broj2, broj3);
		System.out.println("Najveci broj je: " + najveciBroj);

	}

	public static int sum(int x, int y, int z) {
		int suma = x + y + z;
		return suma;
	}

	public static int maxBroj(int x, int y, int z) {
		int max = x;
		if (z > max) {
			max = z;
			return z;
		} else if (y > max) {
			max = y;
			return y;
		} else {
			return x;
		}
	}
}
