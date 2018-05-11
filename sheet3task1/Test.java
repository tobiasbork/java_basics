package sheet3task1;

/* Die Funktionen sind nur der Übersichtlichkeit halber in der Datei
public class C1 {
	static int s=1;
	void f1(){
		System.out.println("C1::f1");
	}
	void f2(){
		System.out.println("C1::f2");
	}
}

public class C2 extends C1 {
	static int s=2;
	void f1(){
		System.out.println("C2::f1");
	}
	void f3(){
		System.out.println("C2::f3");
	}
}
*/

public class Test {
	public static void main (String[] args) {
		C1 a=new C2();
		C2 b=new C2();
		// Stelle der Ausgaben
	}
}

/* Ausgaben: 
 * 1. ((C2) a).f1();					C2::f1 	,da a ursprünglich mal ein Element vom Typ C2 war und nur als Element vom Typ C1 deklariert war 
 * 2. ((C1) b).f1();					C2::f1 	,da b nur als Element vom Typ C1 deklariert wurde, aber sich hinter b.f1() immernoch die Funktion aus C2 verbirgt
 * 3. System.out.println(a.s);			1 		,da a als ein Element vom Typ C1 deklariert ist und s eine static Variable ist
 * 4. b.f1();							C2::f1	,da b ein Element vom Typ C2 ist und deshalb die überschrieben Funktion f1() verwendet
 * 5. b.f2();							C1::f2	,da b ein element vom Typ C2 ist und die Klasse die Klasse C2, die Funktion f2() von der Klasse C1 übernommen hat
 * 6. b.f3();							C2::f3	,da b ein Element vom Typ C2 ist.
 * 7. C1 c = new C1(); c.f3();			"Kompiliert nicht, da 'The method f3() is undefined for the type C1 '"
 * 												,da c als ein Element vom Typ C1 keine Funktion f3() besitzt.
 * 8. C1 c = new C1(); ((C2) c).f1();	"Fehlermeldung beim Ausführen: 'sheet3task1.C1 cannot be cast to sheet3task1.C2'"
 * 												,da Elemente vom Typ C1 nicht in den Subtyp C2 gecastet werden können.
 */

