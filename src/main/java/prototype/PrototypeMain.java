package prototype;

public class PrototypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager();
		
		Product ulProduct = new UnderlinePen('-');
		Product mbProduct = new MessageBox('*');
		
		mgr.register("small decorator", ulProduct);
		mgr.register("big decorator", mbProduct);
		
		Product p = mgr.create("small decorator");
		p.use("I am a Programmer");
		System.out.println();
		
		p = mgr.create("big decorator");
		p.use("I am a Programmer");

	}

}
