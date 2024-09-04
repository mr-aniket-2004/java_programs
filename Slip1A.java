import java.io.*;

public class Slip1A {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("Slip1A.txt");
        FileReader fr = new FileReader(args[0]);
        int data = 0;
        char ch ;
        while (data != -1) {
            data = fr.read();
            if (data==-1) {
                break;
            }
            else
            {
                ch = (char)data;
                if (!(ch>='0'&&ch<='9'))
                {
                    fw.write(ch);
                }
                // System.out.print(""+(char)data);
            }
        }
        fw.flush();
        fw.close();
        fr.close();

    }
}
