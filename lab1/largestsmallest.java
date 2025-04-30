/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab;


 import javax.swing.*;
import java.awt.event.*;
public class largestsmallest  {

    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;

    public largestsmallest() {
        f = new JFrame("Largest And Smallest Number");
        l1 = new JLabel("Number 1:");
        l2 = new JLabel("Number 2:");
        l3 = new JLabel("Number 3:");
        l4 = new JLabel("Result =");
        l5 = new JLabel(" Please Type:");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        t3 = new JTextField(25);
        t4 = new JTextField(25);
        t5 = new JTextField(25);
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
       l4.setBounds(50, 250, 150, 30);
       t4.setBounds(210, 250, 150, 30);
       l5.setBounds(50, 300, 150, 30);

       t5.setBounds(210, 300, 150, 30);


        f.add(l1); f.add(l2); f.add(l3);  f.add(t1);
        f.add(t2);f.add(t3);  f.add(l4);f.add(t4);
        f.add(t5); f.add(l5);

        t5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int num3 = Integer.parseInt(t3.getText());
                int smallest, largest;
                if (num1 <= num2 && num1 <= num3) {
                    smallest = num1;
                } else if (num2 <= num1 && num2 <= num3) {
                    smallest = num2;
                } else {
                    smallest = num3;
                }

                if (num1 >= num2 && num1 >= num3) {
                    largest = num1;
                } else if (num2 >= num1 && num2 >= num3) {
                    largest = num2;
                } else {
                    largest = num3;
                }
                t4.setText("Smallest: " + smallest + ", Largest: " + largest);
            }
        });
    }

    public static void main(String[]args){

        new largestsmallest();
    }


}