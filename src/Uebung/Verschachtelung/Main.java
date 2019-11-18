package Uebung.Verschachtelung;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        a1.gibA("Hallo Welt");

        A.B b1 = new A.B();
        b1.gibB();

    }
}
