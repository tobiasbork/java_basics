public class task3  {
    
    static boolean trick1() {
        System.out.println("b is false");
        return false;
    }
    
    static boolean trick2() {
        System.out.println("b is true");
        return true;
    }
    
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
        System.out.println(++k); // Ausgabe a)
        System.out.println(k); // Ausgabe b)
        System.out.println(k++); // Ausgabe c)
        
        int k2 = 5;
        double result = k2 * 1.0 / 2; // Stelle 1
        System.out.println("5 / 2 = " + result); // Ausgabe d)
        
        boolean b = false;
        if(b = false) {
            System.out.println("b ist falsch."); // Ausgabe e)
        } else {
            System.out.println("b ist wahr."); // Ausgabe f)
        }
        
        b = (b == false) ? trick1() : trick2();
        
        
    }
}

/*
 ----
 Aufgabe 3
 
 a) Ausgabe a, b, c ist gleich, da Ausgabe a) ein Preinkrement enthält (k wird vor der Aufgabe um den Wert 1 erhöht), Aufgabe b) verändert nichts am Wert k und Ausgabe c) enthält ein Postinkrement (k wird also zuerst ausgegeben und dann um den Wert 1 erhöht).
 
 b) Man muss den Zähler typecasten (z.B. „((double) k2) / 2“ oder „k2 * 1.0 / 2“,…)
 
 c) In der if- Bedingung wird b nicht mit false verglichen, sondern auf false gesetzt, somit evaluiert die Bedingung zu false und der else -Teil wird ausgeführt
 
 -----
 */

