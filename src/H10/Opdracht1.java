package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    TextField textField;
    Button knop;
    int nmbr;
    int input;

    public void init() {

        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        textField = new TextField("", 10);
        textFieldListener textFieldListener = new textFieldListener();
        textField.addActionListener(textFieldListener);
        add(knop);
        add(textField);
    }

    public void paint(Graphics g) {

        g.drawString("Huidige hoogste getal = " + nmbr, 20, 60);
    }

    class textFieldListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            input = Integer.parseInt(textField.getText());

            if (input > nmbr) {

                nmbr = input;

                repaint();
            }
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }
}
