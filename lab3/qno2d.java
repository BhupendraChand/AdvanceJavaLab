 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Dell
 */
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class qno2d {
    JFrame f;
    JTable tb;
    JScrollPane sp;

    public qno2d() {
f = new JFrame("JTable");
String[]colname={"Roll","Sname","Semester"};
String[][]data={{"101","David","1st Semester"},{"102","Bhupendra","6th Semester"},{"11","Pradip","4th Semester"},
{"11","Ramesh","3th Semester"},{"10","David","8th Semester"},{"123","Romeo","5th Semester"},{"13","Ram","2th Semester"},
{"14","Romeo","8th Semester"},{"123","Rajesh","6th Semester"},{"134","Romeo","5th Semester"}};
tb= new JTable (data,colname);
sp=new JScrollPane(tb);
f.add(sp);
f.setSize(500,200);
 
        f.setVisible(true);
        f.setDefaultCloseOperation(3); 
        
    }
     public static void main(String[] args) {
        new qno2d(); 
    }
}