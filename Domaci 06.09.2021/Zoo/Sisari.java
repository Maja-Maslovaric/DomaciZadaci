package Zoo;

public class Sisari extends Zivotinje {
	private String bojaDlake;
	private String nacinIshrane;
	private String covekovaPodela;

	public Sisari(String vrsta, String naziv, String hrana, String bojaDlake, String nacinIshrane,
			String covekovaPodela) {
		super(vrsta, naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.covekovaPodela = covekovaPodela;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public String getCovekovaPodela() {
		return covekovaPodela;
	}

	public void setCovekovaPodela(String covekovaPodela) {
		this.covekovaPodela = covekovaPodela;
	}

	public void stampanje() {
		System.out.println(super.getNaziv() + " je Sisar, " + super.getVrsta() + ", koji jede " + super.getHrana()
				+ ". Ima dlake " + this.bojaDlake + " boje. \nPrema nacinu ishrane je " + this.nacinIshrane
				+ " i covek smatra da je " + this.covekovaPodela + " zivotinja.");
	}

	public String toString() {
		return getNaziv();

	}
}