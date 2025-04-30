 package javalab;

import javax.swing.*;
import java.awt.event.*;


public class areaperimeter  {

    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    public areaperimeter() {
        f = new JFrame("  Area and Perimeter");
        l1 = new JLabel("Length =");
        l2 = new JLabel("Width =");
        l3 = new JLabel("Result =");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        t3 = new JTextField(25);
        b1 = new JButton("Calculate");

        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(50, 50, 150, 30);
        t1.setBounds(210, 50, 150, 30);
        l2.setBounds(50, 100, 150, 30);
        t2.setBounds(210, 100, 150, 30);
        l3.setBounds(50, 150, 150, 30);
        t3.setBounds(210, 150, 150, 30);
        b1.setBounds(100, 250, 150, 30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);

       b1.addMouseListener(new MouseAdapter() {
           public void mousePressed(MouseEvent e) {
               int length = Integer.parseInt(t1.getText());
               int width = Integer.parseInt(t2.getText());
               int area = length*width;
               t3.setText(String.valueOf(area));
               l3.setText("Area = ");
           }
       });
       b1.addMouseListener(new MouseAdapter() {
           public void mouseReleased(MouseEvent e) {
               int length = Integer.parseInt(t1.getText());
               int width = Integer.parseInt(t2.getText());
               int perimeter = 2*(length+width);
               t3.setText(String.valueOf(perimeter));
               l3.setText("Perimeter = ");
           }
       });
    }

    public static void main(String[]args){

        new areaperimeter();
    }


}