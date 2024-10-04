class panvalid extends Exception
{
    panvalid()
    {
        System.out.println("given pan no is not valid");
    }
}

class mobilevalid extends Exception
{
    mobilevalid()
    {
        System.out.println("Given Mobile no is not valid");
    }
}

public class Slip9A {
    public static void main(String[] args) {
        int f =0;
        String pno = args[0];
        String mno = args[1];
        try
        {
            if (pno.length()!=10) {
                throw new panvalid();
            }
            if (mno.length()==10) {
                f =1;
                for (int i =0;i<mno.length();i++)
                {
                    if (mno.charAt(i)>='0'&& mno.charAt(i)<='9') {
                        f=1;
                    }
                    else
                    {
                        f=0;
                        break;
                    }
                }
            }
            if (f==0) {
                throw new mobilevalid();
            }
            else
            {
                System.out.println("MOBILE NO---"+mno);
                System.out.println("PAN NO --"+ pno);
            }
            // else
            // {
            //     System.out.println("PAN NO ---" + pno);
            //     System.out.println("MOBILE NO ---" + mno);
            // }
        }
        catch(mobilevalid e)
        {
            System.out.println("found error in mobile no");
        }
        catch(panvalid e)
        {
            System.out.println("found error in pan no ");
        }
        finally
        {
            System.out.println("This programe is completed");
        }

    }
}
