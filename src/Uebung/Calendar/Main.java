package Uebung.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.get(Calendar.HOUR));
        cal.set(Calendar.HOUR,129);
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.isLeapYear(cal.get(Calendar.YEAR)));

    }
}
