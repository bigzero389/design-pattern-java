package template;

public class CharDisplay extends AbstractDisplay {
	
	public void open(){
		System.out.print("<<");		
	}
	
	public void print(){
		for(int i=0,j=5 ; i<j ; i++){
			System.out.print('C');
		}
	}
	
	public void close(){
		System.out.print(">>");
		System.out.println();
	}

}
