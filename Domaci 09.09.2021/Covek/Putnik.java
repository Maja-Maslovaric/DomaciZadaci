/*
 *    Putnik je covek koji poseduje novac. 
   Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
   Odredjena svota novca moze da mu se doda i/ili oduzme.
 */

package covek;

public class Putnik extends Covek {
	private int novac;

	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;

	}

	public int getNovac() {
		return novac;
	}

	public void dodajNovac(int x) {
		this.novac += x;

	}

	public void oduzmiNovac(int x) {
		if (novac > x) {
			this.novac -= x;
		} else {
			System.out.println("Nije moguce umanjiti novac za odredjenu sumu.");
		}
	}

	@Override
	public String toString() {

		return super.getIme() + " " + super.getPrezime() + ", poseduje " + this.getNovac() + " dinara";
	}

}
