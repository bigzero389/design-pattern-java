package bridge;

public class StringDisplayImpl extends DisplayImpl {
	private String string;
	private int width;
	
	public StringDisplayImpl(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
		this.width = string.getBytes().length;
	}
	
	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		printLine();
		
	}
	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		System.out.println("|" + string + "|");
		
	}
	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		printLine();
	}
	
	public void printLine(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("+");
		for(int i=0,j=width ; i<j ; i++){
			buffer.append("-");
		}
		buffer.append("+");
		System.out.println(buffer.toString());
	}
}
