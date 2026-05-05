import java.util.Scanner;

class time{
	int hour ;
	int min ;
	int sec ;
	time(int hour , int min , int sec){
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	void displaytime(){
		System.out.println(hour+":"+min+":"+sec);
	}
	void addition_of_time(time t2){
		int final_hour=this.hour + t2.hour ;

		int final_min=this.min + t2.min ;

		int final_sec=this.sec + t2.sec;

		if (final_sec>=60) {
			final_min=final_min +1 ;
		}

		if (final_min>=60) {
			final_hour=final_hour+1;
			final_min=final_min - 60;
		}

		System.out.println(final_hour+":"+final_min+":"+final_sec);
	}
}

public class a2
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("t1:enter hours :");
		int hour = sc.nextInt();
		System.out.println("t1:enter min :");
		int min = sc.nextInt();
		System.out.println("t1:enter sec :");
		int sec = sc.nextInt();

		time t1=new time(hour , min , sec);

		t1.displaytime();

		System.out.println("t2:enter hours :");
		hour = sc.nextInt();
		System.out.println("t2:enter min :");
		min = sc.nextInt();
		System.out.println("t2:enter sec :");
		sec = sc.nextInt();

		time t2=new time(hour , min , sec);

		t2.displaytime();

		t1.addition_of_time(t2);
	}
}