package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    int T;

    public void init (){

        T = 0;
    }

    public void paint(Graphics g) {

            int X = 190;

            int Y2 = 20;

            int Y = 150;

            int X2 = 20;


            while (T <100) {

                g.drawOval(X, Y, X2, Y2);


                X2 += 10;

                Y2 += 10;

                X -= 5;

                Y -= 5;

                T++;
            }
        }
    }

