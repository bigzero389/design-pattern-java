package composite;

public class File extends Entry {
	public String name;
	public int size;
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public void printList() {
		// TODO Auto-generated method stub
		System.out.println("File => NAME : " + name + " ,SIZE : " + size);
	}
	
	public File(String name, int size) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.size = size;
	}

}
