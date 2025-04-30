package javalab;

import javax.swing.*;
import java.awt.event.*;


public class sumcalculate implements ActionListener {
     
      JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    public sumcalculate (){
        f= new JFrame ("ADD SUBTRACT");
        l1=new JLabel ("num1");
        l2=new JLabel("num2");
        
        l3=new JLabel ("Result =");
        t1=new JTextField(25);
        t2=new JTextField(25);
        t3=new JTextField(25);
      
        b1=new JButton("Add");
         b2=new JButton("Sub");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20,50,100,20);
        t1.setBounds(150,50,150,20);
        l2.setBounds(20,100,100,20);
        t2.setBounds(150,100,150,20);
         b1.setBounds(80,150,90,20);
        b2.setBounds(200,150,90,20);
 l3.setBounds(20,200,100,20);
        t3.setBounds(150,200,150,20);

        f.add(l1); f.add(l2); f.add(l3); 
        f.add(t1); f.add(t2); f.add(t3); 
        f.add(b1); f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()==("Add")) {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double ADD = num1 + num2;
            t3.setText("Add " + ADD);
            
        } else if (e.getActionCommand()==("Sub")) {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double SUBTRACT = num1 - num2;
            t3.setText("Subtract " + SUBTRACT);
        }
    }

    public static void main(String[] args) {
        new sumcalculate();
    }
}

