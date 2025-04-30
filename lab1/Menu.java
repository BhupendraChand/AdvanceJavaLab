/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab;
import javax.swing.*;
import java.awt.*;

public class Menu {
    JFrame f;
    JMenuBar mb;
    JMenu m1;
    JMenuItem i1, i2;
    JMenu sm1;

    public Menu() {
        f = new JFrame(" Menu Example 2");
        mb = new JMenuBar();
        m1 = new JMenu("Program");
        sm1 = new JMenu("BCA");
        i1 = new JMenuItem("BIT");
 sm1.add(new JMenuItem("Project 1"));
        sm1.add(new JMenuItem("Project 2"));
        sm1.add(new JMenuItem("Project 3"));
          i2 = new JMenuItem("BIM");
        m1.add(sm1);
         m1.add(i1);
           m1.add(i2);
        mb.add(m1);
        f.setJMenuBar(mb);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new Menu();
    }
}