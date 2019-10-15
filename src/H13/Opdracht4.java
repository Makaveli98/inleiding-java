package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    Button button;
    Button button2;

    public void init() {

        button = new Button("click me");
        button.addActionListener(new Action());
        add(button);
        button2 = new Button("click me");
        button2.addActionListener(new Action2());
        add(button2);

    }

     class Action implements ActionListener {


         public void actionPerformed(ActionEvent e) {

             drawWall(getGraphics(), 50, 50, 40, 10);
         }

     }

     class Action2 implements ActionListener {

         public void actionPerformed(ActionEvent e) {

             drawWall2(getGraphics(), 50, 50, 40, 40);

         }
     }


    public void paint(Graphics g) {

    }

    void drawWall (Graphics g, int x, int y, int width, int height) {

        x = 50;
        y = 50;

        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 70;
        y = 70;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 50;
        y = 90;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 70;
        y = 110;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 50;
        y = 130;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 70;
        y = 150;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
            
        }
    }
    void drawWall2 (Graphics g, int x, int y, int width, int height ) {

        x = 500;
        y = 50;

        for (int i = 0; i < 6; i++) {
            g.setColor(Color.gray);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 520;
        y = 100;

        for (int i = 0; i < 6; i++) {
            g.setColor(Color.gray);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 500;
        y = 150;

        for (int i = 0; i < 6; i++) {
            g.setColor(Color.gray);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 520;
        y = 200;

        for (int i = 0; i < 6; i++) {
            g.setColor(Color.gray);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 500;
        y = 250;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.gray);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
        x = 520;
        y = 300;
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.gray);
            g.drawRect(x, y, width, height);
            g.fillRect(x, y, width, height);

            x += 60;
        }
    }
}
