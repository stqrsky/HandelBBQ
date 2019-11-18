package Uebung.Vorbereitung;

public class FirmenkundeTest extends KundeTest  implements Oma{
    public FirmenkundeTest(String name) {
        super(name);
        System.out.println("Konstruktor von FirmenKunde ( erzeugt Instanz von FirmenKunde)");
    }

    @Override
    public void sagEtwas() {
//        super.sagEtwas();
        System.out.println("sag etwas firmenkunde");
    }

    @Override
    public void duAuch() {
        System.out.println("oh je Firmenkunde");
    }
}
