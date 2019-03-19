package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aufgaben.Aufgabe1;

class EuclideanTest {

	@Test
	void testEvenNumbers_shouldBeCorrect() {
		int a = 10;
		int b = 4;
		assertEquals(2, Aufgabe1.euclidean(a, b));
	}
	
	@Test
	void testPrimeNumbers_shouldBeCorrect() {
		int a = 11;
		int b = 7;
		assertEquals(1, Aufgabe1.euclidean(a, b));
	}
	
	@Test
	void testPrimeNonPrime_shouldBeCorrect() {
		int a = 20;
		int b = 7;
		assertEquals(1, Aufgabe1.euclidean(a, b));
	}
	
	@Test
	void testBigNumbers_shouldBeCorrect() {
		int a = 500000000;
		int b = 2;
		assertEquals(2, Aufgabe1.euclidean(a, b));
	}
	
	@Test
	void testNegative_shouldThrowInvalidArgumentException() {
		int a = 20;
		int b = -2;
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
			() -> Aufgabe1.euclidean(a, b),
			"");
	}

}
