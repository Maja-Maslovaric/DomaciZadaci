/*
 * U glavnom programu kreirati video player i izvrsiti neke akcije nad njim
 U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom
 */
package video_player;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {

		VideoPlayer vp1 = new VideoPlayer(250, 205, 46, 144);
		vp1.stampanje();

		System.out.println();

		AudioControl ac = new AudioControl(true);
		ac.izvrsiAkciju(vp1);
		vp1.stampanje();

		System.out.println();

		TimeControl tc = new TimeControl(true);
		tc.izvrsiAkciju(vp1);
		vp1.stampanje();

		System.out.println();

		QualityOptimizerControl qoc = new QualityOptimizerControl(20);
		qoc.izvrsiAkciju(vp1);
		vp1.stampanje();

		System.out.println();

		ArrayList<Control> akcije = new ArrayList();
		akcije.add(ac);
		akcije.add(tc);
		akcije.add(qoc);

		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(vp1);
		}
		vp1.stampanje();

	}

}
