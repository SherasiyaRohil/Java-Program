import java.util.Scanner ;

public class a2{

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
			sum+=a[i];
		}

		average = sum/n ;

		System.out.println("average of numbers :"+average);
	}
}