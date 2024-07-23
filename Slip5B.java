import  java.util.*;
public class Slip5B
{
	public static void main(String arg[])
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<=n;j++)
			{
				int ch = j;
				System.out.print("  "+ch);
			}
			System.out.print("\n");
		}
	}
}