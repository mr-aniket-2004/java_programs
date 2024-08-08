import java.util.*;

public class Slip15B {
    public static void main(String arg[])
    {
        int temp=0;
        Scanner sc = new Scanner(System.in);
        String ar[]= new String[50];
        for(int i =0 ;i<3;i++){

            ar[i]=sc.nextLine();
        }

        // for(int i =0 ;i<3;i++){

        //     System.out.print("\t"+ar[i]);
        // }
        System.out.println("enter the name you find");
        String f = sc.nextLine();
        for(int i =0 ;i<3;i++){

            if (ar[i].equals(f))
            {
                System.out.println(i);
                temp++;
            }
        }
        if (temp==0)
        {
            System.out.println("name not found");
        }
        

    }
}
