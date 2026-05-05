import java.util.Scanner;
class User{
	static int users = 0;	
	User(){
		users++;
	}

	void displayUser()
	{
		System.out.println("number of users = "+users);
	}
}
public class a6{
	public static void main(String[] args) {
		User user_1=new User();
		User user_2=new User();
		User user_3=new User();
		User user_4=new User();

		user_1.displayUser();
	}
}