/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;

public class IDCard extends Canvas {
    public static void main(String[] args) {
        JFrame f = new JFrame("ID Card");
        Canvas cv = new IDCard();
        cv.setSize(300, 450);
        f.add(cv);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }

    public void paint(Graphics g) {
        try {
            BufferedImage img = ImageIO.read(getClass().getResource("college.jpg"));
            g.drawImage(img, 30, 30, 250, 250, this);
            Font f = new Font("monospace", Font.BOLD, 20);
            g.setFont(f);
            g.drawString("Name: Muna Kumari Kafle",30, 300);
            g.drawString("Section: A",30, 350);
            g.drawString("Roll no: 24",30, 400);
            g.drawString("Address:Chitwan",30, 440);


        } catch (Exception e) {

        }
    }
}