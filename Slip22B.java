public class Slip22B {
    static int fact(int n )
    {
        if (n>=1) {
            return n * fact(n-1);
        }
        else
        {
            return 1;
        }
    }  
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ans = fact(n);
        System.out.println("the factorial is ---"+ans);
    }
}
