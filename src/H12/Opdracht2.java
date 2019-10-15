package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    Button knop[];

    public void init() {

        knop = new Button[25];

        for (int teller = 0; teller < knop.length; teller++) {
            knop[teller] = new Button(paramString().valueOf(teller));
            add(knop);
        }
    }

    private void add(Button[] knop) {
    }
}
