import java.util.Scanner;
class DarshanUniException extends Exception{
	DarshanUniException(String message){
		super(message);
	}
}
class a3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your university name :");
		String University_Name = sc.next();

		try{
			if (University_Name.equals("darshan")) {
				throw new DarshanUniException(" you are lier you study in other university");
			}

			else{
				System.out.println(" you study in "+University_Name+" university");

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}