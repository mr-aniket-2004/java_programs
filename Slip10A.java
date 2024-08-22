import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Slip10A extends JFrame implements ActionListener {
    JLabel title,l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    JPanel p1,p2,p3,p4,p5;
    Slip10A(){
        title = new JLabel("Compund Interest Calculator");
        l1 = new JLabel("Principle Amount :");
        l2 = new JLabel("Interest Rate :");
        l3 = new JLabel("Time(year) :");
        l4 = new JLabel("Total Amount :");
        l5 = new JLabel("Interest Amount :");
        t1= new JTextField(20);
        t2= new JTextField(20);
        t3= new JTextField(20);
        t4= new JTextField(20);
        t5= new JTextField(20);
        b1= new JButton("Calculate");
        b1= new JButton("Clear");
        b1= new JButton("Close");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        p1.add(title)
    }
}
