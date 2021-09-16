package Primer01;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Izracunati obim i povrsinu kruga*/
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Unesite Vase ime: ");
			String ime = s.nextLine();
			System.out.println("Unesite Vase ime: ");
			String prezime = s.nextLine();
			System.out.println("Unesite poluprecnik kruga: ");
			double r = s.nextDouble();
			
			
			double p = 3.14 * r * r;
			double o = 2 * r * 3.14;
			
			System.out.println("Rezultati za: " + ime + " "  +  prezime + " " +  "su");
			System.out.println("Povrsina kruga je:" +p);
			System.out.println("Obim kruga je:" +o);
		}
		
		

		
	}

}
