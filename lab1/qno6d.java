/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab;

import javax.swing.*;
import java.awt.*;

public class qno6d {

    JFrame f;
    JButton b1, b2, b3;

    public qno6d() {

        f = new JFrame("GridBagLayout");
        b1 = new JButton("btn-1");
        b2 = new JButton("btn-2");
        b3 = new JButton("btn-3");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(b1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(b2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        f.add(b3, gbc);

    }

    public static void main(String[] args) {
        new qno6d();
    }
}
