
/*
 * Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
 *  Svi podaci mogu da se dohvate, ali ne i postave.
 *  
   Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

   Putnik je covek koji poseduje novac. 
   Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
   Odredjena svota novca moze da mu se doda i/ili oduzme.

   Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze.
   Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.
 */

package covek;

public abstract class Covek {
	private String ime;
	private String prezime;

	public Covek(String ime, String prezime) {

		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {

		return ime + " " + prezime;
	}

}
