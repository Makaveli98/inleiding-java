package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    int som;
    int numb1;
    int numb2;



    public void init() {

        numb1 = 0;
        numb2= 1;
        som = numb1 + numb2;

    }

    public void paint (Graphics g) {

        int x = 0;

        int y = 20;

        for (int i = 0; i < 20; i++) {

            g.drawString("" + som, x, y);

            numb1 = numb2;

            numb2 = som;

            som = numb1 + numb2;

            x += 30;
        }
    }
}
