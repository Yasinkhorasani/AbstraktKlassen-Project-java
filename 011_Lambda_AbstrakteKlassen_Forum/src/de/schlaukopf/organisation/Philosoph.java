package de.schlaukopf.organisation;

import java.util.Random;

/**
 * Elternklasse für alle Arten von Philosophen, hier: NaturPhilosoph
 * 
 * Hier soll noch nicht fest gelegt werden, was ein NaturPhilosoph zu sagen hat
 * 
 * Ein Philosoph ist ein schlauer Kopf
 * 
 * Eine abstrakte Klasse darf ABSTRAKTE Methoden enhalten: Methoden ohne Körper
 * Eine abstrakte Klasse darf konkrete Methoden enzhalten.
 * 
 * Philosoph kann nicht instanziiert werden (abstrakte Klassen können nicht instanziiert werden)
 * 
 * @author Yasin
 *
 */
public abstract class Philosoph implements Schlaukopf{
	
	protected int jahreInEinsamkeit;
	
	/**
	 * Würfelt die Jahre in Einsamkeit aus
	 */
	public Philosoph() {
		Random wuerfel = new Random();
		jahreInEinsamkeit = wuerfel.nextInt(25);
	}

	/**
	 * Methode kann überschrieben werden, muss sie aber nicht
	 */
	public void trinken() {
		System.out.println("Am liebsten und trinke ich Wein");
	}
	
	/**
	 * Methode MUSS übererschrieben werden, wenn die erbende Klasse instanziiert werden soll
	 * oder die erbende Klasse ist selber wieder abstrakt
	 * Eine abstrakte Methode in einer Klasse braucht das Schlüsselwort abstract
	 */
	public abstract void rauchen();
	
	/**
	 * Kein Philosoph kann gut schlafen!
	 * Deshalb ist diese Methode final: 
	 * Ein abstrakte Klasse darf final Methoden enthalter
	 */
	public final void schlafen() {
		String wissen = reden();
		System.out.println("Ich schlafe schon seit " + jahreInEinsamkeit + " Jahren nicht gut, "
				+ "denn ich weiss: " + wissen);
	}
}





