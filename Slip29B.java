class noteligiable extends Exception {
    noteligiable() {
        System.out.println("Candidate is not eligiable for vote");
    }
}
class ArrayIndexOutOfBoundsException extends Exception
{
     ArrayIndexOutOfBoundsException()
    {
        System.out.println("plz enter the argument on command line ");
    }
}

public class Slip29B {
    public static void main(String[] args)  {
        int age = Integer.parseInt(args[0]);
        
        try
        {
            if(age<18)
            {
                throw new noteligiable();
            }
            else
            {
                System.out.println("Candidate is eligiable for voting");
            }
           
        }
        catch(noteligiable e)
        {
            System.out.println("the age must be 18 or above");
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("plz pass the Arguments");
        }
        finally
        {
            System.out.println("Programe run successfully");
        }
        
    }
}
