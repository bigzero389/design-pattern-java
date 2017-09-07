package prototype;

public class MessageBox implements Product{
	
	private char decochar;
	
	public MessageBox(char c) {
		// TODO Auto-generated constructor stub
		this.decochar = c;
	}

	public void use(String s) {
		// TODO Auto-generated method stub
		StringBuffer decoStrBf = new StringBuffer();
		for(int i=0, j=s.length() ; i<j ; i++){
			decoStrBf.append(decochar);
		}
		
		System.out.println(decoStrBf.toString());
		System.out.println(s);
		System.out.println(decoStrBf.toString());
	}

	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone(); 
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		return p;
	}

}
