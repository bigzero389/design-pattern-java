package memento;

import java.util.Vector;

public class Memento {
	int money;
	Vector<String> fruits;
	public int getMoney(){
		return money;
	}
	
	public Memento(int money) {
		// TODO Auto-generated constructor stub
		this.money = money;
		this.fruits = new Vector<String>();
	}
	
	void addFuits(String fruit){
		fruits.add(fruit);
	}

}
