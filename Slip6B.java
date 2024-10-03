class NumberIsZero extends Exception {
    NumberIsZero() {
        System.out.println("Number is Zero");
    }
}

public class Slip6B
{

    public static void main(String arg[]) {
        int n = Integer.parseInt(""+arg[0]);
        String s = arg[0];

        try
        {
            if(n == 0)
            {
                throw new NumberIsZero();
            }
            else
            {
                System.out.println("given number is ---"+s);
                int f = Integer.parseInt(s.charAt(0)+"");
                int l = Integer.parseInt(s.charAt(s.length()-1)+"");
                System.out.println("the sum of frist and last digit is ----"+(f+l));
            }
        }
        catch(NumberIsZero e)
        {
            System.out.println("Exception is found in code ");
        }
        finally
        {
            System.out.println("Programe is executed");
        }
    }
}
