import java.io.*;
import java.util.*;
public class FileDemo {
    public static void main(String arg[]) throws Exception
    {
        FileWriter fw = new FileWriter(arg[0],true);
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        fw.write(s);
        fw.flush();
        fw.close();


        FileReader fr = new FileReader(arg[0]);
        int data = 0;
        while (data!=-1) {
            data=fr.read();
            if (data==-1) {
                break;
                
            }
            else
                System.out.print(""+(char)data);
            
        }

    }
}
