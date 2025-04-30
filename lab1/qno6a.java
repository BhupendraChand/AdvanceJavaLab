/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab;


 import javax.swing.*;
import java.awt.*;

public class qno6a {
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    public qno6a() {
         f = new JFrame("FlowLayout ");
         b1= new JButton("Btn-1");
           
           b2= new JButton("Btn-2");
           b3= new JButton("Btn-3");
             b4= new JButton("Btn-4");
             b5= new JButton("Btn-5");

        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
                f.setLayout(new FlowLayout());
                
       f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        
    }

    public static void main(String[] args) {
        new qno6a(); 
    }
}

