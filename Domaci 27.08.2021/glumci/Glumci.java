package glumci;

public class Glumci {
	public String ime;
	public String prezime;
	public int godinaRodjenja;
	public String pol;
	private boolean status = true;
	private long prosecnaZaradaPoFilmu;
	private int brojSnimljenihFilmova;
	private long ukupnaZarada;
	private int brojGodina;
	private String naslovFilma;
	private double ocenaFilma;

	String muski, zenski, bracnoStanje;

	public Glumci(String ime, String prezime, int godinaRodjenja, String pol, boolean status) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
		this.status = status;

	}

	public Glumci() {

	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public String getPol() {
		if (pol.equalsIgnoreCase("muski")) {
			ime = "Mr. ".concat(ime);
			return this.ime;
		} else if (pol.equalsIgnoreCase("zenski")) {
			ime = "Mrs. ".concat(ime);
		}
		return this.ime;
	}

	public String getStatus() {
		if (status) {
			if (pol.equalsIgnoreCase("muski")) {
				bracnoStanje = "ozenjen";

			} else if (pol.equalsIgnoreCase("zenski")) {
				bracnoStanje = "udata";
			}
			return bracnoStanje;

		} else {
			if (pol.equalsIgnoreCase("zenski")) {
				bracnoStanje = " nije udata";

			} else if (pol.equalsIgnoreCase("muski")) {
				bracnoStanje = "nije ozenjen";

			}
			return bracnoStanje;
		}
	}

	public void setBrojSnimljenihFilmova(int brojSnimljenihFilmova) {
		this.brojSnimljenihFilmova = brojSnimljenihFilmova;
	}

	public int getBrojSnimljenihFilmova() {
		return this.brojSnimljenihFilmova;
	}

	public void setProsecnaZaradaPoFilmu(long prosecnaZaradaPoFilmu) {
		this.prosecnaZaradaPoFilmu = prosecnaZaradaPoFilmu;
	}

	public long getProsecnaZaradaPoFilmu() {
		return this.prosecnaZaradaPoFilmu;
	}

	public void setUkupnaZarada(long ukupnaZarada) {
		this.ukupnaZarada = ukupnaZarada;
	}

	public long getUkupnaZarada() {
		ukupnaZarada = brojSnimljenihFilmova * prosecnaZaradaPoFilmu;
		return this.ukupnaZarada;
	}

	public void setBrojGodina(int brojGodina) {
		this.brojGodina = brojGodina;
	}

	public int getBrojGodina() {
		brojGodina = 2022 - godinaRodjenja;
		return this.brojGodina;
	}

	public void stampanje() {
		System.out.println(" " + getPol() + " " + prezime + ", " + pol + " pol, rodjen/a " + godinaRodjenja
				+ ".godine.\n Bracno stanje " + getStatus() + ". 2022. godine napunice " + getBrojGodina()
				+ " godina.\n " + "Ukupna zarada u svim filmovima " + "je: " + getUkupnaZarada() + " $");

	}

	public void setNaslovFilma(String naslovFilma) {
		this.naslovFilma = naslovFilma;
	}

	public String getNaslovFilma() {
		return this.naslovFilma;
	}

	public void setOcenaFilma(double ocenaFilma) {
		this.ocenaFilma = ocenaFilma;
	}

	public double getOcenaFilma() {
		return this.ocenaFilma;
	}

	public void filmStampanje() {
		System.out.println(" Naslov filma : " + getNaslovFilma() + " sa ocenom " + getOcenaFilma());
	}

}
