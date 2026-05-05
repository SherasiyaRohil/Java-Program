import java.util.Scanner;
class additionH{
	double height;

	additionH(double height){
		System.out.println("parent class....");
		this.height=height;
	}//constructor

	void display(){//method overriding
		System.out.println("parent height:"+height);
	}

	void parentMethod(){
		System.out.println("inside parents method called by child object....");
	}
}//parent class

class additionL extends additionH{
	double length;
	double height;

	additionL(double length , double height , double height2){
		super(height2);
		System.out.println("child class....");
		this.length=length;
		this.height=height;
	}//constructor

	void display(){
		super.display();
		System.out.println("parent class height:"+super.height+"\nchild class height:"+height+"\naddition with heigth of chlid:"+(length+height)+"\naddition with heigth of parent:"+(length+super.height));
	}

}

public class a4{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("enter length , height and height2:");
		additionL A1 = new additionL(sc.nextDouble() , sc.nextDouble() , sc.nextDouble());

		A1.display();
		A1.parentMethod();
		
	}
}