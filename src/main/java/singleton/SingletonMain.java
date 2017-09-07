package singleton;

import java.util.HashMap;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> singletonHm1 = Singleton.getInstance();
		HashMap<String,String> singletonHm2 = Singleton.getInstance();
		
//		HashMap<String,String> singletonHm1 = new HashMap<String,String>();
		singletonHm1.put("M1.1", "TEST");
//		HashMap<String,String> singletonHm2 = Singleton.getInstance();
		singletonHm2.put("M2.1", "TEST");
		
		System.out.println(singletonHm1.hashCode());
		System.out.println(singletonHm2.hashCode());
		
		if(singletonHm1 == singletonHm2){
			System.out.println("Object is equal");
		}else{
			System.out.println("Object is not equal");
		}

	}

}
