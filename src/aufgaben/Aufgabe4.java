package aufgaben;

import java.io.*;

public class Aufgabe4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setOut(new PrintStream(new FileOutputStream("Aufgabe4.txt")));
		
		int[] y = new int[101];
		
		for (int i = 0; i < 101; i++) {
			y[i] = (2000 + i);					
		}
		
		int[] a = new int [2];
		a = spencers_min_max(y);
		
		String strE = a[0] + ". March";
		String strL = (a[1]) + ". April";
		
		System.out.println("Ausgabe für Aufgabe 4:\nEarliest: " + strE + "\n" + "Latest: " + strL);
	}
	
	public static int[] spencers_formula(int y) {
		
		int[] ar = new int[2];
		
		int a = y % 19;
	    int b = y / 100;
	    int c = y % 100;
	    int d = b / 4;
	    int e = b % 4;
	    int g = (8 * b + 13) / 25;
	    int h = (19 * a + b - d - g + 15) % 30;
	    int j = c / 4;
	    int k = c % 4;
	    int m = (a + 11 * h) / 319;
	    int r = (2 * e + 2 * j - k - h + m + 32) % 7;
	    int n = (h - m + r + 90) / 25;
	    int p = (h - m + r + n + 19) % 32;
	    
	    ar[0] = p;
	    ar[1] = n;
	    
	    return ar;
	}
	
	public static int[] spencers_min_max(int[] y) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] a = new int[2];
		
		for (int i = 0; i < y.length; i++) {	
			int[] result = spencers_formula(y[i]);
			System.out.println("Year " + y[i] + " - " + result[0] + "." + result[1]);
			if (result[1] == 3) {
				if (result[0] < min) {
					min = result[0];
				}
			} else if (result[1] == 4) {
				if (result[0] > max) {
					max = result[0];
				}
			}
		}
		a[0] = min;
		a[1] = max;
		return a;
	}
}