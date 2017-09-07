package factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		Product product;
		for(int i=0, j=15 ; i<j ; i++){
			product = factory.create(String.valueOf(i));
			product.use();
		}
		
		System.out.println(factory.getProduct("1") != null ? factory.getProduct("1").getOwner() : "");
		System.out.println(factory.getProduct("5") != null ? factory.getProduct("5").getOwner() : "");
		System.out.println(factory.getProduct("100") != null ? factory.getProduct("100").getOwner() : "");

	}

}
