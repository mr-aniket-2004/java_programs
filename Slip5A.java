import java.util.*;

public class Slip5A  {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int m=0;
        int a[][]= new int[50][50];
        System.out.print("enter the size ROWS: ");
        n = sc.nextInt();
        System.out.print("enter the size COLUME : ");
        m = sc.nextInt();
        for(int i =0 ;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                a[i][j]= sc.nextInt();
                // break;
            }
        }

        System.out.print("ORIGINAL MATRIX :\n");
        for(int i =0 ;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("\t "+ a[i][j]);
                // break;
            }
            System.out.print("\n");
        }

        System.out.print("\n AFTER TRANSPOSE MATRIX\n");

        for(int i =0 ;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("\t "+ a[j][i]);
                // break;
            }
            System.out.print("\n");
        }
    }
}
