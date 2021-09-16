package Zoo;

import java.util.ArrayList;

public class Staniste {
	private String nazivStanista;
	private ArrayList<Zivotinje> zivotinje;

	public Staniste(String nazivStanista) {
		super();
		this.nazivStanista = nazivStanista;
		this.zivotinje = new ArrayList<Zivotinje>();
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	public ArrayList<Zivotinje> getZivotinje() {
		return zivotinje;
	}

	public void setZivotinje(ArrayList<Zivotinje> zivotinje) {
		this.zivotinje = zivotinje;
	}

	public void stampanje() {
		System.out.println(nazivStanista + ", sa zivotinjama: " + zivotinje);
	}

}
