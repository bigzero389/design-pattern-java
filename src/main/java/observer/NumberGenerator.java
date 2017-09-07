package observer;

import java.util.Vector;
import java.util.Iterator;

public abstract class NumberGenerator {
	private Vector<Observer> observers = new Vector<Observer>();
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyObsevers(){
		Iterator<Observer> it = observers.iterator();
		Observer o = null;
		while(it.hasNext()){
			o = it.next();
			o.update(this);
		}
	}
	
	public abstract int getNumber();
	public abstract void execute();

}
