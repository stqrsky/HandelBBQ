package Handel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListenerLesen extends MouseAdapter {
    private TextField tfKnr;
    private TextField tfVn;
    private TextField tfNn;
    private TextField tfStr;
    private TextField tfHnr;
    private TextField tfPlz;
    private TextField tfOrt;
    private TextField tfE;
    private int knr;


    public MyMouseListenerLesen(TextField tfKnr, TextField tfVn, TextField tfNn, TextField tfStr, TextField tfHnr, TextField tfPlz, TextField tfOrt, TextField tfE) {
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

        knr = Integer.parseInt(tfKnr.getText());
        Bestellung b = new Bestellung(knr);
        Datenbank db = new Datenbank();     //Datei d = new Datei("kunde.txt");
        db.dbout(b.getKunde());             //d.lesen(b.getKunde());
        tfVn.setText(b.getKunde().getNachname());
        tfNn.setText(b.getKunde().getVorname());
        tfStr.setText(b.getKunde().getStrasse());
        tfHnr.setText(b.getKunde().getHausnr());
        tfPlz.setText(b.getKunde().getPlz());
        tfOrt.setText(b.getKunde().getOrt());
        tfE.setText(b.getKunde().getEmail());

    }

}
