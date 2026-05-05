import java.util.*;
public class a1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		try
		{
			System.out.println("a/b="+sc.nextInt()/sc.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("divided by zero is infinite"+e.toString());
		}    
	}
	
}