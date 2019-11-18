package Handel;

import java.awt.*;

public class Gui extends Frame {

    private Label label;
    private TextField tfKnr;
    private TextField tfVn;
    private TextField tfNn;
    private TextField tfStr;
    private TextField tfHnr;
    private TextField tfPlz;
    private TextField tfOrt;
    private TextField tfE;

    public Gui() {
        this.setSize(550, 400);
        setVisible(true);
        this.setLayout(new BorderLayout(10, 10));
        this.addWindowListener(new WindowClosingAdapter());


        // Panels für die Dateneingabe oder Ausgabe
        Panel panelDaten = new Panel(new FlowLayout(FlowLayout.RIGHT));
        label = new Label("Kunden nr");
        panelDaten.add(label);
        tfKnr = new TextField(25);
        panelDaten.add(tfKnr);
        Panel panelDaten1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten1.add(new Label("Vorname"));
        tfVn = new TextField(25);
        panelDaten1.add(tfVn);
        Panel panelDaten2 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten2.add(new Label("Nachnahme"));
        tfNn = new TextField(25);
        panelDaten2.add(tfNn);
        Panel panelDaten3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten3.add(new Label("Strasse"));
        tfStr = new TextField(25);
        panelDaten3.add(tfStr);
        Panel panelDaten4 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten4.add(new Label("Hausnummer"));
        tfHnr = new TextField(25);
        panelDaten4.add(tfHnr);
        Panel panelDaten5 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten5.add(new Label("PLZ"));
        tfPlz = new TextField(25);
        panelDaten5.add(tfPlz);
        Panel panelDaten6 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten6.add(new Label("Ort"));
        tfOrt = new TextField(25);
        panelDaten6.add(tfOrt);
        Panel panelDaten7 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten7.add(new Label("E-mail"));
        tfE = new TextField(25);
        panelDaten7.add(tfE);

//Panel für die daten spalten;
        Panel panelDatenzusamme = new Panel(new GridLayout(8, 0));
        panelDatenzusamme.add(panelDaten);
        panelDatenzusamme.add(panelDaten1);
        panelDatenzusamme.add(panelDaten2);
        panelDatenzusamme.add(panelDaten3);
        panelDatenzusamme.add(panelDaten4);
        panelDatenzusamme.add(panelDaten5);
        panelDatenzusamme.add(panelDaten6);
        panelDatenzusamme.add(panelDaten7);

        Panel kundenButton = new Panel(new FlowLayout(FlowLayout.CENTER));
        Button bNeukunde = new Button("Neukunde");
        kundenButton.add(bNeukunde);
        kundenButton.add(new Button("Eingabe Löschen"));

        Panel panelBestandskunden = new Panel(new FlowLayout(FlowLayout.RIGHT));
        Button bBestandskunden = new Button("Bestandskunde ");
        panelBestandskunden.add(bBestandskunden);
        //Main Fenster
        this.add(panelDatenzusamme, BorderLayout.CENTER);
        this.add(kundenButton, BorderLayout.SOUTH);
        this.add(panelBestandskunden, BorderLayout.EAST);

        bNeukunde.addMouseListener(new MyMouseListener(tfKnr, tfVn, tfNn, tfStr, tfHnr, tfPlz, tfOrt, tfE));
        bBestandskunden.addMouseListener(new MyMouseListenerLesen(tfKnr, tfVn, tfNn, tfStr, tfHnr, tfPlz, tfOrt, tfE));

/*        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });*/


    }

    public TextField getTfKnr() {
        return tfKnr;
    }

    private Panel daten1(String name) {
        Panel panelDaten7 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        panelDaten7.add(new Label(name));
        TextField text = new TextField(25);
        panelDaten7.add(text);
        return panelDaten7;
    }
}
