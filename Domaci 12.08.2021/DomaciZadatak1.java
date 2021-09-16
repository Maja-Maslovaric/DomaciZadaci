package Primer01;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      /* Povrsina i obim pravougaonika*/
		
		
		
		/* 
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Unesite stranicu a: ");
		double a = s.nextDouble();
		System.out.println("Unesite stranicu b: ");
		double b = s.nextDouble();
		double p = a * b;
		double o = 2 * a + 2 * b;
	     
	    s.close();
		
		System.out.println("Povrsina pravougaonika je: "+p);
		System.out.println("Obim pravougaonika je: "+o);
		
		*/
		
		/* Povrsina i obim kvadrata */ 
		
        Scanner s = new Scanner(System.in);
		
		
		System.out.println("Unesite stranicu a: ");
		double a = s.nextDouble();
		
		double p = a * a;
		double o = 4 * a;
	     
		
		System.out.println("Povrsina kvadrata je: "+p);
		System.out.println("Obim kvadrata je: "+o);
		
		s.close();
		
	}

}
