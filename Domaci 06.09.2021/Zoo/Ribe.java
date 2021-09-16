package Zoo;

public class Ribe extends Zivotinje {
	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;

	public Ribe(String vrsta, String naziv, String hrana, String mestoObitavanja, int brojPeraja, String vrstaPeraja) {
		super(vrsta, naziv, hrana);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getMestoObitavanja() {
		return mestoObitavanja;
	}

	public void setMestoObitavanja(String mestoObitavanja) {
		this.mestoObitavanja = mestoObitavanja;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}

	public void stampanje() {
		System.out.println(
				super.getNaziv() + " je Riba, " + super.getVrsta() + ", koji se hrani " + super.getHrana() + ". Zivi u "
						+ this.mestoObitavanja + ", ima " + this.brojPeraja + " " + this.vrstaPeraja + " peraja.");

	}

	public String toString() {
		return getNaziv();
	}

}
