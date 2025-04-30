 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class qno2b {
    JFrame f;
    JFileChooser fc;
    JButton b1;

    public qno2b() {
        f = new JFrame("File Chooser");
        fc = new JFileChooser();
        b1 = new JButton("Open File");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(3); 
        
        f.add(b1);

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
        new qno2b(); 
    }
}