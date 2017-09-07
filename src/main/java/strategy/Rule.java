package strategy;

public class Rule {
	
	public static final int ROCK = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;
	
	public static final String WIN = "WIN";
	public static final String EVEN = "EVEN";
	public static final String LOSE = "LOSE";
	public static final String ERROR = "ERROR";
	
	public static String Judge(int player1HandValue, int player2HandValue){
		String result = ERROR;
		if(player1HandValue == player2HandValue){
			result = EVEN;
		}else if(player1HandValue == ROCK && player2HandValue == SCISSORS ){
			result = WIN;
		}else if(player1HandValue == ROCK && player2HandValue == PAPER ){
			result = LOSE;
		}else if(player1HandValue == SCISSORS && player2HandValue == PAPER ){
			result = WIN;
		}else if(player1HandValue == SCISSORS && player2HandValue == ROCK ){
			result = LOSE;
		}else if(player1HandValue == PAPER && player2HandValue == ROCK ){
			result = WIN;
		}else if(player1HandValue == PAPER && player2HandValue == SCISSORS ){
			result = LOSE;
		}
		return result;
	}
	
	public static String getHandName(int handValue){
		String result = "";
		if(handValue == ROCK){
			result = "ROCK";
		}else if(handValue == SCISSORS){
			result = "SCISSORS";
		}else if(handValue == PAPER){
			result = "PAPER";
		}
		return result;
	}
}
