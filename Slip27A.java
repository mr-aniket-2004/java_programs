class greaterThan extends Exception
{
    greaterThan()
    {
        System.out.println("Given number is out of Range");
    }
}


public class Slip27A {
    static int n ;
    public static void main(String[] args) {
        n = Integer.parseInt(args[0]);
        try
        {
            if (n>1000) {
                throw new greaterThan();
            }
            else
            {
                for(int i =1; i<=n;i++)
                {
                    if (n%i==0) {
                        System.out.println("\t"+i);
                    }
                }
            }
        }
        catch(greaterThan e)
        {
            System.out.println("The Number Must be less than 1000");
        }
        finally
        {
            System.out.println("the programe Executed");
        }
    }
}
