import java.io.*;
import java.util.*;

class Slip22A{
    public static void main(String arg[])throws Exception{
        int ch=0;
        FileWriter fw;
        String fnm,fnm1;
        File f,f1;

        do{
            System.out.println("1 create a file");
            System.out.println("2 Rename a file");
            System.out.println("3 delete a file");
            System.out.println("4 display a file");
            System.out.println("5 Exit file");

            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch(ch){
                case 1: System.out.println("Enter the File Name");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    fw = new FileWriter(fnm);
                    fw.write("This in file created now");
                    fw.flush();
                    fw.close();
                    break;

                case 2:System.out.println("enter the filename you wish to rename");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    System.out.println("enter the new Filename");
                    sc  =new Scanner(System.in);
                    fnm1  = sc.next();
                    f = new File(fnm);
                    f1 = new File(fnm1);
                    f.renameTo(f1);
                    System.out.println("file renamed");
                    break;

                case 3: System.out.println("enter the filename to delete");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    f = new File(fnm);
                    f.delete();
                    System.out.println("File delteted");
                    break;

                case 4: System.out.println("enter the filename");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    f = new File(fnm);
                    System.out.println("File Path is :"+f.getAbsolutePath());
                    break;
            }
        }while(ch<=4);
    }
}