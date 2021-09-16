package Zoo;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Ribe r1 = new Ribe("kicmenjak", "Saran", "vodenim biljkama", "slatkoj vodi", 1, "repno");
		r1.stampanje();
		System.out.println();

		Ribe r2 = new Ribe("kicmenjak", "Ajkula", "drugim ribama", "slanoj vodi", 2, "trbusna");
		r2.stampanje();
		System.out.println();

		Ribe r3 = new Ribe("kicmenjak", "Som", "manjim ribama", "slatkoj vodi", 2, "grudna");
		r3.stampanje();
		System.out.println();

		Sisari s1 = new Sisari("kicmenjak", "Vuk", "druge zivotinje", "sive", "mesojed", "divlja");
		s1.stampanje();
		s1.setCovekovaPodela("domaca");
		s1.stampanje();
		System.out.println();

		Sisari s2 = new Sisari("kicmenjak", "Kengur", "travu", "braon", "biljojed", "divlja");
		s2.stampanje();
		System.out.println();

		Sisari s3 = new Sisari("kicmenjak", "Medved", "ribu", "bele", "svastojed", "divlja");
		s3.stampanje();
		System.out.println();

		Sisari s4 = new Sisari("kicmenjak", "Pas", "kosti", "crne", "mesojed", "domaca");
		s4.stampanje();
		System.out.println();

		Staniste st1 = new Staniste("Vodeno staniste");
		st1.getZivotinje().add(r1);
		st1.getZivotinje().add(r2);
		st1.getZivotinje().add(r3);
		st1.stampanje();
		System.out.println();

		Staniste st2 = new Staniste("Kopneno staniste");
		st2.getZivotinje().add(s1);
		st2.getZivotinje().add(s2);
		st2.getZivotinje().add(s3);
		st2.getZivotinje().add(s4);
		st2.stampanje();
		System.out.println();

	}

}
