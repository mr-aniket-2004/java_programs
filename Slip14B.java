public class Slip14B {
    public static void main(String arg[])
    {
        int n=2 ,power1 =3;
        int cal(n,power1)
        {
            return n*cal(n,(power1-1));
        }
        int r =cal(n,power1);
    }
}
