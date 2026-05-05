import java.util.Scanner;
class student{

	int roll_number;
	int id_no;
	String name;
	String course;
	double Enrollment;

}
public class extra1{
	public static void main(String[] args) {
		Scanner = new Scanner(System.in);

		System.out.println("enter number of Student :");
		int number_of_Student=sc.nextInt();

		Student [] Students = new Student[number_of_Student];

		for(int i=0;i<number_of_Student;i++)
		{
			System.out.println("enter id_no of Student"+(i+1)+":");
			int id_no=sc.nextInt();

			System.out.println("enter no of subject registered of Student"+(i+1)+":");
			int no_of_subject_registered=sc.nextInt();
		}
	}
}