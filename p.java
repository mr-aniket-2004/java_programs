public class p{
    static int sum(int n)
    {
        int result =0;
       while (n>0) {
        int t= n%10;
        result = result+t;
        n =sum(n/10);
       }
       return result;

    }
    public static void main(String arg[])
    {
        System.out.print(""+(sum(25)));
    }
}