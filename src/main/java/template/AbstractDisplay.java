package template;

public abstract class AbstractDisplay {
	
	public abstract void open();
	
	public abstract void print();
	
	public abstract void close();
	
	public void display(){
		if(this != null){
			this.open();
			this.print();
			this.close();
		}		
	};

}
