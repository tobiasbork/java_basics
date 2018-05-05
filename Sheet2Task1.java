package tasks;

import java.util.Scanner;

public class Sheet2Task1 {

	private static long fakultaet(long n){
		if (n == 1 || n == 0) return 1;
		else return n * fakultaet(n-1);
	}

	private static long binom(long n, long k){
		if(k <= n && 0 <= k) return fakultaet(n)/(fakultaet(k) * fakultaet(n-k));
		else return 0;
	}

	private static long lotto(long n, long k){
		if(k <= n && 0 <= k) return fakultaet(n)/fakultaet(n-k);
		else return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eingabe:");
		long input = Long.parseLong(scanner.nextLine());
		System.out.println(input + "! = " + (input >= 0 ? fakultaet(input) : "nicht definiert"));
	}
}

/* Fehler entstehen durch einen Ueberlauf des Zahlenbereichs, da die Fakulaetsfunktion
 * ein sehr schnelles Wachstum hat. */
