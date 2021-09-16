package domaci_fje;

import java.util.Scanner;

public class Funkcije_2 {

	public static void main(String[] args) {
		
	/*
		Funkcije2:
			Napisati program koji ce procitati 3 cela broja sa standardnog ulaza
			 i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
			 */
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite brojeve: ");
		int broj1 = s.nextInt();
		int broj2 = s.nextInt();
		int broj3 = s.nextInt();
		s.close();
		int proizvod = mul(broj1,broj2,broj3);
		
		System.out.println("Proizvod unetih brojeva je: " + proizvod);
	
		
	}
public static int mul(int x, int y, int z) {
	return x * y * z;
	
}

}