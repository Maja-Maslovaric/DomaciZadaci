/*
 *  Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
 */
package covek;

public class Vozac extends Covek {

	private String zvanje;

	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zvanje = "sofer";

	}

	@Override
	public String toString() {

		return super.getIme() + " " + super.getPrezime() + " (zanimanje ->" + zvanje + ")";
	}

}
