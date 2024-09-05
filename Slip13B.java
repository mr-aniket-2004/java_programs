
import java.util.*;

public class Slip13B {
    public static void main(String[] args) {
        System.out.println("enter the size of array ----");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[20];
        System.out.println("enter the numbers ");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i]=temp;
        }
        System.out.println("ORIGINAL STRING ");
        for( int i = 0;i<n;i++){
            System.out.print("\t "+arr[i]);
        }
        System.out.print("\n");
        System.out.println("REVERSE STRING ");
        for( int i = n-1;i>=0;i--){
            System.out.print("\t"+arr[i]);
        }
    }
}