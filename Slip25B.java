import series.*;
import java.util.*;
import java.util.Scanner;
public class Slip25B
{
	public static void main(String arg[])
	{
		fibbo fob= new fibbo();
		fob.fibbo_series(10);
		sqaure sob= new sqaure();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n=sob.funsqu(num);
		System.out.print("\n the sqaure of number : "+n);
		cube cob= new cube();
		int m=cob.funcube(num);
		System.out.print("\n the cube of number : "+m);
	}
}