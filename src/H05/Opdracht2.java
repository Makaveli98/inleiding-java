package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    //DECLARATIE

    int gewichtAkali;
    int gewichtZed;
    int gewitchtShen;
    int nulpunt, yas_Akali, yas_Zed, yas_Shen;


    public void init() {

        //INITIALISEREN

        nulpunt = 363;
        gewichtAkali = 20;
        yas_Akali = nulpunt - gewichtAkali*2;
        gewichtZed = 80;
        yas_Zed = nulpunt - gewichtZed*2;
        gewitchtShen = 100;
        yas_Shen = nulpunt - gewitchtShen*2;
    }

    public void paint(Graphics g) {

            g.setColor(Color.black);

            g.drawLine(291,129,291,363);

            g.drawLine(291,363,537,363);

            g.drawString("100", 259, 168 );

            g.drawString("80", 259, 208 );

            g.drawString("60", 259, 248 );

            g.drawString("40", 259, 288 );

            g.drawString("20", 259, 328 );

            g.drawString("Akali", 325, 375 );

            g.drawString("Zed", 400, 375 );

            g.drawString("Shen", 480, 375 );

            g.setColor (new Color (5, 244, 244) );

            g.fillRect(400,yas_Akali,45,gewichtAkali*2);

            g.setColor (new Color (101, 244, 80) );

            g.fillRect(325, yas_Zed, 45, gewichtZed*2);

            g.setColor (new Color (255, 31, 21) );

            g.fillRect(475, yas_Shen, 45, gewitchtShen*2);
    }

}