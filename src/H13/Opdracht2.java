package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {

        drawWall(g, 50, 50, 40, 10);

    }

    private void drawWall(Graphics g, int x, int y, int breedte, int hoogte) {


        x = 50;
        y = 50;

        for (int i = 0; i < 6; i++) {

            x = 50;
            for (int j = 0; j < 6; j++) {
                g.setColor(Color.RED);
                g.fillRect(x, y, breedte, hoogte);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
            y += hoogte;
        }
    }
}
