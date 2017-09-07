package strategy;

import java.util.ArrayList;
import java.util.Random;

public class WinningStrategy implements Strategy {
	
	private Random random;
	
	public WinningStrategy(Random random) {
		// TODO Auto-generated constructor stub
		this.random = random;
	}
	
	public Hand nextHand(ArrayList<Result> history){
		Hand nextHand = null;

		if(history!=null && history.size()!=0){
			
			Result lastResult = history.get(history.size()-1);
			
			if(Rule.Judge(lastResult.myHand.handValue, lastResult.yourHand.handValue).equals(Rule.WIN)){
				nextHand = lastResult.myHand;
			}else if(Rule.Judge(lastResult.myHand.handValue, lastResult.yourHand.handValue).equals(Rule.EVEN)){
				nextHand = new Hand(random.nextInt(3));
			}else{
				nextHand = lastResult.yourHand;
			}
			
		}else{
			//맨처음에 history 가 없으면 랜던으로 생성
			nextHand = new Hand(random.nextInt(3));
		}
		
		return nextHand;
	}
}
