/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import javax.swing.*;
import java.awt.event.*;

public class qno2c {
    JFrame f;
    JDesktopPane dp;
    JInternalFrame f1,f2;

    public qno2c() {
        f = new JFrame("File Chooser and Internal Frame");
        dp = new JDesktopPane();
         f.add(dp);
f1=new JInternalFrame("IFRame1",true,true,true,true);
f2=new JInternalFrame("IFRame2",true,true,true,true);
        f1.setSize(200, 200);
          f2.setSize(200, 200);
        f1.setVisible(true);
           f2.setVisible(true);
           f1.add(new JLabel("Internal frame 1"));
        f2.add(new JLabel("Internal frame 2"));
              dp.add(f1); dp.add(f2);
 f.setSize(450, 400);
        
          f.setVisible(true);
        f.setDefaultCloseOperation(3); 
    }


    public static void main(String[] args) {
        new qno2c(); 
    }
}