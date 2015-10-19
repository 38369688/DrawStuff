/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author user
 */
public class AdEnviroment extends Environment {

    public AdEnviroment() {
        this.setBackground(Color.white);
        logo = ResourceTools.loadImageFromResource("drawStuff/Apple_Logo_Blue_Transparent.png");
    }

    Image logo = null;

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        graphics.setColor(Color.blue);
        graphics.fillOval(750, 150, 100, 100);

        graphics.setColor(Color.green);
        graphics.fillOval(425, 100, 150, 150);

        graphics.setColor(Color.pink);
        graphics.fillOval(334, 115, 40, 40);

        graphics.setColor(Color.yellow);
        graphics.fillOval(300, 90, 120, 120);

        graphics.setColor(Color.black);
        graphics.fillOval(254, 10, 20, 20);

        graphics.setColor(Color.GRAY);
        graphics.fillOval(762, 500, 90, 90);

        graphics.setColor(Color.CYAN);
        graphics.fillOval(235, 478, 134, 134);

        graphics.setColor(Color.ORANGE);
        graphics.fillOval(700, 25, 111, 111);

        graphics.setColor(Color.magenta);
        graphics.fillOval(15, 121, 176, 176);

        graphics.setColor(Color.cyan);
        graphics.fillOval(340, 387, 145, 145);

        graphics.setColor(Color.green);
        graphics.fillOval(75, 450, 50, 50);

        graphics.setColor(new Color(222, 40, 220));
        graphics.fillOval(605, 132, 10, 10);

        graphics.setColor(new Color(180, 177, 59));
        graphics.fillOval(100, 40, 50, 50);

        graphics.setColor(new Color(127, 11, 242));
        graphics.fillOval(600, 30, 50, 50);

        graphics.setColor(Color.red);
        graphics.fillOval(30, 300, 77, 77);

        graphics.setColor(Color.red);
        graphics.fillOval(5, 10, 25, 25);

        graphics.setColor(Color.black);
        graphics.fillOval(750, 400, 80, 80);
        
        graphics.setColor(new Color(242, 0, 252));
        graphics.fillOval(620, 400, 80, 80);
        
        graphics.setColor( new Color(255, 25, 255, 200));
        graphics.fillOval(580, 400, 80, 80);
        
        graphics.setFont(new Font("New Times Rome", Font.ITALIC, 40));
        graphics.drawString("AppleLogo", 350, 500);

        if (logo != null) {
            graphics.drawImage(logo, 300, 150, 300, 300, this);
        }
    }

}
