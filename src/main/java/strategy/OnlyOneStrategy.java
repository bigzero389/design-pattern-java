package strategy;

import java.util.ArrayList;
import java.util.Random;

public class OnlyOneStrategy implements Strategy {
	
	private int myHandValue;
	
	public Hand nextHand(ArrayList<Result> history) {
		
		return new Hand(myHandValue);
	}
	
	public OnlyOneStrategy(Random random) {
		// TODO Auto-generated constructor stub
		this.myHandValue = random.nextInt(3);
	}

}
