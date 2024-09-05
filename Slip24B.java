
import java.io.*;

public class Slip24B {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(args[0]);
        int data = 0;
        char ch;
        int ccount = 0, ncount = 0, cspace = 0;
        while (data != -1) {
            data = fr.read();
            if (data == -1) {
                break;
            } else {
                ch = (char) data;
                if (ch <= '9' && ch >= '0') {
                    ncount = ncount + 1;
                } else if (ch <= 'Z' && ch >= 'A' || ch <= 'z' && ch >= 'a') {
                    ccount = ccount + 1;

                } else if (ch == ' ') {
                    cspace = cspace + 1;
                }

            }

        }
        System.out.println("the count of character "+ccount);
        System.out.println("The count of number "+ncount);
        System.out.println(" the count of space "+cspace);
        fr.close();
    }
}
