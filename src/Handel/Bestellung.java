package Handel;

/**
 *  Bestellung
 * in der Instanz soll der Kunde erstellt werden und anschließend
 *
 */

public class Bestellung {
    private int bnr,
            knr,
            anr,
            anzahl;
    private double gesamtpreis;
    private Kunde k;
    private static final int MWST = 19;

    /**
     * Konstruktor mit 2 parametern
     * @param anzahl der Artikel
     * @param nname name der Bestellung
     */
    public Bestellung(String nname, int anzahl) {
        this.anzahl = anzahl;
        k = new Privatkunde(nname);
        System.out.println("konstruktor Bestellung");
    }

    public Bestellung(int knr) {
        this.knr = knr;
               if (knr <= 500) {
            k = new Privatkunde(knr);

        } else {
            k = new Firmenkunde(knr);
        }

    }

    /**
     * Konstruktor mit 4 Parametern
     * @param kn Kundennummer
     * @param nname Name der Bestellung
     * @param an Artikelnummer
     * @param id die Kundenid
     */

    public Bestellung(int kn, String nname, int an, int id) {
        anzahl = an;
        if (kn <= 500) {
            k = new Privatkunde(nname, id);
        } else {
            k = new Firmenkunde(nname, id);
        }
    }

    public void getVar() {
        System.out.println(anzahl);
    }

    public Kunde getKunde() {
        return k;
    }

    public static void oma(){
        System.out.println("ich bin Berta.");
    }

    /**
     * Wird Aufgerufen bevor die Instanz zerstört wird aber nur wen der GB drüber gelaufen ist
     */

    @Override
    protected void finalize() {
        System.out.println("destruktor");

    }
}
