package factory;

public abstract class Factory {
	
	public Product create(String owner){
		return createProduct(owner);		
	};
	
	abstract Product createProduct(String owner);
	
	abstract void registerProduct(Product Product);
	
	//»Æ¿Â
	abstract Product getProduct(String owner);
}
