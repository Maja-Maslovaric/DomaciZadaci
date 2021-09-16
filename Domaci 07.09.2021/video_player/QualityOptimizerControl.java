/*
 * Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
 * ima brzinu interneta u megabitima
 npr 10mb/s 20mb/s... Getere, setere i konstruktore. 
 Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
 ako je brzina 20 * 10.1 = 204 - postavlja 240;
 ako je brzina 5*10.1 = 50.5 - postavlja 144;
 ako je brzina 20*10.1 = 505 - postavlja 720;
 */

package video_player;

public class QualityOptimizerControl extends Control {
	private int brzinaInterneta;
	public int kvalitet;

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {

		int kvalitet = (int) (getBrzinaInterneta() * 10.1);
		int noviKvalitet;

		if (kvalitet < 144) {
			noviKvalitet = 144;
			vp.setKvalitetVidea(noviKvalitet);
		} else if (kvalitet < 240) {
			noviKvalitet = 240;
			vp.setKvalitetVidea(noviKvalitet);
		} else if (kvalitet < 360) {
			noviKvalitet = 360;
			vp.setKvalitetVidea(noviKvalitet);
		} else if (kvalitet < 480) {
			noviKvalitet = 480;
			vp.setKvalitetVidea(noviKvalitet);
		} else if (kvalitet < 720) {
			noviKvalitet = 720;
			vp.setKvalitetVidea(noviKvalitet);
		} else if (kvalitet < 1080) {
			noviKvalitet = 1080;
			vp.setKvalitetVidea(noviKvalitet);
		} else {
			vp.setKvalitetVidea(0);
			System.out.println("Nepostojeci kvalitet!");
		}

	}
}
