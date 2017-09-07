package flyweight;

import java.util.Hashtable;

public class BigCharFactory {
	private Hashtable<String,BigChar> pool = new Hashtable<String,BigChar>();
	private static BigCharFactory singleton = new BigCharFactory();
	private BigCharFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static BigCharFactory getInstance(){
		return singleton;
	}
	
	public synchronized BigChar getBigChar(char charName){
		BigChar bc = pool.get(String.valueOf(charName));
		if(bc == null){
			bc = new BigChar(charName);
			pool.put(String.valueOf(charName), bc);
		}
		return bc;
	}
}
