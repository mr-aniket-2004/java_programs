import java.io.*;
import java.util.*;
class Slip23B{
    public static void main(String[] args) throws Exception{
        String fnm;
        File f;
        Scanner sc;
        System.out.println("enter file name to check");
        sc= new Scanner(System.in);
        fnm = sc.next();
        f=new File(fnm);
        if (f.exists()) {
            if (f.isHidden()) {
                System.out.println("file is Hidden");
            }
            else{
                System.out.println("File is not Hidden");
                System.out.println("file path: "+ f.getAbsolutePath());
            }
        }
        else
        System.out.println("file is not present");
    }
}