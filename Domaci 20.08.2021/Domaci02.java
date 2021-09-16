package domaci;

public class Domaci02 {

	public static void main(String[] args) {
		/*
		 * -Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London,
		 * Helsinki, Prag i Madrid) a program stampa gradove sve dok ne dodje do
		 * "Prag"-a
		 */

		String[] grad = { "Lisabon", "London", "Helsinki", "Prag", "Madrid" }; // napravimo niz sa ovih 5 gradova
		int i = 0; // postavimo brojac da krene od prvog clana u nizu, indeksi krecu od nule
		while (!(grad[i].equals("Prag"))) { // i dok je grad razlicit od "Prag"-a
			System.out.println(grad[i]); // stampamo gradove
			i++; // uvecavamo brojac da bismo se kretali kroz niz
		}

	}

}
