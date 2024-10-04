
import java.io.*;
import java.util.*;
public class Slip5A {
    public static void main(String[] args) {
        // System.out.println("Enter the path of dictonary---");
        // Scanner sc = new Scanner(System.in);
        // String path = sc.nextLine();
        int len = args.length;
        // File file = new File(path);
       for(int i =0;i<len;i++)
       {
            File file = new File(args[i]);
            if (file.exists()) {
                if (file.isFile()) {
                    String str = file.getName();
                    if (str.endsWith(".txt")) {
                        file.delete();
                    }
                    else
                    {
                        System.out.println( "the location---"+file.getAbsolutePath());
                        System.out.println("the size --"+ (file.length()/1024)+"kb");

                    }
                }
            }
       }
    }
}
