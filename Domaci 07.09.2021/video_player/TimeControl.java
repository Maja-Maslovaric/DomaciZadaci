/*
 * Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore, 
ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean), 
implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred 
ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
 */

package video_player;

public class TimeControl extends Control {

	private boolean unapred;

	public TimeControl(boolean unapred) {
		super();
		this.unapred = unapred;
	}

	public boolean isUnapred() {
		return unapred;
	}

	public void setUnapred(boolean unapred) {
		this.unapred = unapred;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if (unapred = true) {
			if (vp.getTrenutnoVremeVidea() < vp.getDuzinaVidea() - 15) {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() + 15);
			} else {
				vp.setTrenutnoVremeVidea(vp.getDuzinaVidea());
			}
		} else {
			if (vp.getTrenutnoVremeVidea() > 15) {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() - 15);
			} else {
				vp.setTrenutnoVremeVidea(0);
			}
		}
	}

}
