package composite;

public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	public abstract void printList();
	
	public void add(Entry entry) throws Exception{
		throw new Exception("You have to implement class by overriding");
	}
	
	public String toString(){
		return this.getName() + " (" + getSize() + ")";
	}
}
