import  java.util.*;
public class Slip18A
{
	public void area(float r,float pi)
	{
		System.out.print("\n the area of circle : "+(pi*r*r));
	}
	public void area(int b,int h)
	{
		System.out.print("\n the area of triangle : "+((b*h)/2));
	}
	// public void area(float s)
	// {
	
	// 	System.out.print("\n the area of square : "+(s*s));
	// }
	public void area(int b, float l)
	{
		System.out.print("\n the area of rectangle : "+(l*b));
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nenter the redius of circle - ");
		float r= sc.nextFloat();
		System.out.print("\nenter the pi of circle - ");
		float pi = sc.nextFloat();
		Slip18A ob = new Slip18A();
		ob.area(r,pi);

		
		System.out.print("\nenter the height of triangle- ");
		int h= sc.nextInt();
		System.out.print("\nenter the base of triangle- ");
		int b= sc.nextInt();
		ob.area(b,h);


		System.out.print("\nenter the length of rectangle- ");
		 float l= sc.nextFloat();
		System.out.print("\nenter the breadth of rectangle -  ");
		int c= sc.nextInt();
		ob.area(c,l);

	}
}