import java.awt.*;
import java.awt.event.*;

public class Slip14A extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1;
    Frame f1;
    TextArea t;
    Slip14A()
    {
        l1 = new Label("Enter the eno");
        l2 = new Label("enter the ename ");
        l3 = new Label(" enter the salary");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t = new TextArea();
        f1 = new Frame();
        b1 = new Button("click here");
        b1.addActionListener(this); 
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1);
        f1.add(t);
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        f1.setSize(500,500);
        f1.setLayout(new FlowLayout());
        Font f = new Font("Arial",Font.BOLD,30);
        setFont(f);
        f1.setFont(f);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str;
        str = "emp no :" + t1.getText()+"\n Emp name : "+ t2.getText() + "\n salary : "+ t3.getText();
        t.setText(str);
        f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        Slip14A ob= new Slip14A();
    }
}
