package aufgaben;

import java.io.*;

public class Aufgabe1 {

	public static void main(String[] args) throws FileNotFoundException {

		System.setOut(new PrintStream(new FileOutputStream("Aufgabe1.txt")));
		
		for(int a = 1; a <= 100; a++) {
			for(int b = 1; b <= 100; b++) {
				int gcd = euclidean(a, b);
				System.out.println("Ausgabe für Aufgabe 1:\n" + "Zahlen: " + a + " & " + b + "\n" + gcd);
			}
		}
	}
	
	
	public static int euclidean(int a, int b) {
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException("Only positive numbers are allowed!");
		}
		
		if (a == 0) {
			return b;
		} else {
			while (b != 0) {
				if (a > b) {
					a = a-b;	
				} else {
					b = b-a;
				}
			}
		}
		return a;
	}
/*	
	Uberprufe zwei naturliche Zahlen.
	Solange die Zahl b nicht null subtrahiere immer die kleiner von der grosseren Zahl.
	Die Zahl die ubsrig bleibt ist der ggT.
*/	
}

