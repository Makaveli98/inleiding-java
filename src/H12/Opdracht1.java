package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    int getal[];

    public void init() {

        getal = new int[10];
        for (int teller = 0; teller < getal.length; teller++) {
            getal[teller] = (teller + 1);
        }
    }

    public void paint(Graphics g) {


        for (int teller = 0; teller < getal.length; teller++) {

            g.drawString("" + getal[teller], 50, 20 * teller + 20);
        }
    }
}