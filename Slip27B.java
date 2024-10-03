import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Slip27B extends Frame implements ActionListener
{
    List l ;
    Label l1;
    TextField t1;
    Button b1;
    Slip27B()
    {
        l = new List();
        l1 = new Label("Enter the Dictory Name :");
        t1 = new TextField(20);
        b1 = new Button("Click");
        add(l1); add(t1);
        add(l); add(b1);
        b1.addActionListener(this);
        Font f = new Font("Arial",Font.BOLD,20);
        setFont(f);
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(2,2));

    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            l.removeAll();
            File file= new File(t1.getText());
            if (file.exists()) {
                if (file.isDirectory()) {
                    String name[]= file.list();
                    for(int i =0;i<name.length;i++)
                    {
                        l.add(name[i]);
                    }
                }    
            }
        }
        catch(Exception ee){}
    }

    public static void main(String[] args) {
        Slip27B ob = new Slip27B();
    }
}