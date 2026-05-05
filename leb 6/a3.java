import java.util.Scanner;

class bank_account{
	double account_no ;
	String user_name;
	String email ;
	String account_type ;
	double account_balance ;

	void getAccountdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter account number of your choice :");
		account_no=sc.nextDouble();
		sc.nextLine();
		System.out.print("enter user name :");
		user_name=sc.nextLine();

		System.out.print("enter email :");
		email=sc.next();

		System.out.print("enter account type (saving or current) :");
		account_type=sc.next();

		System.out.print("enter account balance (minium 2000):");
		account_balance=sc.nextDouble();
	}
	void displayAccountdetails()
	{
		System.out.println("account number of your choice :"+account_no);
		System.out.println("user name :"+user_name);
		System.out.println("email :"+email);
		System.out.println("account type:"+account_type);
		System.out.println("account_balance:"+account_balance);
	}
}

public class a3{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);

		bank_account customer_1 = new bank_account();
		bank_account customer_2 = new bank_account();

		customer_1.getAccountdetails();
		customer_2.getAccountdetails();

		customer_1.displayAccountdetails();
		customer_2.displayAccountdetails();	
	}
}