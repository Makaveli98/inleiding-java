package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    int geheel;
    int cijfer;
    double uitkomst;

    public void init() {

        cijfer = 10;
        geheel = cijfer * 2;
        uitkomst = geheel;
    }

    public void paint(Graphics g) {

        g.drawString("ewa" + uitkomst, 20, 20);
    }
}
