
/*
 * Napraviti klasu Glumci koja ce imati public atribute:
 *  Ime i prezime, godina rodjenja, pol.
 *   Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu,
 *    broj snimljenih filmova. 
 *    Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima,
 *     koliko godina pune u 2022. godini, ako su muskog pola preko atributa treba
 *      pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola. 
 *      Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova
 *       (pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do
 *        najgore ocenjenog filma od tih pet (preko getera i setera).
 */

package glumci;

import java.util.ArrayList;
import java.util.Collection;

public class Glumci_I_Filmovi {

	public static void main(String[] args) {
		double najboljeOcenjeniFilm;
		double ocenaFilma;

		Glumci glumac = new Glumci("Jason", "Statham", 1967, "muski", true);
		glumac.setBrojSnimljenihFilmova(36);
		glumac.setProsecnaZaradaPoFilmu(2250000L);

		glumac.stampanje();

		String film1 = "WRATH OF MAN, sa IMDb ocenom 7.2";
		String film2 = "FAST & FURIOUS PRESENTS: HOBBS & SHAW, sa IMDb ocenom 6.4";
		String film3 = "THE MAG, sa IMDb ocenom 5.6";
		String film4 = "THE FATE OF THE FURIOUS, sa IMDb ocenom 6.6";
		String film5 = "MECHANIC: RESSURECTION, sa IMDb ocenom 5.7";

		ArrayList filmovi = new ArrayList();
		filmovi.add(film1);
		filmovi.add(film2);
		filmovi.add(film3);
		filmovi.add(film4);
		filmovi.add(film5);

		// for (int i = 0; i < filmovi.size(); i++) {
		// System.out.println((i + 1) + ". film je " + filmovi.get(i));
		// }

		// System.out.println();

		Object f4 = filmovi.get(3);
		filmovi.set(3, filmovi.get(1));
		filmovi.set(1, f4);

		// for (int i = 0; i < filmovi.size(); i++) {
		// System.out.println((i + 1) + ". film je " + filmovi.get(i));
		// }

		// System.out.println();

		Object f3 = filmovi.get(3);
		filmovi.set(3, filmovi.get(2));
		filmovi.set(2, f3);

		// for (int i = 0; i < filmovi.size(); i++) {
		// System.out.println((i + 1) + ". film je " + filmovi.get(i));
		// }

		System.out.println();

		Object f5 = filmovi.get(4);
		filmovi.set(4, filmovi.get(3));
		filmovi.set(3, f5);

		for (int i = 0; i < filmovi.size(); i++) {
			System.out.println((i + 1) + ". film je " + filmovi.get(i));
		}

		System.out.println();

	}
}
