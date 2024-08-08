import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class appletdemo extends Applet implements ActionListener {
    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;

    public void init()
    {
        l1 = new Label("ENTER THE NUMBER : ");
        l2 = new Label("ENTER THE NUMBER : ");
        l3 = new Label("RESULT : ");
        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MULTI");
        b4 = new Button("DIVISION");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);

        add(l1);  add(t1);
        add(l2);  add(t2);
        add(l3);  add(t3);
        add(b1); add(b2); add(b3); add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int r=0;

        if (e.getSource()==b1) {
            r=a+b;
            t3.setText(r+"");
        }

        else if (e.getSource()==b2) {
            r=a-b;
            t3.setText(r+"");
        }
        else if (e.getSource()==b3) {
            r=a*b;
            t3.setText(r+"");
        }
        else if (e.getSource()==b4) {
            r=a/b;
            t3.setText(r+"");
        }
    }
}


/*
<html>
<applet code = "appletdemo" , height="500", width="1000" ></applet>
</html>
 */
