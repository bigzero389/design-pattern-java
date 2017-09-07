package factory;

public class IDCard extends Product {
	
	public void use(){
		System.out.println(this.getOwner());
	}
}
