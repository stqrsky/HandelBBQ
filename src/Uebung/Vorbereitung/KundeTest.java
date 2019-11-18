package Uebung.Vorbereitung;

public abstract class KundeTest  implements Oma {
    private String name;

    public KundeTest(String name) {
        this.name = name;
        System.out.println("Konstruktor von Kunde ( erzeugt Instanz von Kunde)");
    }

    void getName() {
        System.out.println(this.name);
    }

    @Override
    public void sagEtwas() {
        System.out.println("sagEtwas Kunde");
    }
    @Override
    public void duAuch() {

    }
}
