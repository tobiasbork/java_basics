package tasks;

public class Sheet1Task4 {

	public static void main(String[] args) {
		int a=15;
		int b=34;
		int c=1;
		System.out.println("1: "+ (a==b)); 			// Ausgabe false, da 15 ungleich 34
		System.out.println("2: "+ (a==b-19));		// Ausgabe true, da 15 gleich 34-19
		System.out.println("3: "+ (a^b));			// Ausgabe 45 = 101101, da 15 = 1111 und 34 = 100010
		System.out.println("4: "+ (a++^b));			// Ausgabe 45, da genauso wie 3 denn a wird erst im nachhinein erhoeht
		System.out.println("5: "+ (7<<++c));		// Ausgabe 28 0 11100, da 7 = 111 bitweise um zwei nach links verschoben wird
		System.out.println("6: "+ (a=b=c=0x10));	// Ausgabe 16, da 10 in Hexadezimal gleich 16 ist und Wertzuweisungen den Wert zurueckgeben
		System.out.println("7: "+ (1e1));			// Ausgabe 10.0, da 10^1 = 10 und e schreibweise immer gleitkomma Datentypen erstellt.

	}

}
