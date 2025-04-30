
import javax.swing.*;
import java.awt.event.*;

public class qno1  {
    
    public static void main(String[] args) { 
        int principle = Integer.parseInt(JOptionPane.showInputDialog("Enter Principle:"));
        int rate = Integer.parseInt(JOptionPane.showInputDialog("Enter rate:"));
        int time = Integer.parseInt(JOptionPane.showInputDialog("Enter time:"));
        double SI = principle * rate * time / 100;

        JOptionPane.showMessageDialog(null, "Simple Interest = " + SI);
    }
}