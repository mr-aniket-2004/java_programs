import  java.util.*;
class product
{
	int pid ;
	String pname;
	int price;
	int qty;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the product id : ");
		pid=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("\nEnter the product name : ");
		pname= sc1.nextLine();
		System.out.print("\nEnter the product price : ");
		price=sc.nextInt();
		System.out.print("\nEnter the product quantity: ");
		qty=sc.nextInt();
		
	}
	public void display()
	{
		System.out.print("\n The product id :"+pid);
		System.out.print("\n The product name :"+pname);
		System.out.print("\n The product price :"+price);
		System.out.print("\n The product quantity :"+qty);
	}
	public void calculate()
	{
		System.out.print("\n The total price of product : "+(price*qty));
		System.out.print("\n___________________________________");
	}
}

public class Slip17A
{
	public static void main(String arg[])
	{
		product p[] = new product[10];
		System.out.print("\n Enter the no of product : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i = 0; i < n ; i++)
		{
			p[i] = new product();
			p[i].accept();
		}
		for ( int i = 0; i < n ; i++)
		{
			p[i] .display();
			p[i].calculate();
		}
	}
}