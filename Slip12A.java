import java.awt.*;
import  java.awt.event.*;

public class Slip12A extends Frame implements ActionListener {
    Label l1;
    TextField t1;
    List lust;
    Button b1;
    Slip12A() {
        l1 = new Label("enter the number :");
        t1 = new  TextField(20);
        lust = new List(20);
        b1 = new  Button("show table");
        b1.addActionListener(this);
        add(l1); add(t1);
        add(b1); 
        add(lust);

        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        Font f = new Font("Arial",Font.BOLD,30);
        setFont(f);

    }
    public void actionPerformed(ActionEvent e)
    {
        int r;
        lust.removeAll();
        int num = Integer.parseInt(t1.getText());
        for (int i =1 ; i<=10 ; i++)
        {
            r= num*i;
            lust.add(num +"*"+i+"="+r);
        }
        t1.setText("");
    }
    public static void main(String[] args) {
        Slip12A ob = new Slip12A();
    }
    
}
