package prototype;

import java.util.Hashtable;

public class Manager {
	
	public Hashtable<String,Product> showcase = new Hashtable<String,Product>();
	
	public void register(String productKey, Product product){
		showcase.put(productKey, product);
	}
	
	public Product create(String productKey){
		return showcase.get(productKey).createClone();
	}

}
