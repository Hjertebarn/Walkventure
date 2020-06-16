package de.bender.walkventure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PedometerTest {
	
	Pedometer testObject;
	
	@Before
	public void setUp() throws Exception {
		testObject = new Pedometer(); // Das Testobjekt
	}


	@Test
	public void testGetSteps() {
		assertEquals(10235, testObject.getSteps());
	}
	
	@Test(expected = Exception.class)
	public void testCalcCaloriesNegativ() {
		testObject.calcCalories(-235);
	}
	
	@Test
	public void testGetGoal() {
		assertEquals(10000, testObject.getGoal());
	}

	@Test
	public void testCalcCalories() {
		assertEquals(307, testObject.calcCalories(10235));
		assertEquals(0, testObject.calcCalories(0)); 
	}
	
	@Test
	public void testZielErreicht() {
		assertEquals(true, testObject.zielErreicht(10000, 10000));
		assertEquals(true, testObject.zielErreicht(10001, 10000));
		assertEquals(false, testObject.zielErreicht(0, 10000));
		assertEquals(false, testObject.zielErreicht(1, 10000));
	}
	


}
