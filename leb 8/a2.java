interface A{
	final int a = 0;
	public void disA();
}
interface A1 extends A{
	final int a1 = 1;
	public void disA1();
}
interface A2_0 extends A{
	final int a2 = 2;
	public void disA2();
}
interface A12 extends A1,A2_0{
	final int a12 = 12;
	public void disA12();
}
class B implements A12{
	public void disA(){
		System.out.println("interface A : int = "+a);
	}
	public void disA1(){
		System.out.println("interface A1 : int = "+a1);
	}
	public void disA2(){
		System.out.println("interface A2 : int = "+a2);
	}
	public void disA12(){
		System.out.println("interface A12 : int = "+a12);
	}
}

public class a2{
	public static void main(String[] args) {
		B b=new B();
		b.disA();
		b.disA1();
		b.disA2();
		b.disA12();
	}
}