
public class Sheet3Task2 {
	public static void main(String[] args) {
		
			//Aufgabenteil a)
			 
			Fur MollyFur = new Fur(10);
			Sheep Molly = new Sheep("Molly", MollyFur);
			
			System.out.println(Molly.toString());		//Name: Molly Felllaenge: 10
			Sheep MollyClone = Molly.clone();
			System.out.println(MollyClone.toString());	//Name: Molly Felllaenge: 10
			
			
			System.out.println("Schere MollyClone, welches mit clone() erzeugt wurde:");
			MollyClone.shear();
			System.out.println(Molly.toString());		//Name: Molly Felllaenge: 0
			System.out.println(MollyClone.toString());	//Name: Molly Felllaenge: 0
			
			/* 
			 * Erklärung:
			 * Die Funktion clone() erzeugt kein neues Objekt der Klasse Sheep,
			 * sondern weist lediglich der Variable MollyClone dasselbe Objekt Molly zu.
			 * Ändert man die Felllaenge von MollyClone wird automatisch die Felllaenge
			 * von Molly mitgeändert, da es sich um dasselbe Objekt handelt.
			 */
			
			
			//Aufgabenteil b)
			
			MollyFur.setFurLength(10);
			System.out.println("Schere MollyClone, welches mit shallowClone() erzeugt wurde:");
			Sheep MollyShallowClone = Molly.shallowClone();
			MollyShallowClone.shear();
			System.out.println(Molly.toString());				//Name: Molly Felllaenge: 0
			System.out.println(MollyShallowClone.toString());	//Name: Molly Felllaenge: 0
			
			MollyFur.setFurLength(10);
			System.out.println("Schere MollyClone, welches mit deepClone() erzeugt wurde:");
			Sheep MollyDeepClone = Molly.deepClone();
			MollyDeepClone.shear();
			System.out.println(Molly.toString());				//Name: Molly Felllaenge: 10
			System.out.println(MollyDeepClone.toString());		//Name: Molly Felllaenge: 0
			
			/*
			 * Erklärung:
			 * Die Methode shallowClone() kopiert zwar primitive Felder des Objektes (z.B. Name),
			 * aber Objekte innerhalb des zu klonenden Objekts nicht (z.B. Fur). 
			 * Vielmehr zeigen die Verweise in dem neuen Objekt auf die Objekte, 
			 * die auch schon von dem ursprünglichen Objekt referenziert wurden. 
			 * Die Methode deepCopy() kopiert sowohl primitive Felder
			 * als auch die Objekte innerhalb des zu klonenden Objekts, 
			 * so dass ein komplett unabhängiges Objekt mit demselben internen Zustand entsteht. 
			 * Da Fur eine Unterklasse der Klasse Sheep ist, wird bei shallowClone() auf dasselbe
			 * Objekt MollyFur verwiesen, so dass sich die Felllaenge bei beiden Schafen ändert.
			 * DeepClone() erzeugt auch für die Unterklasse Fur ein neues Objekt, so dass
			 * sich die Felllaenge nur beim geklonten Schaf ändert.
			 */
			
			//Aufgabenteil c)
			
			/*
			 * siehe Implementierung in Sheep.java
			 */
			
			//Aufgabenteil d)
			
			/*
			 * Erklärung:
			 * Bei Objekten wird in Java bei einer Zuweisung lediglich eine Referenzierung auf den Speicherbereich,
			 * in dem das Objekt liegt, zurückgegeben. 
			 * Das interface Cloneable verfügt über eine Funktion clone(), die  ähnlich zu deepClone()
			 * eine exakte Kopie des Objektes erstellt. Dies wird wird erreicht durch Anlegen eines neuen Objekts
			 * auf einem neuen Speicherbereich, welches denselben internen Zustand besitzt.
			 * Die Methode hat folgende Signatur: public Object clone() throws CloneNotSupportedException.
			 * Wenn x das Objekt bezeichne, dann sollte also x.clone() != x sein, aber x.clone().equals(x) true liefern.
			 */
		}
}
