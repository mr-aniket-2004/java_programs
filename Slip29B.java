

class noteligiable extends Exception {
    noteligiable() {
        System.out.println("Candidate is not eligiable for vote");
    }
}


public class Slip29B {
    public static void main(String[] args)  {
        
        try
        {   
            if (args.length==0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int age = Integer.parseInt(args[0]);
            if(age<18)
            {
                throw new noteligiable();
            }
            else
            {
                System.out.println("Candidate is eligiable for voting");
            }
           
        }
        catch(ArrayIndexOutOfBoundsException ee)
        {
            System.out.println("plz pass the Arguments");
        }
        catch(noteligiable e)
        {
            System.out.println("the age must be 18 or above");
        }
        finally
        {
            System.out.println("Programe run successfully");
        }
        
    }
}
