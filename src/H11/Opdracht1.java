package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int counter;

        int y = 0;

        for (counter = 0; counter < 11; counter++) {

            y += 20;
            g.drawLine(50, y, 300, y );
            g.drawString("" + counter, 100, y);
        }
    }
}
