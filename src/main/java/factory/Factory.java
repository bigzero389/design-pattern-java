package factory;

public abstract class Factory {
	
	public Product create(String owner){
		return createProduct(owner);		
	};
	
	abstract Product createProduct(String owner);
	
	abstract void registerProduct(Product Product);
	
	//Ȯ��
	abstract Product getProduct(String owner);
}
