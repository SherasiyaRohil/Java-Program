import java.util.Scanner;

public class c8
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  r1 & r2 :");
		int r1=sc.nextInt();
		int r2=sc.nextInt();

		c8 p= new c8();
		p.find(r1,r2);
		
		
	}
	public void find(int a,int b)
	{
		for(int c=a;c<=b;c++)
		{
			boolean flag=true;
			for(int i=2;i<c;i++)
			{
				if(c%i==0)
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println("prime :"+c);
			}
			else
			{
				System.out.println("not prime :"+c);
			}
			
		}
		
	}
}
