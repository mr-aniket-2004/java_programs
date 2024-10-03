public class Slip16B {
    static int cal(int n)
    {
        int num = 0;
        while (n!=0) {
            int temp = n%10;
            num = num +temp;
            n =cal(n/10);
        }
        return num;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("the sum of digit ---"+(cal(n)));
    }
}
