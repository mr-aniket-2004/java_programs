import java.awt.GridLayout;

import javax.swing.*;

public class Slip30A extends JFrame {
    Slip30A(){
        JLabel title,l1,l2,l3,l4,l5,l6;
        JTextField t1,t2,t3,t4;
        JRadioButton r1,r2;
        JCheckBox c1,c2,c3;
        JPanel p1,p2,p3,p4,p5;
        JButton b1,b2;
        ButtonGroup g;

        title = new JLabel("PERSONAL INFORMATION");
        l1 = new JLabel("Frist Name :");
        l2 = new JLabel("Last Name :");
        l3 = new JLabel("Address  :");
        l4 = new JLabel("Mobile No :");
        l5 = new JLabel("Gender :");
        l6 = new JLabel("Your Interest :");

        t1= new JTextField(20);
        t2= new JTextField(20);
        t3= new JTextField(20);
        t4= new JTextField(20);
        
        g = new ButtonGroup();
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        g.add(r1);  g.add(r2);

        c1 = new JCheckBox("Computer");
        c2 = new JCheckBox("Sport");
        c3 = new JCheckBox("Music");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        b1 = new JButton("Submit");
        b2 = new JButton("Reset");


        p1.add(title);
        p1.setLayout(new GridLayout(1,1));

        p2.add(l1); p2.add(t1);
        p2.add(l2); p2.add(t2);
        p2.add(l3); p2.add(t3);
        p2.add(l4); p2.add(t4);
        p2.setLayout(new GridLayout(4,2));

        p3.add(l5); p3.add(r1); p3.add(r2);
        p3.setLayout(new GridLayout(1,3));

        p4.add(l6); p4.add(c1); p4.add(c2); p4.add(c3);
        p4.setLayout(new GridLayout(1,4));

        p5.add(b1); p5.add(b2);
        p5.setLayout(new GridLayout(1,2));

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);

         setVisible(true);
         setSize(500,500);
         setLayout(new GridLayout(5,1));




    }
    public static void main(String arg[])
    {
        Slip30A ob = new Slip30A();
    }
}
