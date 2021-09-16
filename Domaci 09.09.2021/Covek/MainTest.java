package covek;

public class MainTest {

	public static void main(String[] args) {

		Vozac v1 = new Vozac("Marko", "Markovic");
		Putnik p1 = new Putnik("Petra", "Petrovic", 1000);
		
		p1.dodajNovac(550);         // dodavanje novca putniku
		System.out.println(p1);
		System.out.println();
		
		p1.oduzmiNovac(500);       // oduzimanje novca putniku
		System.out.println(p1);
		System.out.println();
		
		p1.oduzmiNovac(1500);      // zelimo da oduzmemo vise novaca nego sto ima
		System.out.println(p1);
		System.out.println();

		Autobus a1 = new Autobus("Lasta", 500);   // prazan autobus
		System.out.println(a1);
		System.out.println();
		
		a1.dodajVozaca(v1);      // dodavanje vozaca i putnika
		a1.dodajPutnika(p1);
		System.out.println(a1);
		System.out.println();
		
		a1.ukloniPutnika(p1);     // uklanjanje putnika
		System.out.println(a1);
		System.out.println();
		
		a1.ukloniVozaca(v1);      // uklanjanje vozaca
		System.out.println(a1);
		System.out.println();
		
		

	}
}