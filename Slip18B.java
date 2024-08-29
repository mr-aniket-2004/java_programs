import java.io.*;

public class Slip18B {
    public static void main(String arg[]) throws Exception
    {
        FileWriter w = new FileWriter("Slip18B.txt");
        FileReader r = new FileReader(arg[0]);
        int data =0;
        char ch;
        while (data!=0) {
            data = r.read();
            if (data ==-1) {
                break;
            }
            else
            {
                ch = (char)data;
                System.out.print(""+ch);
            }
        }
        r.close();
        w.close();

    }
}
