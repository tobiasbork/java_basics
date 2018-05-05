
public class Task2 {

	
	
	public static void main(String[] args) {
		
		if (6.4f == 6.4) {
			System.out.println("6.4 ist gleich 6.4f");
		}
		else {
			System.out.println("6.4 ist nicht gleich 6.4f. Die Differenz ist " + (6.4f - 6.4));
		}
		
		if (6.5f == 6.5) {
			System.out.println("6.5 ist gleich 6.5f");
		}
		else {
			System.out.println("6.5 ist nicht gleich 6.5f. Die Differenz ist " + (6.5f - 6.5));
		}
	
	}
}


// Ausgabe: 
// 6.4 ist nicht gleich 6.4f. Die Differenz ist 9.536743128535363E-8
// 6.5 ist gleich 6.5f
//
// Begründung: 6.5 hat im Gegensatz zu 6.4 eine exakte binäre Gleitkommadarstellung. 
//		Deshalb ist 6.4 als float eine andere Zahl als 6.4 als double.