package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {

    int numbers[] = {1, 2, 3, 4, 4, 4, 4, 5, 7, 7, 7, 7, 10, 10, 10, 10, 10, 20, 50, 50, 50};
    Button button;
    TextField text;
    int invoer;
    int x;
    int y;

    public void init() {

        button = new Button("klick me :)");
        KnopListener kl = new KnopListener();
        button.addActionListener(kl);
        text = new TextField("");
        add(button);
        add(text);
        x = 50;
        y = 70;
    }
    public void paint(Graphics g) {

        g.drawString("" + invoer, x, y );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String input = text.getText();
            invoer = Integer.parseInt(input);

            for (int i = 0; i < numbers.length ; i++) {

                if (invoer == i) {

                }
                repaint();
            }

        }
    }



}
