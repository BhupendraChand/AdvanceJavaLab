/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;


import javax.swing.*;
import java.awt.event.*;

public class qno4 {
    
    JFrame f;
    JTextField tf;
    JPopupMenu pm;
    JMenuItem i1,i2,i3;
    
    
    public qno4()
    {
        f= new JFrame("Popup menu and Tooltip");
        f.setVisible(true);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(3);
        
        tf = new JTextField(20);
        tf.setToolTipText("Enter any text");
      
        
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Exit");
        
        pm = new JPopupMenu();
        pm.add(i1);
        pm.add(i2);
        pm.add(i3);
        
        
        
        f.setLayout(null);
        tf.setBounds(50, 50, 150, 20);
        f.add(tf);
        
        f.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(SwingUtilities.isRightMouseButton(e))
                {
                    pm.show(f, e.getX(), e.getY());
                }
            }
        }
        );
    }
    
    public static void main(String [] args)
    {
        new qno4();
    }
    
}
