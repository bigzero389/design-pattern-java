package strategy;

import java.util.ArrayList;

public interface Strategy {
	
	public Hand nextHand(ArrayList<Result> history);

}
