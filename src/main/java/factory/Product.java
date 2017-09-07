package factory;

public abstract class Product {
	
	private String owner = "";
	
	public abstract void use();
	
	public String getOwner(){
		return owner;
	}
	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
}
