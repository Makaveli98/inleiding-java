package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4punt1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawLine(100, 200, 300, 200);
        g.drawLine(300, 200, 200, 70);
        g.drawLine(200,70, 100, 200);
    }
}
