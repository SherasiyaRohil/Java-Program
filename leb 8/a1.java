abstract class Vegetable{
	String colour ;
	String name ;

	 abstract String disString();
}
class Potato extends Vegetable{

	Potato(String colour , String name){
		super.colour=colour;
		super.name=name;
	}

	String disString(){
		String p = (super.colour+"_"+super.name);
		return p;
	}
}

class Tomato extends Vegetable{

	Tomato(String colour , String name){
		super.colour=colour;
		super.name=name;
	}

	String disString(){
		String p = super.colour+"_"+super.name;
		return p;
	}
}

class Brinjal extends Vegetable{

	Brinjal(String colour , String name){
		super.colour=colour;
		super.name=name;
	}

	String disString(){
		String p = super.colour+"_"+super.name;
		return p;
	}
}


public class a1{
	public static void main(String[] args) {
		Potato p=new Potato("dark_pink" , "potato");
		Tomato t=new Tomato("red" , "tomato");
		Brinjal b=new Brinjal("purple" , "brinjal");

		System.out.println("1. "+p.disString()+"\n2. "+t.disString()+"\n3. "+b.disString());

		
	}
}
