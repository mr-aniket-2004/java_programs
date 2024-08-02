import java.awt.*;
import  java.awt.event.*;
import  java.awt.List;

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
    public void actionPerformed
    
}
