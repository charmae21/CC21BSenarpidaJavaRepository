package com.mycompany.cc21bsenarpidajavaawtdrawing;

/* Senarpida, Charmae A.
   CC2-1B
   12/05/2024
   JavaAwtDrawing
*/

import javax.swing.*;
import java.awt.*;

public class CC21BSenarpidaJavaAwtDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(new Color(135, 206, 250)); // Sky blue
        g.fillRect(0, 0, getWidth(), getHeight());

        // Green hill
        g.setColor(new Color(34, 139, 34)); // Forest green
        g.fillOval(-100, 200, 600, 300);

        // Sun
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100);

        // Sun rays
        g.setColor(Color.YELLOW);
        g.drawLine(100, 50, 100, 20);
        g.drawLine(100, 150, 100, 180);
        g.drawLine(50, 100, 20, 100);
        g.drawLine(150, 100, 180, 100);
        g.drawLine(75, 75, 50, 50);
        g.drawLine(125, 75, 150, 50);
        g.drawLine(75, 125, 50, 150);
        g.drawLine(125, 125, 150, 150);

        // Smiling face
        g.setColor(Color.BLACK);
        g.drawArc(70, 80, 60, 40, 0, -180);
        g.fillOval(80, 80, 10, 10);
        g.fillOval(110, 80, 10, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AWT Drawing");
        CC21BSenarpidaJavaAwtDrawing panel = new CC21BSenarpidaJavaAwtDrawing();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
}
