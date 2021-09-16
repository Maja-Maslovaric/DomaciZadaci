
/*
 * Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore.
 Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean).
  Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
   U opsegu od 0 do 100.
 */

package video_player;

public class AudioControl extends Control {

	private boolean pojacaj;

	public AudioControl(boolean pojacaj) {
		super();
		this.pojacaj = pojacaj;
	}

	public boolean isPojacaj() {
		return pojacaj;
	}

	public void setPojacaj(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {

		if (pojacaj == true) {
			if (vp.getJacinaZvuka() < 100) {
				vp.setJacinaZvuka(vp.getJacinaZvuka() + 1);
			} else {
				vp.setJacinaZvuka(100);
			}
		} else {
			if (vp.getJacinaZvuka() > 0) {
				vp.setJacinaZvuka(vp.getJacinaZvuka() - 1);
			} else {
				vp.setJacinaZvuka(0);
			}
		}
	}
}
