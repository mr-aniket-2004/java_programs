import java.util.*;

public class Slip16A {
    static int n =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n =0;
        System.out.println("enter the Size of array---");
        n = sc.nextInt();
        String name[] = new String[n+1];
        System.out.println("enter the names of emp ---");
        for(int i =0;i<=n;i++)
        {
            String str = sc.nextLine();
            name[i]=str;
        }
        System.out.println("Original Array----");
        for(int i=0;i<=n;i++)
        {
            System.out.println(""+name[i]);
        }
        Arrays.sort(name);
        System.out.println("Sort Array----");
        for(int i=0;i<=n;i++)
        {
            System.out.println(""+name[i]);
        }
    }
}
