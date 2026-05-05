interface Transport{
	void deliver();
}
abstract class Animal{
	void timePass();
}
class Camel extends Animal implements Transport{

}
class Donkey extends Animal implements Transport{

}
class Tiger extends Animal{

}
class Deer extends Animal{

}

public class a3{
	public static void main(String[] args) {
		Animal []animal=new Animal[4];

		animal[0]=new Camel();
		animal[1]=new Donkey();
		animal[2]=new Tiger();
		animal[3]=new Deer();


		for (int i = 0 ; i < 4 ; i++ ) {
			if (animal[i]instanceof Transport){
				((Transport)animal[i]).deliver();
			}
			else{
				animal[i].timePass();
			}
		}
	}
}