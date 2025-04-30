/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab;
import javax.swing.*;
import java.awt.*;

public class Slider {
    JFrame f;
    JSlider s1;
    JLabel l1;

    public Slider() {
        f = new JFrame("JSlider");
        l1 = new JLabel("Age =");      
        s1 = new JSlider(0, 50, 25);  
        s1.setMajorTickSpacing(10);
        s1.setPaintLabels(true);

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(s1);
    }

    public static void main(String[] args) {
        new Slider();
    }
}