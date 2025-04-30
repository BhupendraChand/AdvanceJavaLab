
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;

public class RegistrationForm implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextArea ta1;
    JTextField t1, t2, t3;
    JRadioButton rab1, rab2;
    JCheckBox chb1, chb2, chb3;
    JComboBox cb1, cb2, cb3;
    JButton b1;

    public RegistrationForm() {
        f = new JFrame("Registration Form");
        l1 = new JLabel("Name");
        l2 = new JLabel("Email");
        l3 = new JLabel("Password");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Hobbies");
        l6 = new JLabel("Date of Birth");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        t3 = new JTextField(25);
        ta1 = new JTextArea();
        rab1 = new JRadioButton("Male");
        rab2 = new JRadioButton("Female");
        chb1 = new JCheckBox("Playing");
        chb2 = new JCheckBox("Eating");
        chb3 = new JCheckBox("Swimming");
        b1 = new JButton("SUBMIT");


        String[] years = getYears(); 
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        String[] days = getDays(); 

        cb1 = new JComboBox(years);
       cb2 = new JComboBox(months);
        cb3 = new JComboBox(days);

        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);

        l1.setBounds(20, 100, 100, 20);
        t1.setBounds(150, 100, 100, 20);

        l2.setBounds(20, 150, 100, 20);
        t2.setBounds(150, 150, 100, 20);

        l3.setBounds(20, 200, 100, 20);
        t3.setBounds(150, 200, 100, 20);

        l4.setBounds(20, 250, 100, 20);
        rab1.setBounds(150, 250, 60, 20);
        rab2.setBounds(210, 250, 100, 20);

        l5.setBounds(20, 300, 100, 20);
        chb1.setBounds(150, 300, 80, 20);
        chb2.setBounds(230, 300, 80, 20);
        chb3.setBounds(320, 300, 100, 20);

        l6.setBounds(20, 350, 100, 20);
        cb1.setBounds(150, 350, 80, 20);
        cb2.setBounds(240, 350, 100, 20);
        cb3.setBounds(350, 350, 60, 20);

        b1.setBounds(150, 400, 100, 20);
        ta1.setBounds(420, 85, 300, 350);

        f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6); f.add(ta1);
        f.add(t1); f.add(t2); f.add(t3);
        f.add(rab1); f.add(rab2);
        f.add(chb1); f.add(chb2); f.add(chb3);
        f.add(cb1); f.add(cb2); f.add(cb3);
        f.add(b1);

        ButtonGroup bng = new ButtonGroup();
        bng.add(rab1);
        bng.add(rab2);
        b1.addActionListener(this);
    }

   
     String[] getYears() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String[] years = new String[currentYear - 1900 + 1];
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(1900 + i);
        }
        return years;
    }

    
    String[] getDays() {
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        return days;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String email = t2.getText();
        String password = t3.getText();
        String gender;
        StringBuilder hobbies = new StringBuilder();

        if (rab1.isSelected()) {
            gender = "Male";
        } else if (rab2.isSelected()) {
            gender = "Female";
        } else {
            gender = "Not selected !!";
        }

        if (chb1.isSelected()) {
            hobbies.append(chb1.getText()).append(", ");
        }
        if (chb2.isSelected()) {
            hobbies.append(chb2.getText()).append(", ");
        }
        if (chb3.isSelected()) {
            hobbies.append(chb3.getText());
        }

        String year = (String) cb1.getSelectedItem();
        String month = (String) cb2.getSelectedItem();
        String day = (String) cb3.getSelectedItem();
        String dateOfBirth = day + " " + month + " " + year;

        String result = "Name: " + name + "\nEmail: " + email + "\nPassword: " + password +
                "\nGender: " + gender + "\nHobbies: " + hobbies + "\nDate of Birth: " + dateOfBirth;
        ta1.setText(result);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
} 