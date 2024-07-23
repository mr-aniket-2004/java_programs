package series;
public class fibbo
{
	public void fibbo_series( int a)
	{
		int n1=0;
		int n2=1;
		int sum;
		System.out.print("\n "+n1);
		System.out.print(" "+n2);
		for (int i=2;i<a;i++)
		{
			sum = n1+n2;
			System.out.print(" " +sum);
			n1=n2;
			n2=sum;
		}
	}
}