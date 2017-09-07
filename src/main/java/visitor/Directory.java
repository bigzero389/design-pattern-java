package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
	public String name;
	
	public ArrayList<Entry> directory = new ArrayList<Entry>();
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int result = 0;

		Iterator<Entry> it = directory.iterator();
		Entry e = null;
		while(it.hasNext()){
			e = it.next();
//			if(e instanceof File){
//				result = result + e.getSize();
//			}
			result += e.getSize();
		}
		return result;
	}
	
	@Override
	public void printList() {
		// TODO Auto-generated method stub
		System.out.println("Directory : "+name);
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()){
			it.next().printList();
		}
		
	}
	
	public void add(Entry entry) {
		// TODO Auto-generated method stub
		this.directory.add(entry);
	}
	
	public Directory(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Iterator<Entry> iterator(){
		return directory.iterator();
	}
	
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);		
	}
    
	
}
