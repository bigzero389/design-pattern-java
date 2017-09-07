package factory;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
	List<IDCard> owners = new ArrayList<IDCard>();;
	
	
	@Override
	Product createProduct(String owner){
		IDCard idCard = new IDCard();
		idCard.setOwner(owner);
		registerProduct(idCard);

		return idCard;
	}

	@Override
	void registerProduct(Product product) {
		owners.add((IDCard)product);
	}

	//»Æ¿Â
	@Override
	public Product getProduct(String owner) {
		IDCard result = null;
		IDCard temp = null;
		for(int i=0 , j=owners.size() ; i<j ; i++){
			temp = owners.get(i);
			if(temp.getOwner().equals(owner)){
				result = temp;
			}
		}
		if(result==null){
			System.out.println("Not in Factory");
		}
		return result;
	}
}
