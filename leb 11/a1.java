class GoodAfternoon implements Runnable{
	Thread t ;
	GoodAfternoon(){
		t = new Thread(this,"Mythread");
		t.start();
	}
		public void run(){
			try{
				for(int i = 0 ; i<5 ; i++){
				System.out.println("GoodAfternoon");
				Thread.sleep(1000);
				}
			}
			catch(Exception e){
				System.out.println("inside exp"+e.toString());
			}
		}
	}
class a1{
	public static void main(String[] args) {
		new GoodAfternoon();
		try{
			for (int i=0;i<5 ;i++ ) {
				System.out.println("GoodMorning");
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println("inside exp"+e.toString());
		}
	}
}