import java.util.*;
public class a4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		try
		{
			System.out.println("enter value for a :");
			int a =sc.nextInt();
			System.out.println("enter value for b :");
			int b = sc.nextInt();

			if(b==0){
				throw ArithmeticException("");
			} 
		}
		catch(NumberFormateException e)
		{
			System.out.println(""+e.toString());
		}
		catch(ArithmeticException e)
		{
			System.out.println(""+e.toString());
		}    
	}
	
}