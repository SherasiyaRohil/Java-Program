import java.util.Scanner ; 
public class a3
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter length of rectangle:");
		int length= sc.nextInt();

		System.out.println("enter width of rectangle:");
		int width= sc.nextInt();

		int area = width*length ;

		System.out.println("area of rectangle:"+area)
		;
	}
}