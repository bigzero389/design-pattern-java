package memento;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class Gamer {
	private int money;
	private Vector<String> fruits = new Vector<String>();
	private Random random = new Random();
	private static String[] fruitsName = {"apple", "grape", "orange", "jamong"};
	public Gamer(int money){
		this.money = money;
	}
	public int getMoney(){
		return this.money;
	}
	
	private String f = "";
	public void bet(){
		int dice = random.nextInt(6) + 1;
		if(dice == 1){
			this.money +=100;
			System.out.println("Money is increased");
		}else if(dice == 2){
			this.money /= 2;
			System.out.println("Money is got a half");
		}else if(dice == 6){
			f = getFruit();
			System.out.println("Received a fruit(" + f + ")");
			fruits.add(f);
		}else {
			System.out.println("Nothing is happend");
		}
	}
	
	public Memento createMemento(){
		Memento m = new Memento(money);
		Iterator<String> it = fruits.iterator();
		
		while(it.hasNext()){
			f = it.next();
			if(f.startsWith("delicious")){
				m.addFuits(f);
			}
		}
		return m;
	}
	
	public void restoreMemento(Memento memento){
		this.money = memento.money;
		this.fruits = memento.fruits;
	}
	
	public String toString(){
		return "[money = " + money + ", fruits = " + fruits + "]" ;
	}
	
	private String getFruit(){
		String prefix = "";
		if(random.nextBoolean()){
			prefix = "delicious ";
		}
		return prefix + fruitsName[random.nextInt(fruitsName.length)];
	}
	
	
	
	
	

}
