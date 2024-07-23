import java.util.*;
class player
{
	int pid;
	String pname;
	int totalrun;
	int innplay;
	int notout;
	static float max=0.0f;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n enter the pid : ");
		pid = sc.nextInt();
		Scanner sc1 =new Scanner(System.in);
		System.out.print("\n enter the pname : ");
		pname = sc1.nextLine();
		System.out.print("\n enter the totalrun : ");
		totalrun = sc.nextInt();
		System.out.print("\n enter the inning play : ");
		innplay = sc.nextInt();
		System.out.print("\n enter the no of not out : ");
		notout = sc.nextInt();
	}
	
	public void display()
	{	
		System.out.print("\n --------------------------------------------------------------------------------");
		System.out.print("\n the player id : "+pid);
		System.out.print("\n the player name : "+pname);
		System.out.print("\n the player totalrun : "+totalrun);
		System.out.print("\n the player inning played : "+innplay);
		System.out.print("\n the player no of not out : "+notout);
		System.out.print("\n --------------------------------------------------------------------------------");
	}
	
	public void avg()
	{
		float cal=0.0f;
		cal = totalrun/innplay;
		System.out.print("\n the Avarage : "+cal);
		
		if (cal>max)
		{
			max=cal;
		}
		//System.out.print("\n the maximum Avarage : "+max);
	}
}
public class Slip7A
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc2 = new Scanner(System.in);
		System.out.print("\n Enter the no of player : ");
		n = sc2.nextInt();
		player P[ ] = new player[50];
		for ( int i=0 ; i<n ; i++)
		{
			P[i] = new player();
			P[i].accept();
		}
		player p[] = new player[50];
		for ( int i=0 ; i<n ; i++)
		{
			P[i].display();
			P[i].avg();
		}
		System.out.print("\n The maximum avarage : "+player.max);
	}
}