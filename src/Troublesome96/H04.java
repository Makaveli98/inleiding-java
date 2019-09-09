package Troublesome96;

import java.awt.*;
import java.applet.*;

public class H04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.YELLOW);
        g.setColor(Color.blue);
        g.drawRect(20, 20, 100, 50);
        g.fillRect(20, 80, 100, 50);
        g.drawRoundRect(20, 20, 100, 50, 10, 10);
    }

}
