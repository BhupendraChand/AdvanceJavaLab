/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab;

/**
 *
 * @author Dell
 */
import javax.swing.*;
import java.awt.*;

public class qno6b {
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    public qno6b() {

        JFrame f = new JFrame("BorderLayout");
     
        b1=new JButton("North");
        b2=new JButton("West");

        b3=new JButton("East");
b4=new JButton("Ceneter");
b5=new JButton("South");
        f.setVisible(true);
           f.setLayout(new BorderLayout());
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.WEST);
         f.add(b3,BorderLayout.EAST);
          f.add(b4,BorderLayout.CENTER);
           f.add(b5,BorderLayout.SOUTH);
           f.pack();
    }

 public static void main(String[] args) {
        new qno6b(); 
    }
}
