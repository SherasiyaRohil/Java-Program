import java.util.Scanner;
class Member{
	String Name ;
	int Age;
	double Phone_Number;
	String Address;
	double Salary;

	Member(String Name , int Age , double Phone_Number , String Address , double Salary){
		this.Name=Name;
		this.Age=Age;
		this.Phone_Number=Phone_Number;
		this.Address=Address;
		this.Salary=Salary;
	}//constructor


}//parent class

class Manager extends Member{
	String Department ;

	Manager(String Department ,String Name , int Age , double Phone_Number , String Address , double Salary ){
		super(Name ,Age , Phone_Number , Address , Salary);
		this.Department=Department;

	}//constructor

	void details(){
		System.out.println("\ndetails of Manager\nName :"+Name+"\nDepartment :"+Department+"\nAge :"+Age+"\nPhone Number :"+Phone_Number+"\nAddress :"+Address+"\nsalary :"+Salary);
	}

}//child 1 Manager

class Employee extends Member{
	String Specialization ;

	Employee(String Specialization , String Name , int Age , double Phone_Number , String Address , double Salary){
		super(Name ,Age , Phone_Number , Address , Salary);
		this.Specialization=Specialization;

	}//constructor

	void details(){
		System.out.println("\ndetails of Employee\nName :"+Name+"\nSpecialization :"+Specialization+"\nAge :"+Age+"\nPhone Number :"+Phone_Number+"\nAddress :"+Address+"\nsalary :"+Salary);
	}
}//child 2 employee

public class a3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking details of employee
		System.out.println("Enter the Name of Employee :");
		String Name = sc.nextLine();

		System.out.println("Enter the Age of Employee :");
		int Age = sc.nextInt();

		System.out.println("Enter the Phone Number of Employee :");
		double Phone_Number = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter the Address of Employee :");
		String Address = sc.nextLine();

		System.out.println("Enter the salary of Employee :");
		double Salary = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter the specialization of Employee :");
		String Specialization =sc.nextLine();

		//object of employee
		Employee employee_1=new Employee(Specialization,Name ,Age , Phone_Number , Address , Salary);


		//taking details of manager
		System.out.println("Enter the Name of Manager :");
		Name = sc.nextLine();

		System.out.println("Enter the Age of Manager :");
		Age = sc.nextInt();

		System.out.println("Enter the Phone Number of Manager :");
		Phone_Number = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter the Address of Manager :");
		Address = sc.nextLine();

		System.out.println("Enter the salary of Manager :");
		Salary = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter the Department of Manager :");
		String Department = sc.nextLine();

		//object of manager
		Manager manager_1=new Manager(Department ,Name ,Age , Phone_Number , Address , Salary);

		employee_1.details();
		manager_1.details();

		scanner.close();

	}
}