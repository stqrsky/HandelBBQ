package Uebung.Reflektion;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class personClass = Person.class;
        Method[] fields = personClass.getDeclaredMethods();
        //for Schleife für die ausgabe
        for (int i = 0; i<fields.length; i++){
            System.out.println(fields[i].getName());
        }

    }
}
