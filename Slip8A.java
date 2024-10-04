import java.io.*;
import java.util.*;
public class Slip8A {
    public static void main(String[] args) {
        System.out.println("Enter the path of dictonary---");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                String name[]=file.list();
                for(int i =0 ;i<name.length;i++)
                {
                    // System.out.println(name[i]);
                    String main = name[i];
                    if (main.endsWith(".txt")) {
                        
                        System.out.println(main);
                    }
                }
            }
        }
    }
}
