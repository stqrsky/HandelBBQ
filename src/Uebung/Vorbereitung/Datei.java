package Uebung.Vorbereitung;

import java.io.*;

public class Datei {

    public void dateiSchreiben2() {
        PrintWriter pWriter = null;
        try {
            pWriter =
                    new PrintWriter(new BufferedWriter(new FileWriter("oma.txt",true)));

            pWriter.println("Hallo Welt! ");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (pWriter != null) {
                pWriter.flush();
                pWriter.close();
            }
        }

    }

    public void dateiLesen2() throws IOException {
        BufferedReader in = null;
        try {
            File file = new File("oma.txt");
            if(!file.canRead()||!file.isFile()){
                System.err.println("fehler");
                System.exit(2);
            }
            in = new BufferedReader(new FileReader(file));
            String zeile;
            while ((zeile = in.readLine())!=null){
                System.out.println(zeile);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }finally {
            if(in != null){
                in.close();
            }
        }
    }

    public void dateiSchreiben() throws IOException {
        for (int i = 0; i <= 100000; i++) {
            FileWriter fw = new FileWriter("ausgabe.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hallo Welt!");
            bw.newLine();
            bw.write("Hallo Welt1!");
            bw.newLine();
            bw.close();
        }
    }

    public void dateiLesen() throws IOException {
        FileReader fr = new FileReader("ausgabe.txt");
        BufferedReader br = new BufferedReader(fr);
        String zeile1;
        while ((zeile1 = br.readLine()) != null) {
            System.out.println(zeile1);
        }
    }
}
