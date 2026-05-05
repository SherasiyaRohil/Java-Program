import java.util.Scanner;
class Count_of_vowels
{
	Scanner sc=new Scanner(System.in);
	void getSentence()
	{
		String s1="";
		while(!s1.equals("quit"))
		{
			System.out.print("enter a line of your choice :");
			s1 = sc.nextLine();
			s1 = s1.toLowerCase();

			int a=0 , e=0 , i=0 , o=0 , u=0;

			for (int j=0; j<s1.length() ; j++ ) 
			{
				char c = s1.charAt(j);

				if (c=='a') 
				{
					a++;
				}
				else if(c=='e')
				{
					e++;
				}
				else if(c=='i')
				{
					i++;
				}
				else if(c=='o')
				{
					o++;
				}
				else if(c=='u')
				{
					u++;
				}
			}
			if(s1.equals("quit")){
				break;
			}
		System.out.println("number of (a):"+a);
		System.out.println("number of (e):"+e);
		System.out.println("number of (i):"+i);
		System.out.println("number of (o):"+o);
		System.out.println("number of (u):"+u);
		}
	}
}
public class a4
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);

		Count_of_vowels s1=new Count_of_vowels();
		s1.getSentence();
	}
}