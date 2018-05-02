package tasks;

import java.util.ArrayList;

public class Sheet2Task4 {

    public static class Schiff {

        private String name;
        private String kennzeichen;
        private double laenge;

        public Schiff(String name, double laenge) {
            this.name = name;
            this.laenge = laenge;
        }

        public void setKennzeichen(String schiffsKennzeichen) {
            kennzeichen = schiffsKennzeichen;
        }

        public void empfangeNachricht(String msg) {
            System.out.println("WARNMELDUNG: " + msg
                                + " Schiffsname: " + name
                                + " Kennzeichen: " + kennzeichen);
        }
    }

    public static class Schifffahrtsamt {
        // Verwende ArrayList um beliebig viele Schiffe zu verwalten.
        private ArrayList<Schiff> schiffe = new ArrayList<>();

        public void neuesSchiff(Schiff schiff){
            schiffe.add(schiff);
        }

        public void meldung(String nachricht, int dringlichkeit){
            if(dringlichkeit == 1){
                for(Schiff schiff: schiffe) schiff.empfangeNachricht(nachricht);
            } else System.out.println("Eine Meldung wird an alle Schiffe geschickt, wenn die Dringlichkeit 1 ist.");
        }

        public static String getKennzeichen() {
            java.util.Random rnd = new java.util.Random();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 6; i++) {
                sb.append((char)((rnd.nextInt(25)+65)));
            }
            return sb.toString();
        }

        public void regestriereSchiff(Schiff schiff){
            schiff.setKennzeichen(Schifffahrtsamt.getKennzeichen());
        }
    }

    public static class Werft {

        public void produziereSchiff(String name, double laenge, Schifffahrtsamt schifffahrtsamt){
            Schiff neuesschiff = new Schiff(name, laenge);
            schifffahrtsamt.schiffe.add(neuesschiff);
            // Die Funktion getKennzeichen wird mit "Schifffahrtsamt" anstatt mit "schifffahrtsamt" aufgerufen,
            // da sie static ist und sich somit auf die Klasse nicht auf Objekte der Klasse bezieht.
            neuesschiff.setKennzeichen(Schifffahrtsamt.getKennzeichen());
        }
    }

    public static void main(String[] args) {
        Schifffahrtsamt amt=new Schifffahrtsamt();
        Werft w1=new Werft();
        w1.produziereSchiff("Gertrut", 12.5, amt);
        Schiff sc1=new Schiff("Merlin", 45.9);
        amt.regestriereSchiff(sc1);
        sc1.setKennzeichen(Schifffahrtsamt.getKennzeichen());
        amt.meldung("Havarie im Rhein bei Rheinkilometer 591.", 1);
        //Ausgabe Empfangen von Gertrut/IHVMXW:  Havarie im Rhein bei Rheinkilometer 591.
        //Empfangen von Merlin/VPBJQW:  Havarie im Rhein bei Rheinkilometer 591.
        amt.meldung("Sonnenschein bei Rheinkilometer 650", 0);
    }
}
