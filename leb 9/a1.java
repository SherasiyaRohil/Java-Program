interface EventListener{
	public void performEvent();
}
interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}
interface KeyListener extends EventListener{
	public void keyPressed();
	public void keyReleased();
}
class EventDemo implements MouseListener , KeyListener{
	public void performEvent(){
		System.out.println("performEvent");
	}
	public void mouseClicked(){
		System.out.println("mouseClicked");
	}
	public void mousePressed(){
		System.out.println("mousePressed");
	}
	public void mouseReleased(){
		System.out.println("mouseReleased");
	}
	public void mouseMoved(){
		System.out.println("mouseMoved");
	}
	public void mouseDragged(){
		System.out.println("mouseDragged");
	}
	public void keyPressed(){
		System.out.println("keyPressed");
	}
	public void keyReleased(){
		System.out.println("keyReleased");
	}
}
public class a1{
	public static void main(String[] args) {
		EventDemo eb=new EventDemo();
		eb.performEvent();
		eb.mouseClicked();
		eb.mousePressed();
		eb.mouseReleased();
		eb.mouseMoved();
		eb.mouseDragged();
		eb.keyPressed();
		eb.keyReleased();
	}
}