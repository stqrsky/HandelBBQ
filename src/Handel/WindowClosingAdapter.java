package Handel;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowClosingAdapter extends WindowAdapter {

    private boolean exitSystem;

    public WindowClosingAdapter(boolean exitSystem) {
        this.exitSystem = exitSystem;
    }

    public WindowClosingAdapter() {
        this(false);
    }

    @Override
    public void windowClosing(WindowEvent event) {
        event.getWindow().setVisible(false);
        event.getWindow().dispose();
        if(exitSystem){
            System.exit(0);
        }
    }
}
