package de.schlaukopf.organisation;

/**
 * Demonstriert, wie eine Methode in einmem funktionalen Interface mit 2 Parametern 
 * im Lambda-Ausdruck verwendet wird
 * 
 * Klassen/Lambdas die Interface implementieren verküpfen zwei double-Zahlen miteinnder
 * zB ein Addierer: addiert die beiden Zahlen
 * ein Multipizierer multipliziert die beiden Zahlen...
 * @author Alfa
 *
 */

@FunctionalInterface
public interface Rechner {

	/**
	 * Verknüpft zwei Zahlenwerte
	 * @param d1 erste Zahl
	 * @param d2 zweite Zahl
	 * @return zb Summe, Produkt, ...
	 */
	double berechnen(double d1, double d2);
}
