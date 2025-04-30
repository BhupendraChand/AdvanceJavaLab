/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class qno2a {
    JFrame f;
    JButton b1;

    public qno2a() {
        f = new JFrame("Color Chooser");
        b1 = new JButton("Please Choose Color");
        f.setSize(300, 200);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(3);

        f.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color initialColor = Color.RED; 
                Color chosenColor = JColorChooser.showDialog(f, "Color Chooser", initialColor);
                if (chosenColor != null) { 
                    f.getContentPane().setBackground(chosenColor); 
                }
            }
        });
    }

    public static void main(String[] args) {
        new qno2a(); 
    }
}