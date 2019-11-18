package Handel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {

    private TextField tfKnr;
    private TextField tfVn;
    private TextField tfNn;
    private TextField tfStr;
    private TextField tfHnr;
    private TextField tfPlz;
    private TextField tfOrt;
    private TextField tfE;

    private int knr;
    private String vorname;
    private String nachname;
    private String plz;
    private String ort;
    private String strasse;
    private String hausnr;
    private String email;

    public MyMouseListener(TextField tfKnr, TextField tfVn, TextField tfNn) {
        this.tfKnr = tfKnr;
        this.tfVn = tfVn;
        this.tfNn = tfNn;
        plz = "22111";
        ort = "Hamburg";
        strasse = "hauptstr";
        hausnr = "14a";
        email = "test@test.de";


    }

    public MyMouseListener(TextField tfKnr, TextField tfVn, TextField tfNn, TextField tfStr, TextField tfHnr, TextField tfPlz, TextField tfOrt, TextField tfE) {
        this.tfKnr = tfKnr;
        this.tfVn = tfVn;
        this.tfNn = tfNn;
        this.tfStr = tfStr;
        this.tfHnr = tfHnr;
        this.tfPlz = tfPlz;
        this.tfOrt = tfOrt;
        this.tfE = tfE;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //todo Neukunde aufnahme
        Kunde k;
        knr = Integer.parseInt(tfKnr.getText());
        // If Else mit einer bedingung
        if (tfVn.getText().isEmpty()) {
            vorname = "Berta";
        } else {
            vorname = tfVn.getText();
        }
        //das gleiche wie oben
        nachname = (tfNn.getText().isEmpty() ? "Müller " : tfNn.getText());
        strasse = (tfStr.getText().isEmpty() ? "Hauptstr " : tfStr.getText());
        hausnr = (tfHnr.getText().isEmpty() ? "880a" : tfHnr.getText());
        plz = (tfPlz.getText().isEmpty() ? "15222" : tfPlz.getText());
        ort = (tfOrt.getText().isEmpty() ? "Bremen" : tfOrt.getText());
        email = (tfE.getText().isEmpty() ? "test@test.de" : tfE.getText());

        if (knr <= 500) {
            k = new Privatkunde(knr, nachname, vorname, plz, ort, strasse, hausnr, email);
            k.ausgabe();
        } else {
            k = new Firmenkunde(knr, nachname, vorname, plz, ort, strasse, hausnr, email);
        }

        Datenbank db = new Datenbank();
        db.dbin(k);
/*        Datei d = new Datei("kunde.txt");
        d.schreiben(k);*/
    }
}
