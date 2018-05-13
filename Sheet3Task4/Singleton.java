package sheet3task4;

public class Singleton {
    private static Singleton instance;

    private Singleton () {}

    public static Singleton getInstance () {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton ();
        }
        return Singleton.instance;
    }
}

/**
 *      zu teil a)
 *  Es ist ein Entwurfsmuster um sicher zu stellen, dass
 *  von einer Klasse genau ein Objekt existiert. Es wird meist verwendet,
 *  um mit globalen Variablen zu arbeiten.
 *
 *  (Singelton heißt auf deutsch Einzelstück)
 *
 */
