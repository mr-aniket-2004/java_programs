public class slip2b
{
	public static void main(String arg[ ])
		{
			String str = arg[0];
			char ch;
			for(int i=0;i<str.length();i++)
				{	
					ch=str.charAt(i);
					if( ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='O'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
						{
							System.out.print("\t"+ch);
						}
				}
		}

}