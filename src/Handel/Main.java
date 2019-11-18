package Handel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Gui gui = new Gui();

/*      ///todo test für die datenbank
        Kunde k = new Privatkunde(3);
        Datenbank db = new Datenbank();
        db.dbout(k);
        k.ausgabe();
        int knr = k.getKnr()+1;
        k.setKnr(knr);
        System.out.println("insert into kunde values ("+k.getKnr()+','+k.getVorname() +','+k.getNachname()+','+k.getOrt()+','+k.getPlz()+')');
        db.dbin(k);*/
        /*
        System.out.println("Bestellung (1) \n \t\t oder\n Neukunde(2) ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Kundennummer: ");
        int knr = sc.nextInt();
        if (x == 1) {
            //Aufnahme einer Bestellung
            Bestellung b = new Bestellung(knr);
            Datei d = new Datei("kunde.txt");
            d.lesen(b.getKunde());
            b.getKunde().ausgabe();

        } else {

        }

        //todo Neukunde aufnahme
//        Kunde k;
//        System.out.println("Kundennummer: ");
//        knr = sc.nextInt();
//        if (knr <= 500) {
//            k = new Privatkunde(knr);
//        } else {
//            k = new Firmenkunde(knr);
//        }
//        k.eingaben();
//        Datei d = new Datei("kunde.txt");
//        d.schreiben(k);

        /*    try {
            Datei d = new Datei("kunde.txt");
            Kunde k;
            //todo Aufnahme einer Bestellung

            System.out.println("Kundennummer: ");
            Scanner sc = new Scanner(System.in);
            int knr = sc.nextInt();
            k = d.lesen(knr);
            k.ausgabe();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        // todo Neukunden aufnahme


//        d.eingaben();
//        d.schreiben();

         */
    }}

