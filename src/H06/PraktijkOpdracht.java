package H06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddeld;
    double getGemiddeld2;
    int real;

    public void init() {

        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddeld = (cijfer1 + cijfer2 + cijfer3) / 3;
        getGemiddeld2 = gemiddeld * 10;
        real = (int) getGemiddeld2;
        getGemiddeld2 = real / 10;
    }

    @Override
    public void paint(Graphics g) {

        g.drawString("gemiddeld cijfer" +  getGemiddeld2, 100, 100);
    }
}
