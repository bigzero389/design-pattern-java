package strategy;

import java.util.ArrayList;

public class Player {
	
	public Strategy strategy;

	public String name;
	
	private ArrayList<Result> history = new ArrayList<Result>(); 
	
	public Player(String name, int seed) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Hand nextHand(){
		return this.strategy.nextHand(history);
	}
	
	public void study(Result result){
		this.history.add(result);		
	}

}
