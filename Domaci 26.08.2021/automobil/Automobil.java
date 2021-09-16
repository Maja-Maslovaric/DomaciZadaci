package autic;

public class Automobil {
	public String markaAutomobila;
	public String modelAutomobila;
	public String pogonAutomobila;
	public int brojVrataAutomobila;
	public int godisteAutomobila;
	private int predjeniKm;
	private int potrosnjaGoriva;
	private int kubikaza;
	private int novacZaGorivo;
	int cenaGoriva = 120;

	public Automobil(String marka, String model, String pogon, int brojVrata, int godiste) {
		this.markaAutomobila = marka;
		this.modelAutomobila = model;
		this.pogonAutomobila = pogon;
		this.brojVrataAutomobila = brojVrata;
		this.godisteAutomobila = godiste;

	}

	public Automobil() {

	}

	public void stampanje() {
		System.out.println("Automobil je marke " + markaAutomobila + ", model " + modelAutomobila + " i pogon mu je "
				+ pogonAutomobila + ". \n Ima " + brojVrataAutomobila + " vrata" + " i " + godisteAutomobila
				+ ". je godiste. \n" + "Presao je " + predjeniKm + " kilometara, sa kubikazom od " + 
				getKubikaza() + "cm^3 i potrosnjom od "
				+ getPotrosnjaGoriva() + " litara na 100 km i ukupno potroseno novaca za gorivo je "
				+ getPotrosenoNovaca() + ".");
	}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;

	}

	public void setPotrosnjaGoriva(int potrosnja) {
		this.potrosnjaGoriva = potrosnja;
	}

	public int getPotrosnjaGoriva() {
		if (kubikaza > 1000) {
			return potrosnjaGoriva = 10;
		} else if (kubikaza < 1000) {
			return potrosnjaGoriva = 8;
		}
		return this.potrosnjaGoriva;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public int getKubikaza() {
		return this.kubikaza;
	}

	public void setPotrosenoNovaca(int potroseno) {
		this.novacZaGorivo = potroseno;
	}

	public int getPotrosenoNovaca() {
		novacZaGorivo = (predjeniKm / 100) * cenaGoriva * 10;

		return this.novacZaGorivo;
	}

}
