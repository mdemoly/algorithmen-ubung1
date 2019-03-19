package aufgaben;

import java.io.*;

public class Aufgabe2 {

	public static void main(String[] args) throws FileNotFoundException {		
		System.setOut(new PrintStream(new FileOutputStream("Aufgabe2.txt")));
		
		for(int a = 1; a <= 1000; a++) {
			int[] result = sieve_of_eratosthenes(a);
			System.out.println("Ausgabe für sieve_of_eratosthenes(" + a + "):\n" + "Zahlen: ");
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
	
	public static int[] sieve_of_eratosthenes(int n) {
		
		boolean[] g = new boolean[n];
		
		for (int i = 0; i < g.length; i++) {
			g[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (g[i] == true) {				
				for (int j = i * i; j < n; j = j + i) {
					g[j] = false;
				}
			}
		}
		
		//Fixing length of return array.
		int k = 0;
		for (int i = 2; i < g.length; i++) {
			if (g[i] == true) {
				k++;
			}
		}
		int [] a = new int[k];
		int j = 0;
		for (int i = 2; i < g.length; i++) {		
			if (g[i] == true) {
				a[j] = i;
				j++;
			}
		}
		return a;
	}
	

}

