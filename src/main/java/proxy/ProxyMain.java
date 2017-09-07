package proxy;

public class ProxyMain {
	public static void main(String[] args){
		Printable p = new PrinterProxy("Alice");
		System.out.println("Current Name is " + p.getPrinterName());
		p.setPrinterName("Bob");
		System.out.println("Current Name is " + p.getPrinterName());
		p.print("Hello Design Pattern World");
	}
}
