package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    double total;
    int aantalCijfers;
    double gemiddelde;
    String beoordeling;
    Button OK;
    TextField userinput;


    public void init() {

        userinput = new TextField(5);

        OK = new Button("OK");

        Gemiddelde listener = new Gemiddelde();

        OK.addActionListener(listener);

        total = 0;
        aantalCijfers = 0;
        gemiddelde = total / aantalCijfers;

        add(userinput);
        add(OK);

        beoordeling = "";
    }

    public void paint(Graphics g) {

        g.drawString("Het gemiddelde is: " + beoordeling, 50, 70);

        g.drawString("Gemiddelde: " + gemiddelde, 50, 90);
    }

    class Gemiddelde implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            double invoer = Double.parseDouble(userinput.getText());

            total += invoer;

            aantalCijfers++;

            gemiddelde = total / aantalCijfers;

            if (gemiddelde < 5.5) {

                beoordeling = "onvoldoende";
            } else {

                beoordeling = "voldoende";

            }

            repaint();
        }
    }
}
