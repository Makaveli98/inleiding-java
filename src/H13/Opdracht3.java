package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        drawWall(g, 50, 50, 40, 10 );

    }

    void drawWall (Graphics g, int x, int y, int width, int height ) {

        x = 50;
        y = 50;

        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 70;
        y = 70;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 50;
        y = 90;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 70;
        y = 110;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 50;
        y = 130;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 70;
        y = 150;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
    }
}
