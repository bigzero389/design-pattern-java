package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	private int number;
	public int getNumber(){
		return number;
	}
	public void execute(){
		for(int i=0,j=20 ; i<j ; i++){
			number = random.nextInt(50);
			notifyObsevers();
		}
	}

}
