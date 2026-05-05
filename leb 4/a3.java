import java.util.Scanner ;

public class a3{

	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number of array you want:");
		int n=sc.nextInt();

		int[] a=new int[n];

		float sum = 0 ;
		float average ;

		for (int i=0 ; i<n ; i++ ) 
		{
			System.out.print("enter value of a["+i+"]:");
			a[i]=sc.nextInt();
		}

		for (int i=n-1; i>=0 ; i-- ) 
		{
			System.out.println("value of a["+i+"]:"+a[i]);
		}
	}
}