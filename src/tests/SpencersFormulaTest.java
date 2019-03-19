package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aufgaben.Aufgabe4;

class SpencersFormulaTest {

	@Test
	void spencersFormula_year2019_shouldBeCorrect() {
		int[] result = Aufgabe4.spencers_formula(2019);
		int day = result[0];
		int month = result[1];
		
		assertEquals(21, day);
		assertEquals(4, month);
	}
	
	@Test
	void spencersFormula_year2018_shouldBeCorrect() {
		int[] result = Aufgabe4.spencers_formula(2018);
		int day = result[0];
		int month = result[1];
		
		assertEquals(1, day);
		assertEquals(4, month);
	}

}
