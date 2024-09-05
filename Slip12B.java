
import  java.util.*;

public class Slip12B {
    public static void main(String[] args) {
        String ar[] = new String[20];
        String result[] = new String[20];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<3; i++)
        {
            String str = sc.nextLine();
            ar[i] = str;
        }

        for(int i = 0; i<3; i++)
        {
           System.out.print("the original string "+ar[i]);
           StringBuffer strb = new StringBuffer(ar[i]);
           strb = strb.reverse();
           System.out.println("\t revser string "+strb);
        }

        for(int i = 2; i>=0; i--)
        {
           System.out.print("\n the revers string array  --"+ar[i]);
          
        }
    }    
}
