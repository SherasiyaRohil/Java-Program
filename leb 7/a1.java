import java.util.Scanner;

class Student{
	Scanner sc = new Scanner(System.in);

	int id_no;
	int no_of_subject_registered;
	String[] subject_code;
	int[] subject_credits ;
	String[] grade_obtained;
	double spi ;
	int [] subject_grade_to_number ; 
	double total_credit;
	double total_points_obtained;

	Student(int id_no,int no_of_subject_registered,String[] subject_code,int[] subject_credits,String[] grade_obtained){
		this.id_no=id_no;
		this.no_of_subject_registered=no_of_subject_registered;
		this.subject_code=subject_code;
		this.subject_credits=subject_credits;
		this.grade_obtained=grade_obtained;
	}
	void gradetoNumber()
	{
		subject_grade_to_number=new int[this.no_of_subject_registered];
		for (int j = 0 ; j < no_of_subject_registered ; j++ ) {

			if ( (grade_obtained[j].equals("a") ) || grade_obtained[j].equals("A")) 
			{
				this.subject_grade_to_number [j] = 10 ;
			}
			else if ( grade_obtained[j].equals("b") || (grade_obtained[j].equals("B") ) ) 
			{
				this.subject_grade_to_number[j] = 8 ;				
			}
			else if ( grade_obtained[j].equals("c") || (grade_obtained[j].equals("C") ) ) 
			{
				this.subject_grade_to_number[j] = 4 ;
			}
			else if ( grade_obtained[j].equals("d") || (grade_obtained[j].equals("D") ) ) 
			{
				this.subject_grade_to_number[j] = 2 ;
			}
			else if ( grade_obtained[j].equals("e") || (grade_obtained[j].equals("E") ) ) 
			{
				this.subject_grade_to_number[j] = 0 ;
			}

		}
	}

	void totalCredit_and_points_obtained()
	{
		for (int i = 0 ; i < no_of_subject_registered ; i++ ) 
		{
			this.total_credit += this.subject_credits[i]; // total credits
			this.total_points_obtained +=this.subject_credits[i]*this.subject_grade_to_number[i] ; // total points grained for credits

		}
	}

	void sPI(){
		this.spi = (this.total_points_obtained)/(this.total_credit);
	}

	void displaySPI_and_id_no(){
		System.out.println();
		System.out.println("Id no :"+(this.id_no));
		System.out.println("SPI :"+(this.spi));
	}
}


public class a1{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of Student :");
		int number_of_Student=sc.nextInt();

		Student [] Students = new Student[number_of_Student];

		for(int i=0;i<number_of_Student;i++)
		{
			System.out.println("enter id_no of Student"+(i+1)+":");
			int id_no=sc.nextInt();

			System.out.println("enter no of subject registered of Student"+(i+1)+":");
			int no_of_subject_registered=sc.nextInt();

			String[] subject_code=new String[no_of_subject_registered];

			int[] subject_credits=new int[no_of_subject_registered];

			String[] grade_obtained=new String[no_of_subject_registered];

			for(int j=0;j<no_of_subject_registered;j++)
			{	
				System.out.println("enter subject code of subject"+(j+1)+":");
				subject_code[j]=sc.next();

				System.out.println("enter subject credits of subject"+(j+1)+":");
				subject_credits[j]=sc.nextInt();

				System.out.println("enter grade obtained of subject"+(j+1)+":");
				grade_obtained[j]=sc.next();
			}

			Students[i]=new Student(id_no,no_of_subject_registered,subject_code,subject_credits,grade_obtained);
			
			// calling gradetonumber method for convert grade to number
			Students[i].gradetoNumber();
			Students[i].totalCredit_and_points_obtained();
			Students[i].sPI();
		}

		// display spi and id no 
		for (int i = 0 ; i < number_of_Student ; i++ ) 
		{
			Students[i].displaySPI_and_id_no();
		}

	}//psvm

}//a1