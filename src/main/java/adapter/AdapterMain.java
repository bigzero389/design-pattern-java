package adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		Print prt = new PrintBanner();
		prt.printWeak("weak print test");
		prt.printStrong("strong print test");

	}

}
