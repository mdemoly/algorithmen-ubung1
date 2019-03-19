package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aufgaben.Aufgabe2;

class SieveOfErasthotenesTest {

	@Test
	void sieveOfEratosthenes_shouldBeCorrect_case1() {
		int n = 3;
		int[] result = Aufgabe2.sieve_of_eratosthenes(n);
		assertArrayEquals(new int[] {2}, result);
	}
	
	@Test
	void sieveOfEratosthenes_shouldBeCorrect_case2() {
		int n = 8;
		int[] result = Aufgabe2.sieve_of_eratosthenes(n);
		assertArrayEquals(new int[] {2, 3, 5, 7}, result);
	}
	
	@Test
	void sieveOfEratosthenes_shouldBeCorrect_case3() {
		int n = 15;
		int[] result = Aufgabe2.sieve_of_eratosthenes(n);
		assertArrayEquals(new int[] {2, 3, 5, 7, 11, 13}, result);
	}

}
