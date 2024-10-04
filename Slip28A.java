import java.util.*;
public class Slip28A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list---");
        int n = sc.nextInt();
        List<String> mylist = new ArrayList<String>();
        for(int i =0;i<n+1;i++)
        {
            String str = sc.nextLine();
            mylist.add(str);
        }


        // for(int i =0;i<n;i++)
        // {
            System.out.println(""+mylist);
        // }
        
        for(int i =0;i<n+1;i++)
        {
            System.out.println(mylist.get(i));
        }
    }
}
