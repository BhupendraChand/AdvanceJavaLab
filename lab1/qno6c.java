import javax.swing.*;
import java.awt.*;

public class qno6c {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;

    public qno6c() {
        f = new JFrame("Grid Layout");
        b1 = new JButton("B1");
        b2 = new JButton("B2");
        b3 = new JButton("B3");
        b4 = new JButton("B4");
        b5 = new JButton("B5");
        b6 = new JButton("B6");
        b7 = new JButton("B7");
        b8 = new JButton("B8");
        f.setVisible(true);
        f.setSize(350,350);
        f.setDefaultCloseOperation(3);
        f.setLayout(new GridLayout(2,4,5,5));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
    }
    public static void main(String[] args) {
        new qno6c();
    }

}
