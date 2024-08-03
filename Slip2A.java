import java.awt.*;
import java.awt.event.*;

public class Slip2A extends Frame implements  MouseListener , MouseMotionListener{
    TextField t1;
    Slip2A()
    {
        t1 = new TextField(40);
        Font f = new Font("Arial", Font.BOLD,30);
        setFont(f);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        add(t1);
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public  void mouseClicked(MouseEvent e)
    {
        t1.setText("X : "+e.getX()+ "Y : "+e.getY());
    }
    public  void mouseMoved(MouseEvent e)
    {
        t1.setText("X : "+e.getX()+ "Y : "+e.getY());
    }
    public  void mousePressed(MouseEvent e){}
    public  void mouseExited(MouseEvent e){}
    public  void mouseEntered(MouseEvent e){}
    public  void mouseReleased(MouseEvent e){}
    public  void mouseDragged(MouseEvent e){}

    public  static  void main(String arg[])
    {
        Slip2A ob = new Slip2A();
    }
    
}