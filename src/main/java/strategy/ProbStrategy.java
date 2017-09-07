package strategy;

import java.util.ArrayList;
import java.util.Random;

public class ProbStrategy implements Strategy {
	
	private Random random;
	
	public ProbStrategy(Random random) {
		// TODO Auto-generated constructor stub
		this.random = random;
	}
	
	public Hand nextHand(ArrayList<Result> history){
		Hand nextHand = null;
		int rockWinCnt = 0;
		int scissorsWinCnt = 0;
		int paperWinCnt = 0;
		
		Result tempResult = null;

		if(history!=null && history.size()!=0){
			
			for(int i=0,j=history.size() ; i<j ; i++){
				tempResult = history.get(i);
				if(tempResult.result().equals(Rule.WIN)){
					switch(tempResult.myHand.handValue){
						case Rule.ROCK : rockWinCnt++; break;
						case Rule.SCISSORS : scissorsWinCnt++; break;
						case Rule.PAPER : paperWinCnt++; break;					
					}
				}else if(tempResult.result().equals(Rule.LOSE)){
					switch(tempResult.yourHand.handValue){
						case Rule.ROCK : rockWinCnt++; break;
						case Rule.SCISSORS : scissorsWinCnt++; break;
						case Rule.PAPER : paperWinCnt++; break;					
					}
				}
			}
			nextHand = new Hand(nextHandValue(new int[]{rockWinCnt, scissorsWinCnt, paperWinCnt}));
		}else{
			//��ó���� history �� ������ �������� ��
			nextHand = new Hand(random.nextInt(3));
		}
		
		return nextHand;
	}
	
	private int nextHandValue(int[] resultCnt){
		int result = -1;
		if(resultCnt!=null && resultCnt.length >0){
			for(int i=0,j=resultCnt.length-1 ; i<j ; i++){
				if(resultCnt[i] < resultCnt[i+1]){
					result = i+1;
				}else if(resultCnt[i] > resultCnt[i+1]){
					result = i;
				}else{
					result = random.nextInt(3);
				}
			}
		}
		return result;
	}
}
