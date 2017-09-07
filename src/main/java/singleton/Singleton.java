package singleton;

import java.util.HashMap;

public class Singleton {
	
	private static HashMap<String,String> hm = null; 
	
	static {
		hm = new HashMap<String,String>();
	}
	
	public static HashMap<String,String> getInstance(){
		return hm;
	}

}
