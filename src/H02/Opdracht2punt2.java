package H02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2punt2 extends Applet {

    public void init() {setBackground(Color.black);}

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Makaveli", 35, 50 );
        g.setColor(Color.red);
        g.drawString("TheDon", 25, 40 );
    }
}
