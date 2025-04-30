package lab2;
import javax.swing.*;
import java.awt.event.*;


public class QN3 implements ActionListener {
    
    JFrame f;
    JMenuBar m;
    JMenu m1;
    JMenuItem i1, i2, i3;
    
    public QN3() {
        f= new JFrame("MenuBar");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(3); 

        m = new JMenuBar();

        m1 = new JMenu("Options");
        
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Close");
        
        i1.setMnemonic(KeyEvent.VK_N);
        i2.setMnemonic(KeyEvent.VK_O);
        i3.setMnemonic(KeyEvent.VK_C);
        
        i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        i3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);

        m.add(m1);
        f.setJMenuBar(m);
        
        f.setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand().toString();
        
        if(cmd.equals("New"))
        {
            JOptionPane.showMessageDialog(f, "New clicked");
        }else if(cmd.equals("Open"))
        {
           JOptionPane.showMessageDialog(f, "Open clicked");
        }else if(cmd.equals("Close"))
        {
           JOptionPane.showMessageDialog(f, "Close clicked");
        }else{
           JOptionPane.showMessageDialog(f, "Invalid button clicked");    
        }
    }
    
    public static void main(String[] args) {
        new QN3();
    }
}
