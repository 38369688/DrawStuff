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
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author user
 */
class DrawEnviroment extends Environment {

    public DrawEnviroment() {
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
//        graphics.setColor(Color.blue);
//        graphics.drawOval(400, 150, 75, 75);
//
//        graphics.setColor(Color.yellow);
//        graphics.drawOval(425, 200, 75, 75);
//
//        graphics.setColor(Color.black);
//        graphics.drawOval(450, 150, 75, 75);
//
//        graphics.setColor(Color.green);
//        graphics.drawOval(475, 200, 75, 75);
//
//        graphics.setColor(Color.red);
//        graphics.drawOval(500, 150, 75, 75);
//        
//        graphics.setColor(Color.magenta);
//        graphics.fillOval(100, 75, 90, 40);
//        
//        graphics.setColor(Color.darkGray);
//        graphics.drawRect(60, 300, 123, 123);
//        
//        graphics.setColor(new Color(255, 0, 255));
//        graphics.fillRect(183, 200, 123, 123);
//        
//        graphics.setColor(new Color(0, 255, 0));
//        graphics.fillOval(25, 150, 75, 75);
//
//        graphics.setColor(new Color(255, 0, 0));
//        graphics.fillOval(50, 100, 75, 75);
//        
//        graphics.setColor(new Color(0, 0, 255));
//        graphics.fillOval(75, 150, 75, 75);

//        graphics.setFont(new Font("Calibri", Font.ITALIC, 32));
//        graphics.drawString("Hellow", 200, 400);

        
        if (logo != null) {
            graphics.drawImage(logo, 10, 30, 150, 150, this);
            
        }
    }
  
}
