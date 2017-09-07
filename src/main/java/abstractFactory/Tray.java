package abstractFactory;

import java.util.Vector;

public class Tray extends Item {
	
	protected Vector<Item> tray = new Vector<Item>();
	
	public void add(Item item){
		tray.add(item);
	}
	
	
	public Tray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return null;
	}

}
