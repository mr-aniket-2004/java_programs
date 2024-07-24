
import java.awt.*;
import java.awt.event.*;
public class gui_event extends Frame implements ActionListener {
    Label l,l1;
    TextField t2,t1;
    Button b1;
	int num;
	gui_event()
	{
		l= new Label("Enter the number ");
        t2= new TextField(20);
        l1= new Label("the square :");
        t1= new TextField(20);
        b1= new Button("Square");
		add(l); add(t2);
        add(l1); add(t1);
        add(b1);
		Font f = new Font("Arial" , Font.BOLD, 20);
		setFont(f);
		Color c= Color.red;
		setBackground(c);
		setVisible(true);
		setSize(600,600);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent e)
	{
		int t= Integer.parseInt(t2.getText());
		num = t*t;
		t1.setText("num");
	}
	public static void main(String arg[])
	{
		gui_event ob = new gui_event();
	}
}
