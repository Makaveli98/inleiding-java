package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    //DECLARATIE

    int onesec;
    int onehour;
    int oneday;
    int oneyear;

    public void init() {

        onesec = 1;
        onehour = onesec * 60;
        oneday = onehour * 24;
        oneyear = oneday * 365;
    }
    public  void  paint(Graphics g) {

        g.drawString("1 uur" + onehour, 20, 20);
        g.drawString("1 dag" + oneday, 20, 40);
        g.drawString("1 jaar" + oneyear, 20, 60);
    }


}
