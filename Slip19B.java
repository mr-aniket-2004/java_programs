import java.util.*;

import series.fibbo;

public class Slip19B {
    public void fibo(int n)
        {
            int a=0,b=1,c;
            System.out.print(a);
            System.out.print("\t"+b);
            for(int i =2;i<=n;i++)
            {
                c= a+b;
                System.out.print("\t"+c);
                a=b;
                b=c;
            }

        }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of series: ");
        n = sc.nextInt();
        Slip19B ob = new Slip19B();
        ob.fibo(n);
        
        


    }
    
}
