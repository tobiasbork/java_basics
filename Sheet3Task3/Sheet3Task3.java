
public class Sheet3Task3 {
	public static void main(String[] args) {
		Stereoanlage s = new Stereoanlage();
		Playable pl = new CD();
		s.play(pl);		//Stelle 1
		pl = new Kassette();
		s.play(pl);		//Stelle 2
	}
	
	/*
	 * Ausgabe an Stelle 1: "O Tannenbaum..."
	 * Ausgabe an Stelle 2: "Alle meine Entchen..."
	 * 
	 * Erklärung: 
	 * An Stelle 1 ist pl ein Objekt der Klasse CD.
	 * An Stelle 2 wird pl ersetzt durch ein Objekt der Klasse Kassette.
	 * Nachrichten werden in Java dynamisch gebunden, d.h. die Bestimmung des auszuführenden Codes 
	 * geschieht erst zur Laufzeit in Abhängigkeit vom Empfänger-Objekt.
	 * Es wird also jeweils die Methode des Empfänger-Objektes ausgeführt.
	 * Dementsprechend ergeben sich beim Aufruf an Stelle 1 und Stelle 2 zwei verschiedene Ausgaben.
	 * 
	 */
}
