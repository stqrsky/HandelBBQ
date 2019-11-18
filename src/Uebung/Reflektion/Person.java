package Uebung.Reflektion;

public class Person {
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    private void sagEtwas() {
        System.out.println("Hallo Welt");
    }
}
