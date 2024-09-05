import java.io.*;

public class Slip26A {

    public static void main( String arg[]) throws Exception
    {
        FileReader fr = new FileReader(arg[0]);
        System.out.println("acciie values of char ---");
        int data = 0;
        while (data !=-1) {
            data = fr.read();
            if (data ==-1) {
                break;
            }
            else
            {
                char ch = (char) data;

                System.out.println(""+ch +"\t"+data);
            }
        }

        fr.close();
    }
}