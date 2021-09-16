/*
 *   Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze.
   Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.
 */

package covek;

import java.util.ArrayList;

public class Autobus {
	private String naziv;
	private int cenaKarte;
	private ArrayList<Vozac> vozaci;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, int cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.putnici = new ArrayList<Putnik>();
		this.vozaci = new ArrayList<Vozac>();
	}

	public String getNaziv() {
		return naziv;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}

	public void dodajPutnika(Putnik p) {
		putnici.add(p);
	}

	public void ukloniPutnika(Putnik p) {
		if (putnici.contains(p))
			putnici.remove(p);
	}

	public Vozac dodajVozaca(Vozac v) {
		vozaci.add(v);
		return v;
	}

	public void ukloniVozaca(Vozac v) {
		if (vozaci.contains(v))
			vozaci.remove(v);
	}

	@Override
	public String toString() {

		return "Naziv autobusa je " + naziv + ", vozac je: " + vozaci + ". \nPutnik koji se vozi u autobusu je: "
				+ putnici + " \ni karta u autobusu kosta " + cenaKarte + " dinara.";
	}

}
