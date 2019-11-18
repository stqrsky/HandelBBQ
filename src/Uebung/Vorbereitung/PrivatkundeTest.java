package Uebung.Vorbereitung;

public class PrivatkundeTest extends KundeTest {


    public PrivatkundeTest(String name) {
        super(name);
        System.out.println("Konstruktor von PrivatKunde ( erzeugt Instanz von PrivatKunde)");

    }

    @Override
    public void sagEtwas() {
        System.out.println("oh je...");
    }
}
