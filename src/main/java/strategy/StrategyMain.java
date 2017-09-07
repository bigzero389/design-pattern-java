package strategy;

import java.util.Random;

public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("È«±æµ¿", 3);
		Player player2 = new Player("±è°©µ¹", 3);
		
		player1.strategy = new ProbStrategy(new Random(3));
//		player2.strategy = new WinningStrategy(new Random(3));
		player2.strategy = new WinningStrategy(new Random(3));
		
		Hand player1Hand = null;
		Hand player2Hand = null;
		Result player1Result = null;
		Result player2Result = null;
		for(int i=0,j=20 ; i<j ; i++){
			player1Hand = player1.nextHand();
			player2Hand = player2.nextHand();
			
			player1Result = new Result();
			player1Result.myHand = player1Hand;
			player1Result.yourHand = player2Hand;
			player1.study(player1Result);
			
			player2Result = new Result();
			player2Result.myHand = player2Hand;
			player2Result.yourHand = player1Hand;
			player2.study(player2Result);
			
			
			System.out.println(player1Result.toString());			
//			System.out.println(player2Result.toString());
			
		}

	}

}
