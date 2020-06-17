package de.bender.walkventure;

public class Pedometer {
		
	// Konstanten
	private static int SCHRITTE = 10235; // Fiktiver Wert, wird spaeter mit Daten aus Smartphone ersetzt.
	private static int GOAL = 10000; // Schrittziel, das spaeter vom Nutzer festgelegt werden kann.
	
	// Methoden
	/**
	   * Diese Methode gibt die verbrannten Kalorien in der Konsole aus.
	   */
	public void calories() {
		int steps = getSteps();
		int calories = calcCalories(steps);
		System.out.println(caloriesToString(calories));
	}
	
	/**
	   * Diese Methode gibt die gelaufnenen Schritte zurueck.
	   * @return int Schritte.
	   */
	public int getSteps() {
		int steps = SCHRITTE;
		return steps;
	}
	
	/**
	   * Diese Methode gibt das festgelegte Schrittziel zurueck.
	   * @return int Schrittziel.
	   */
	public int getGoal() {
		int goal = GOAL;
		return goal;
	}
	
	/**
	   * Diese Methode berechnet die verbannten Kalorien
	   * anhand der gelaufenen Schritte.
	   * @param steps gelaufene Schritte
	   * @return int Gibt die berechneten Kalorien zurueck.
	   */
	public int calcCalories(int steps) {
		int calories = (int) Math.round(steps * 0.03);
		if (calories < 0) {
			throw new IllegalArgumentException("Keine negativen Werte!");
		}
		return calories;
	}
	
	/**
	   * Diese Methode berechnet ob das festgelegte
	   * Schrittziel erreicht wurde.
	   * @param steps gelaufene Schritte
	   * @param goal festgelegtes Schrittziel
	   * @return boolean True, wenn Schrittziel erreicht.
	   */
	public boolean zielErreicht(int steps, int goal) {
		return steps >= goal;
	}
	
	/**
	   * Diese Methode erzeugt einen String mit den Infos,
	   * wie viele Kalorien bisher an diesem Tag verbrannt wurden.
	   * @param cal verbrannte Kalorien
	   * @return String Rueckgabe des Strings mit Kalorienangabe.
	   */
	public String caloriesToString(int cal) {
		return "Du hast heute " + cal + " verbrannt!";
	}
	
}
