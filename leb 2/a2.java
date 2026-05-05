import java.util.Scanner ; 
public class a2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number A:");
		int a = sc.nextInt();

		System.out.println("enter a number B:");
		int b = sc.nextInt();

		sc.nextLine();
		System.out.println("enter the symbol:");
		String c = sc.nextLine();

		if (c.equals("+")) 
		{
			System.out.println("sum:"+(a+b));
		}
		else if (c.equals("-")) 
		{
			System.out.println("subtraction:"+(a-b));
		}
		else if (c.equals("*")) 
		{
			System.out.println("multiplication:"+(a*b));
		}
		else if (c.equals("/")) 
		{
			System.out.println("division:"+(a/b));
		}
		else{
			System.out.println("invalid input");
		}
	}
}