package Uebung.Serialisierung;

import java.io.Serializable;

public class Time implements Serializable {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public String toString(){
        return hour + " " + minute;
    }

    @Deprecated
    public void oma() {

    }
}
