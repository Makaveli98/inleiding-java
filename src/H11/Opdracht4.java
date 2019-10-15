package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    int N1;

    int Answr;

    public void init() {

        N1 = 3;
    }

    public void paint(Graphics g) {

        int X = 0;

        int Y = 20;



        for (int N2 = 0; N2 < 30; N2++) {

            g.drawString("" + Answr, X, Y);

            N1 = 3;

            Answr = N1* N2;


            X += 20;
        }
    }
}
