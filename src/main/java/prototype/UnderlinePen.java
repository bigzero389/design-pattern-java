package prototype;

public class UnderlinePen implements Product {
	
	private char ulchar;
	
	public UnderlinePen(char c) {
		// TODO Auto-generated constructor stub
		this.ulchar = c;
	}
	
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		return p;
	}


	public void use(String s) {
		System.out.println(s);
		for(int i=0 , j=s.length() ; i<j ; i++){
			System.out.print(ulchar);
		}
	}

}
