import java.util.Scanner ;

public class a4{

	public static void main (String[]args)
	{


		Scanner sc = new Scanner(System.in);

		System.out.print("enter a line of your choice :");
		String s1 = sc.nextLine();
		int a = s1.length();

		for (int i=a/2; i< a ; i++ ) 
		{
			System.out.print(s1.charAt(i));
		}
	}
}