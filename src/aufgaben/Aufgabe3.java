package aufgaben;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Aufgabe3 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream("Aufgabe3.txt")));
		
		for(int a = 1; a <= 10000; a++) {
			int[] result = prime_factors(a);
			System.out.println("Ausgabe für prime_factors(" + a + "):\n" + "Zahlen: ");
			System.out.print("[");
			
			for(int i = 0; i < result.length; i++) {
				if(i > 0) {
					System.out.print(", ");
				}
				System.out.print(result[i]);
			}
			System.out.println("]");
		}
	}

	public static int[] prime_factors(int n) {
		
		int[] a = new int[n];
		int j = 0;
		
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				a[j] = i;
				j++;
				n /= i;
			}
		}
		
		//Fixing length of return array.
		int l = 0;
		for (int k = 0; k < a.length; k++) {
			if (a[k] != 0) {
				l++;
			}
		}
		int[] m = new int[l];
		for (int o = 0; o < m.length; o++) {
			m[o] = a[o];
		}
		return m;
	}
}