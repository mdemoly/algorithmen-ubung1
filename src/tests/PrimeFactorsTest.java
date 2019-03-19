package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aufgaben.Aufgabe3;

class PrimeFactorsTest {

	@Test
	void primeFactors_shouldBeCorrect_case1() {
		int n = 15;
		int[] result = Aufgabe3.prime_factors(n);
		assertArrayEquals(new int[] {3, 5}, result);
	}
	
	@Test
	void primeFactors_shouldBeCorrect_case2() {
		int n = 45;
		int[] result = Aufgabe3.prime_factors(n);
		assertArrayEquals(new int[] {3, 3, 5}, result);
	}
	
	@Test
	void primeFactors_shouldBeCorrect_case3() {
		int n = 24;
		int[] result = Aufgabe3.prime_factors(n);
		assertArrayEquals(new int[] {2, 2, 2, 3}, result);
	}
	
	@Test
	void primeFactors_shouldBeCorrect_case4() {
		int n = 47;
		int[] result = Aufgabe3.prime_factors(n);
		assertArrayEquals(new int[] {47}, result);
	}

}
