public class Slip14B {
    static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n * power(n, p - 1);
        }
    }

    public static void main(String arg[]) {
        int n = Integer.parseInt(arg[0]) ;
        int p = Integer.parseInt(arg[1])  ;
        System.out.println("the power of given number --" + (power(n, p)));
    }
}
