package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    Button knop;
    TextField text[];

    public void init() {
        text = new TextField[5];
        for (int i = 0; i < text.length; i++) {
            text[i] = (new TextField(5));
            add(text[i]);
        }

        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int[] getallen = new int[5];

            for (int i = 0; i < text.length; i++) {

                getallen[i] = Integer.parseInt(text[i].getText());

            }

            Arrays.sort(getallen);

            for (int i = 0; i < text.length; i++) {

                text[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}
