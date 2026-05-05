import java.util.Scanner;
public class a1
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter a word");
		String n=sc.next();

		for (int i=0;i<n.length() ; i++ ) 
		{
			for (int j=0;j<=i ;j++ ) 
			{
				System.out.print(n.charAt(j));
			}
			System.out.println();
		}
	}
}