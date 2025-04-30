 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import javax.swing.*;
import java.awt.*;

public class qno2e {
    JFrame f;
    JList li;
    JLabel l;
   public qno2e() {
       f = new JFrame("JList");
       l=new JLabel("Color");
       String[] colors={"red","green","blue","yellow","orange","magenta","cyan","white"};
       li=new JList(colors);
       li.setVisibleRowCount(3);
       li.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       f.setSize(300,300);
       f.setLayout(new FlowLayout());
       f.setVisible(true);
       f.setDefaultCloseOperation(3);
       f.add(l);
       f.add(li);
       f.add(new JScrollPane(li));

   }
   public static void main(String[] args) {
       new qno2e();
   }
}