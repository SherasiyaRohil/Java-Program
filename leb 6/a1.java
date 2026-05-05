import java.util.Scanner;

class area_of_cricle
{
	int radius;

	area_of_cricle(int radius)
	{
		this.radius = radius;
	}

	double return_area()
	{
		return radius*radius*3.14 ;
	}

}

public class a1
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter radius of cricle :");
		
		int radius=sc.nextInt();

		area_of_cricle a_1 = new area_of_cricle(radius);

		double value_of_area = a_1.return_area();

		System.out.println("area:"+value_of_area);
	}
}