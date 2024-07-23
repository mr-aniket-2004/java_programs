public class Slip4b
{
	public static void main(String arg[])
		{
			String str = arg[0];
			char ch;
			for (int i=0;i<str.length();i+=2)
				{
					ch=str.charAt(i);
					System.out.print(""+ch);
					
				}
		}
}