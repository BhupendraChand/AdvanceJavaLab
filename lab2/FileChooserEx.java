/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;
import javax.swing.*;
import java.awt.event.*;

public class FileChooserEx {
    JFrame f;
    JFileChooser fc;
    JButton b1;

    public FileChooserEx() {
        f = new JFrame("File Chooser ");
        fc = new JFileChooser();
        b1 = new JButton("Open File");

        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the button to the frame
        f.add(b1);

        // Add an ActionListener to the button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int file = fc.showOpenDialog(f);
                if (file == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f, "Selected file: " + fc.getSelectedFile().getAbsolutePath());
                }
            }
        });
    }

    public static void main(String[] args) {
        new FileChooserEx();
    }
}