package proxy;

public class PrinterProxy implements Printable {
	private String name;
	private Printer realPrinter;
	
	public PrinterProxy(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public synchronized void setPrinterName(String name){
		if(realPrinter != null){
			realPrinter.setPrinterName(name);
		}
		this.name = name;
	}
	
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public void print(String string) {
		// TODO Auto-generated method stub
		realizePrinter();
		realPrinter.print(string);
	}
	
	private synchronized void realizePrinter(){
		if(realPrinter == null){
			realPrinter = new Printer(name);
		}
	}
}
