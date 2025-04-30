import javax.swing.*;
import java.awt.*;

public class qno6e {
    JFrame f;
    JButton b1,b2,b3;
     public qno6e() {
         f = new JFrame("Card Layout");
         b1 = new JButton("One");
         b2 = new JButton("Two");
         b3 = new JButton("Three");
         f.setSize(400, 400);
         f.setVisible(true);
         f.setDefaultCloseOperation(3);
         CardLayout card = new CardLayout(20 ,20);
         f.setLayout(card);
         f.add("card1", b1);
         f.add("card2", b2);
         f.add("Card", b3);
         card.show(f.getContentPane(), "card2");
           
     }
     public static void main(String[] args) {
         new qno6e();


     }
}
