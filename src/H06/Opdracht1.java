package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    //DECLARATIE

    int totaalBedrag;
    double uitkomst;
    double x;

    public void init () {

        //INITIALISEREN

        totaalBedrag = 113;
        x = 4.0;
        uitkomst = totaalBedrag / x;
    }

    public  void paint(Graphics g) {

        g.drawString("Opbrengsten", 20, 20);
        g.drawString("Makaveli" + uitkomst, 20, 40);
        g.drawString("Gates" + uitkomst, 20, 60);
        g.drawString("Weezy" + uitkomst, 20, 80);
        g.drawString("Kdot" + uitkomst, 20, 100);
        g.drawLine(15, 25, 150, 25);
        g.drawRect(15, 5, 135, 100);
    }

}
