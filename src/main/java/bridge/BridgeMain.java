package bridge;

public class BridgeMain {
	
	public static void main(String[] args){
		Display d1 = new Display(new StringDisplayImpl("String Display Sample"));
		CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Count String Display Sample"));
		d1.display();
		d2.display();
		d2.multiDisplay(5);
	}
}
