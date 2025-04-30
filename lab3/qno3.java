/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.awt.*;
import javax.swing.*;
public class qno3 extends Canvas 
{
    public static void main(String[] args)
    {
        JFrame f= new JFrame("2D Shapes");
        
        Canvas cv =new qno3();
        
        cv.setSize(600,600);
        f.add(cv);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    
    public void paint(Graphics g)
    {
        //Line
        g.drawLine(70,35,40,90);
        
        //Rectange
        g.drawRect(70,100,70,70);
        g.fillRect(180,100,70,70);
        
        //Circle
        g.drawOval(70,200,60,60);
        g.fillOval(180,200,60,60);
        
        //Ellipse
        g.drawOval(70,300,100,70);
        g.fillOval(180,300,100,70);
        
        //g.fillArc(180,300,100,70,40,70);
        
        //Polygon
        int[] x = {100, 140, 160, 140, 100, 80}; 
        int[] y = {400, 400, 440, 480, 480, 440}; 
        g.drawPolygon(x, y, 6);
        
        
    }
}