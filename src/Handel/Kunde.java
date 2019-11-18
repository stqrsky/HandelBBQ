package Handel;

import java.util.Scanner;

/**
 * Abstract class
 * von dieser Klasse kann keine Instanz gebildet werden
 * sie implements das Interface Hilfe welche nur abstracte methoden bereitstellt
 * die dann entweder in der klasse hier oder in den abgeleiteten Klassen programmiert
 * werden muss
 */
public abstract class Kunde implements Hilfe {
    private int knr;
    private String nachname;
    private String vorname;
    private String plz;
    private String ort;
    private String strasse;
    private String email;
    private String hausnr;

//    public Kunde() {
//        nachname = "N.N.";
//    }

    /**
     * Der Konstruktor der alle Variablen der klasse setzt
     *
     * @param knr      Kundennummer
     * @param nachname Nachname
     * @param vorname  Vorname
     * @param plz      PLZ
     * @param ort      Ort
     * @param strasse  Straße
     * @param hausnr   Hausnummer
     */
    public Kunde(int knr, String nachname, String vorname, String plz, String ort, String strasse, String hausnr, String email ) {
        this.knr = knr;
        this.nachname = nachname;
        this.vorname = vorname;
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.email = email;
    }

    public Kunde(String nachname) {
        this.nachname = nachname;
        System.out.println("konstruktor Kunde");

    }

    public Kunde(int kundenNr) {
        this.knr = kundenNr;
    }

    public Kunde(String nachname, int knr) {
        this.knr = knr;
        this.nachname = nachname;
    }

    /**
     * Eine methode um die Instanz Variablen Auszugeben
     * ich benutze den {@link StringBuilder} da er Schneller ist
     */
    public void ausgabe() {
        System.out.println(new StringBuilder().append(knr).append(" ").append(vorname).append(" ").append(nachname).append(" ").append(plz).append(" ").append(ort).append(" ").append(strasse).append(" ").append(hausnr).append(" ").append(email).toString());
    }

    /*
    zum zeigen von abstrakten methoden
     */
    public abstract void rechne();

    protected void finalize() {
        System.out.println("destruktor Kunde");

    }
    /**
     * Setzen der Variablen
     */

  /*  public void eingaben() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vorname: ");
        vorname = sc.next();
        System.out.println("nachname: ");
        nachname = sc.next();
        System.out.println("Plz: ");
        plz = sc.next();
        System.out.println("ort: ");
        ort = sc.next();
        System.out.println("Straße: ");
        strasse = sc.next();
        System.out.println("hausnr: ");
        hausnr = sc.next();
        do {
            System.out.println("email");
            email = sc.next();
        }while (!(email.matches(".+@.+\\..{2,}")));

    }*/

    /*
    getter und setter
     */
    public int getKnr() {
        return knr;
    }

    public void setKnr(int knr) {
        this.knr = knr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
