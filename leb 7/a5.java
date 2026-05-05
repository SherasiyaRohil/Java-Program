import java.util.Scanner;

final class Height1{
	int height = 10;
}
// class Height2 extends Height1{
// 	int height = 20;
// }

class A{
	final int a = 100;

	// final void disFinal(){
	// 	System.out.println(a);
	// }
}
class B extends A{
	B(){
		//super.a=200;
	}

	void disFinal(){
		System.out.println(a);
	}
}

public class a5{
	public static void main(String[] args) {
		Height1 h1=new Height1();
		//Height2 h2=new Height2();

		A a1=new A();
		//a1.disFinal();
		B b1=new B();
		b1.disFinal();

	}
}
