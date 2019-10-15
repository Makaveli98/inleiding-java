package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    int numbers [] = {1, 20, 33, 12, 70, 53, 67, 96};
    boolean gevonden;
    int x;
    int y;
    int gezocht;
    int index;
    Button knop;
    TextField text;

    public void init() {

        gevonden = false;
        knop = new Button("ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        text = new TextField("");
        add(knop);
        add(text);
        x = 50;
        y = 70;
        index = -1;
    }

    public void paint(Graphics g) {

        if (gevonden) {
            g.drawString("found value", x, y);
       }
        else {
            g.drawString("value not found",x, y);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = text.getText();
            gezocht = Integer.parseInt(s);

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == gezocht) {
                    gevonden = true;
                    index = numbers[i];
                }
            }

            repaint();
        }
    }
}
