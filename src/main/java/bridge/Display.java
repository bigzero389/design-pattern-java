package bridge;

public class Display {
	DisplayImpl displayImpl;
	
	public void open(){
		displayImpl.rawOpen();
	}
	
	public void print(){
		displayImpl.rawPrint();
	}
	
	public void close(){
		displayImpl.rawClose();
	}
	
	public final void display(){
		this.open();
		this.print();
		this.close();
	}
	
	public Display(DisplayImpl displayImpl) {
		// TODO Auto-generated constructor stub
		this.displayImpl = displayImpl;
	}

}
