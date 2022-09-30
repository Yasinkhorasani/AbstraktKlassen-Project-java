package de.schlaukopf.organisation;

/**
 * Ein Naturphilosoph ist ein Philosoph
 * und damit auch ein schlauer Kopf
 * 
 * Im Forum werden Obbjekte vom Typ Naturphilosoph gebraucht
 * dehalb darf diese Klasse nicht abstrakt sein
 * Referenzen:
 * - NaturPhilosoph: reden, rauchen, beobachten, getJahreInEinsamkeit, schlafen, trinken, denken, getClass, equals, hashCode. toString
 * - Philosoph:  reden, rauchen, schlafen, trinken, denken, getClass, equals, hashCode. toString
 * - Schlaukopf: reden, denken,  getClass, equals, hashCode. toString
 * - Object:  getClass, equals, hashCode. toString
 * @author Yasin
 *
 */

public class NaturPhilosoph extends Philosoph{
	
	public NaturPhilosoph() {
		//super();
		jahreInEinsamkeit = jahreInEinsamkeit + 1;
	}
	

	/**
	 * Beschrieben im Interface Schlaukopf
	 * Nicht implementiert in der Klasse Philosoph
	 * MUSS hier implementiert werden
	 */
	@Override
	public String reden() {
		String wissen = "In den " + jahreInEinsamkeit + " Jahren der Einsamkeit habe ich beobachten: "
				+ "Der Apfel fällt immer nach unten, autsch";
		return wissen;
	}

	/**
	 * Abstrakte Methode aus Philosoph
	 * Muss hier konkretisiert werden
	 */
	@Override
	public void rauchen() {
		System.out.println("Bei mir rauch ein Feuer, hust");
	}
	
	/**
	 * Nur in Naturphilosoph
	 */
	public void beobachten() {
		System.out.println("Es ist wieder Herbst, wohin fallen die Äpfel?");
		jahreInEinsamkeit = jahreInEinsamkeit + 1;
	}

	/**
	 * Möglicherweise auch in Philoph?
	 * @return
	 */
	public int getJahreInEinsamkeit() {
		return jahreInEinsamkeit;
	}
}
