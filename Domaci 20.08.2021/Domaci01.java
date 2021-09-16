package domaci;

public class Domaci01 {

	public static void main(String[] args) {

		// -Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve
		// osim prvog i poslednjeg unosa.

		String[] grad = { "Grad_1", "Grad_2", "Grad_3", "Grad_4", "Grad_5" }; // napravimo niz sa 5 gradova

		for (int i = 1; i < (grad.length - 1); i++) { // postavimo brojac da ne krece od prvog clana, tj. nultog indeksa
														// i da ide do pretposlednjeg
			System.out.println(grad[i]); // stampamo gradove
		}

	}

}
