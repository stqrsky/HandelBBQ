package Uebung.MainArgument;

public class Main {
    public static void main(String[] args) {
        /**
         * über args wird das Programm Parameter mit übergeben
         * die in dem Array dann abgerufen werden
         */
        if ('+' == args[1].charAt(0)) {
            int erg;
            erg = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            System.out.println(erg);
        } else {
            for (String arg : args) {
                System.out.println(arg);

            }
        }
    }
}
