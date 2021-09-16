package Primer01;

import java.util.Scanner;

public class DomaciZadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ime = "Maja";
		String prezime = "Maslovaric";
		char pol = 'z';
		
		System.out.println(ime + " " + prezime + " " + "(" + pol + ")"); 
	
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ukupan broj medalja: ");
		int ukBrMedalja = s.nextInt();
		System.out.println("Ukupan broj zlatnih medalja: ");
		int ukBrZlmedalja = s.nextInt();
		
		double odnos = ((double) (ukBrZlmedalja) /(ukBrMedalja)) * 100;
		System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj medalja je: " + odnos+ "%");
		
		s.close();
		}

}
