package chainofResponsibility;

public class ChainonResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Support alice = new NoSupport("Alice"); 
		Support bob = new LimitSupport("Bob",100);
		Support elmo = new OddSupport("Elmo");
		Support charlie = new SpecialSupport("Charlie", 150);
		Support diana = new LimitSupport("Diana",200);
		Support fred = new LimitSupport("Fred",300);
		
		alice.setNext(bob).setNext(elmo).setNext(charlie).setNext(diana).setNext(fred);
		
		for(int i=0,j=500 ; i<j ; i+=33){
			alice.support(new Trouble(i));
		}
	}
}
