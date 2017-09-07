package template;

public class StringDisplay extends AbstractDisplay {
	int defaultSimbolCnt = 5;
	char defaultSimbol = '*';
	String printStr;
	
	public void open(){
		printLine();		
	}
	
	public void close(){
		printLine();
	}
	
	public void print(){
		System.out.println(printAster(defaultSimbolCnt) + printStr + printAster(defaultSimbolCnt));
	}
	
	public void printLine(){
		System.out.println(printAster(defaultSimbolCnt*2 + printStr.length()));
	}
	
	StringDisplay(String printStr){
		this.printStr = printStr;
	}
	
	private String printAster(int cnt){
		StringBuffer srtbuf = new StringBuffer();
		for(int i=0,j=cnt ; i<j ; i++){
			srtbuf.append(defaultSimbol);
		}
		return srtbuf.toString();
	}

}
