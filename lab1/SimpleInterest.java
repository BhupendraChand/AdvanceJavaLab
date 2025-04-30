  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab;
import javax.swing.*;
import java.awt.event.*;

public class SimpleInterest implements ActionListener
{
      JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    public SimpleInterest (){
        f= new JFrame ("Simple Interest");
        l1=new JLabel ("Principle");
        l2=new JLabel("Rate");
        l3=new JLabel("Time");
        l4=new JLabel ("Interest =");
        t1=new JTextField(25);
        t2=new JTextField(25);
        t3=new JTextField(25);
        t4=new JTextField(25);
        b1=new JButton("Simple Interest");
       
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20,50,100,20);
        t1.setBounds(150,50,150,20);
        l2.setBounds(20,100,100,20);
        t2.setBounds(150,100,150,20);
        l3.setBounds(20,150,100,20);
        t3.setBounds(150,150,150,20);
         b1.setBounds(130,200,150,20);
      
        l4.setBounds(20,250,100,20);
        t4.setBounds(80,250,200,20);

        f.add(l1); f.add(l2); f.add(l3); f.add(l4);
        f.add(t1); f.add(t2); f.add(t3); f.add(t4);
        f.add(b1); 
        b1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       
        double principle = Double.parseDouble(t1.getText());
        double time= Double.parseDouble(t2.getText());
        double rate= Double.parseDouble(t3.getText());
        double SI = principle*time*rate/100;  
        t4.setText(""+SI);
        }
        
          
    
    public static void main(String [] args)
    {
        new SimpleInterest();
    }
}

