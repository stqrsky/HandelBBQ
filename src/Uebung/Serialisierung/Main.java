package Uebung.Serialisierung;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fs = new FileOutputStream("test.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        Time time = new Time(10, 20);
        os.writeObject(time);
        os.close();

        FileInputStream fs1 = new FileInputStream("test.ser");
        ObjectInputStream is = new ObjectInputStream(fs1);
        Time time2 = (Time) is.readObject();
        System.out.println(time2);
        Object a ;
        a = time2;
        System.out.println(a);
    }
}
