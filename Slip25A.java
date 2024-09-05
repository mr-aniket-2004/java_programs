
import java.util.*;

public class Slip25A {
    public static void main(String[] args) {
        System.out.println("enter the string ---");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String original  = str;

        StringBuffer str1 = new StringBuffer(str);
        str1 = str1.reverse();
        str = new String(str1);

        System.out.println("the new string ----"+str);

        if (original.equals(str)) {
            System.out.println("given string is palindrome ");
        }
        else
        {
            System.out.println("given string is not palindrome");
        }

    }
}
