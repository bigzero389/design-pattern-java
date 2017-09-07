package flyweight;

public class BigString {
	private BigChar[] bigChars;
	
	public BigString(String string) {
		// TODO Auto-generated constructor stub
		bigChars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for(int i=0,j=bigChars.length ; i<j ; i++){
			bigChars[i] = factory.getBigChar(string.charAt(i));
		}
	}
	
	public void print(){
		for(int i=0,j=bigChars.length ; i<j ; i++){
			bigChars[i].print();
		}
	}

}
