import  java.util.*;
public class Slip11B
{
	public static void main(String arg[])
	{
		//System.out.print("enter first number - ");
		//Scanner n1= new Scanner(System.in);
		//int a= n1.nextInt();
		//System.out.print("enter second number - ");
		//Scanner n2= new Scanner(System.in);
		//int b= n2.nextInt();
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);
		System.out.print("\n 1. ADDITION \n 2. SUBTRACTION \n 3. MULTIPLICATION \n 4. DIVIDETION \n");
		int ch;
		Scanner temp= new Scanner(System.in);
		ch=temp.nextInt();
		float r=0.0f;
		switch(ch)
		{
			case 1: r=a+b;
				   break;
			case 2: r=a-b;
				   break;
			case 3: r=a*b;
				  break;
			case 4: r=a/b;
				 break;
		}
		System.out.print("the result for given expression - "+r);
	}
}