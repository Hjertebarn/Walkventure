package de.bender.walkventure;

public class Pedometer {
		
	// Konstanten
	private static int SCHRITTE = 10235; // Fiktiver Wert, wird spaeter mit Daten aus Smartphone ersetzt.
	private static int GOAL = 10000; // Schrittziel, das spaeter vom Nutzer festgelegt werden kann.
	
	// Methoden
	// verbrannte Kalorien	ausgeben
	public void calories() {
		int steps = getSteps();
		int calories = calcCalories(steps);
		System.out.println(caloriesToString(calories));
	}
	
	// Schritte auslesen/zurueckgeben
	public int getSteps() {
		int steps = SCHRITTE;
		return steps;
	}
	
	// Schrittziel auslesen/zurueckgeben
	public int getGoal() {
		int goal = GOAL;
		return goal;
	}
	
	// verbrannte Kalorien anhand der Schritte berechnen
	public int calcCalories(int steps) {
		int calories = (int) Math.round(steps * 0.03);
		if (calories < 0) {
			throw new IllegalArgumentException("Keine negativen Werte!");
		}
		return calories;
	}
	
	// Schrittziel erreicht?
	public boolean zielErreicht(int steps, int goal) {
		return steps >= goal;
	}
	
	// String erzeugen
	public String caloriesToString(int cal) {
		return "Du hast heute " + cal + " verbrannt!";
	}
	
}
