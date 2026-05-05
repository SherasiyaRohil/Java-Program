import java.util.Scanner;
public class a2{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of lines :");
		int n=sc.nextInt();

		for (int i=1; i<=n ; i++ ) 
		{
			for (int j=1;j<=i ;j++ ) 
			{
				for (int k=1;k<=n-i ;k++ ) 
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i=n-1; i>=1 ; i-- ) 
		{
			for (int j=i;j>=1 ;j--)
			{
				for (int k=1;k<=n-i ;k++ ) 
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// for (space = 1; space <= (rows + 1) / 2 - i; space++) {
//             printf("  ")