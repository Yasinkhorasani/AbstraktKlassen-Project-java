package tests;

import de.schlaukopf.organisation.NaturPhilosoph;
import de.schlaukopf.organisation.Philosoph;
import de.schlaukopf.organisation.Schlaukopf;

/**
 * testet die Klasse Naturphilosoph
 * Demonstiert den Umgang mit abstrakten Klassen
 * @author Yasin
 *
 */
public class PhilosophenTest {
	/**Vererbung von Philosoph: Anonyme Klasse, die die Klasse Philsoph erweitert
	//class ... extends Philosoph{     }*/
	private static Philosoph lee = new Philosoph() {
		
		@Override
		public String reden() {
			return "Der Ball ist rund";
		}
		
		@Override
		public void rauchen() {
			System.out.println("Sportler rauchen nicht");
		}
	};;

	public static void main(String[] args) {
		NaturPhilosoph karl = new NaturPhilosoph();
		karl.denken();
		karl.rauchen();
		karl.beobachten();
		System.out.println(karl.reden());
		
		Schlaukopf lissy = new NaturPhilosoph();
		lissy.denken();
		System.out.println(lissy.reden());
		
		

		lee.schlafen();
	}

	private static void helfen() {
//		karl.
		lee.denken();
	}
}
