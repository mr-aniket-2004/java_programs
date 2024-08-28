import java.util.*;

public class Slip3B {
    public static void main(String[] args) {
        // static int temp = 0;
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num = sc.nextInt();
        int original =num;
        while (num!=0) {
            int t = num%10;
             result = result+(t*t*t);
            num = num/10;
        }
        if (result==original) {
            System.out.println("GIVEN NUMBER IS AMSTRONG NUMBER");
        }
        else
        {
            System.out.println("GIVEN NUMBER IS NOT AMSTRONG NUMBER");   
        }

    }
}
