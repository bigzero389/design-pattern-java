package proxy;

public class Printer implements Printable {
	private String name;
	
	private void heavyJob(String msg){
		System.out.println(msg);
		for(int i=0,j=5 ; i<j ; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println();
	}
	
	public Printer() {
		// TODO Auto-generated constructor stub
		heavyJob("Creating Printer Instance");
	}
	
	public Printer(String name){
		this.name = name;
		heavyJob("Creating " + name + " Printer Instance");
	}
	
	public void setPrinterName(String name){
		this.name = name;
	}
	
	public String getPrinterName(){
		return this.name;
	}
	
	public void print(String string){
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
}
