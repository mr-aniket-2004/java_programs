import java.awt.*;
public class Slip7B extends Frame
{
	Label l;
	Slip7B()
	{
		l= new Label("Dr. D Y Patil College");
		add(l);
		Font f = new Font("Arial" , Font.BOLD, 20);
		setFont(f);
		Color c= Color.red;
		setBackground(c);
		setVisible(true);
		setSize(600,600);
		setLayout(new FlowLayout());
	}
	public static void main(String arg[])
	{
		Slip7B ob = new Slip7B();
	}
}