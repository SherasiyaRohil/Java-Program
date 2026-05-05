import java.util.Scanner;
class User
{
	static int count;
	static int b;
	  User(int b, int count)
	{
		this.b=b;
		this.count = count;
		System.out.println(b);
	}
	static void displayUser()
	{
		System.out.println("b="+b);
		//User.count;
		System.out.println("static v/s this:"+count);
	}
}
public class a7
{
	 public static void main(String[] args) 
	{
		User a1=new User(10,20);
		

		a1.displayUser();

	}
}