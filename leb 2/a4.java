import java.util.Scanner;
public class a4
{
	public static void main (String[]args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter fahrenheit:");
		float f = sc.nextFloat();

		float c = ((f-32)*5)/9;

		System.out.println("celcius="+c);

		System.out.println("enter celcius:");
		float x = sc.nextFloat();

		float y = ((9*c)/5)+32 ;
		System.out.println("celcius="+y);
	}
}