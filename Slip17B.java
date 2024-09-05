
public class Slip17B {
    public static void main(String args[]) {
        int arr[] = new int[20];
        int len = args.length;
        int count =0;
        for(int i =0;i<len;i++)
        {

            int result =0;
            int temp = Integer.parseInt(args[i]) ;
            int original = temp;
            while (temp>0) {
                int num = temp%10;
                result = result+(num*num*num);
                temp = temp /10;
                
            }
            if (original==result && result>=153 ) {
                
                arr[count]= original;
                count++;
            }
        }

        for(int i =0;i<count;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
