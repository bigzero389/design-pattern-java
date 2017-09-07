package strategy;

public class Result {
	
	public Hand myHand = null;
	
	public Hand yourHand = null;
	
	public String result() {
		return Rule.Judge(myHand.handValue, yourHand.handValue);
	}
	
	public String toString(){
		return "Result : " + result() + ", myHand : " + Rule.getHandName(myHand.handValue) + ", youHand : " + Rule.getHandName(yourHand.handValue);
	}
}
