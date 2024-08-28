import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Slip10A extends JFrame implements ActionListener{
    JLabel title,l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    JPanel p1,p2,p3,p4,p5,p6;
    Slip10A(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        b2= new JButton("Clear");
        b3= new JButton("Close");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();

        p1.add(title);
        p1.setLayout(new GridLayout(1,1));

        p2.add(l2); p2.add(t2);  p2.add(l3); p2.add(t3);
        p2.setLayout(new GridLayout(1,4));

        p5.add(l1); p5.add(t1);
        p3.add(l4); p3.add(t4);
        p6.add(l5); p6.add(t5);
        p3.setLayout(new GridLayout(1,2));

        p4.add(b1); p4.add(b2); p4.add(b3);
        p4.setLayout(new GridLayout(1,3));
        p5.setLayout(new GridLayout(1,2));
        p6.setLayout(new GridLayout(1,2));

        setVisible(true);
        setSize(600,200);
        add(p1);
        add(p5);
        add(p2);
        add(p3);
        add(p6);    
        add(p4);
        
        setLayout(new GridLayout(6,1));
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
       

    }

    public void actionPerformed(ActionEvent e)
    {
        int p=0, r=0,n=0,a=0,iamot=0;
        if (e.getSource()==b1) {
            p=Integer.parseInt(t1.getText());
            r=Integer.parseInt(t2.getText());
            n=Integer.parseInt(t3.getText());
            a=p*(1+((r/100)/n))*n*n;
            t4.setText(""+a);
            iamot =a-p;
            t5.setText(""+iamot);

        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        else if (e.getSource()==b3) {
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        

    }

    public static void main(String arg[])
    {
        Slip10A ob = new Slip10A();
    }
}
