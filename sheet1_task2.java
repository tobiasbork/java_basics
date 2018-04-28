import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		// -------------------- a) --------------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie heiﬂen Sie?");
		String input = scanner.nextLine();
		System.out.println("Hallo " + input + "!");
		
		// -------------------- b) --------------------------------
		System.out.println("Bitte zwei Zahlen eingeben:");
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		System.out.println("Die Summe ist "+ (i+j));
		
		scanner.close();
	}

}