package Domaci_1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		-Napisati program gde preko skenera unesete broj, 
		ako je broj manji od 10 onda ga pomnoziti sa 100, 
		ako je broj veci od 100 onda ga podeliti sa 10.
		Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.
		*/
		
		
	
    Scanner s = new Scanner(System.in);
    
    System.out.print("Unesite broj: ");
    int broj = s.nextInt();
    
    if(broj < 10) {
    	int x = broj * 100;
    	System.out.println("Dobijeni broj je: " + x);
    } else if(broj > 100) {
    	double y = (double) broj / 10;
    	System.out.println("Dobijeni broj je: " + y);
    } else {
    	System.out.println("Kraj programa.");
    }
		s.close();
		
		/*
		 * 1) unet je broj 5, ispisao 500
		 * 2) unet je broj 25, ispisao je "Kraj programa."
		 * 3) unet je broj 102, ispisao je 10.2
		 */
		
	}

}
