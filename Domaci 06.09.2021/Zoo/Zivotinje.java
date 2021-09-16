/*
 * Zooloski vrt
U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu (kicmenjaci, beskicmenjaci),
 konkretan naziv i cime se hrane.
Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda),
 broj peraja, vrsta peraja
Sisari su kicmenjaci koje se razlikuju po boji dlake,
 nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.
Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive.
 Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti ulogu koju mu je covek dodelio.
 */

package Zoo;

public class Zivotinje {

	private String vrsta;
	private String naziv;
	private String hrana;

	public Zivotinje(String vrsta, String naziv, String hrana) {
		super();
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.hrana = hrana;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getHrana() {
		return hrana;
	}

	public void setHrana(String hrana) {
		this.hrana = hrana;
	}

	public void stampanje() {
		System.out.println(this.vrsta + this.naziv + " se hrane " + this.hrana);
	}

}
