package Handel;

import java.io.*;

/**
 * Zum Lesen und Schreiben der Kundendaten in einer datei
 */
public class Datei {

    private String dateipfad;


    public Datei(String dateipfad) {
        this.dateipfad = dateipfad;
    }

    public void schreiben(Kunde k) {

        String kd;// = k.knr + "|" + vorname + "|" + nachnahme + "|" + plz + "|" + ort + "|" + strasse + "|" + hausnr;
        kd = k.getKnr() + "|" + k.getVorname() + "|" + k.getNachname() + "|" +
                k.getPlz() + "|" + k.getOrt() + "|" + k.getStrasse() + "|" + k.getHausnr() + "|" + k.getEmail();
        System.out.println(kd);
        PrintWriter pWriter = null;
        try {
            pWriter =
                    new PrintWriter(new BufferedWriter(new FileWriter(this.dateipfad, true)));
            pWriter.println(kd); //"12|Hans|Meier|10245|Berlin|Hausburgstr.|24");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (pWriter != null) {
                pWriter.flush();
                pWriter.close();
            }
        }

    }

    /**
     * Liest die datei ein und gibt eine Instanz von {@link Firmenkunde} oder {@link Privatkunde} zurück
     *
     * @param knr Sucht anhand der Kundennummer die Datei durch
     * @return den Kunden mit der Kundennummer
     */
    public Kunde lesen(int knr) {
        // Hier wird ein reader zum lesen des Files erstellt

        try {
            FileReader fr = new FileReader(dateipfad);
            // Bufferreader ein bisschen schneller
            BufferedReader br = new BufferedReader(fr);
            Kunde k;
            String zeile1;
            // hier wird ein array von string erstellt
            String[] teile;
// hier werden alle zeilen eingelesen bis keine zeile mehr vorhanden ist
            while ((zeile1 = br.readLine()) != null) {
                // hier wird die gelesene Zeile anhand des pipe symbol getrennt
                // die beiden \\ dienen zum escapen damit auch wirklich das symbol gemeint ist
                teile = zeile1.split("\\|");
                if (Integer.parseInt(teile[0]) == knr) {
                    System.out.println(zeile1);
                    System.out.println("test");
                    if (Integer.parseInt(teile[0]) <= 500) {
                        k = new Privatkunde(Integer.parseInt(teile[0]), teile[2], teile[1], teile[3], teile[4], teile[5], teile[6],teile[7]);
                        return k;

                    } else {
                        k = new Firmenkunde(Integer.parseInt(teile[0]), teile[2], teile[1], teile[3], teile[4], teile[5], teile[6],teile[7]);
                        return k;
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }


    /**
     * Liest die datei ein und gibt eine Instanz von {@link Firmenkunde} oder {@link Privatkunde} zurück
     *
     * @param knr Sucht anhand der Kundennummer die Datei durch
     * @return den Kunden mit der Kundennummer
     */
    public void lesen(Kunde kunde) {
        // Hier wird ein reader zum lesen des Files erstellt

        try {
            FileReader fr = new FileReader(dateipfad);
            BufferedReader br = new BufferedReader(fr);

            String zeile1;
            String[] teile;
            while ((zeile1 = br.readLine()) != null) {
                teile = zeile1.split("\\|");
                if (Integer.parseInt(teile[0]) == kunde.getKnr()) {
                    System.out.println(zeile1);
                    kunde.setVorname(teile[1]);
                    kunde.setNachname(teile[2]);
                    kunde.setPlz(teile[3]);
                    kunde.setOrt(teile[4]);
                    kunde.setStrasse(teile[5]);
                    kunde.setHausnr(teile[6]);
                    kunde.setEmail(teile[7]);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }

    }


}
