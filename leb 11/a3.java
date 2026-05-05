class Product{
	int item ;
	synchronized public void put(int item){
		this.item=item;
		System.out.println("put:"+item);
	}
	synchronized public void get(int item){
		this.item=item;
		System.out.println("get:"+item);
		return item;
	}
}
class Producer Extends Thread{
	Product p1 ;
	Produce(Product p1{
		this.p1=p1;
		start();
	}

	public void run(){
		for (int i =0 ; i<5 ;i++ ) {
			p1.piut
		}
	}
}
class a3{
	public static void main(String[] args) {
		
	}
}