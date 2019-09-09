package Troublesome96;

import java.awt.*;
import java.applet.*;

public class H05 extends Applet{

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.drawRect(100, 100, breedte, hoogte);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);

    }
}
