package composite;

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
//			�̷��� �ϸ� Directory �ؿ� sub Directory �� �ִ� ��� getSize �� �� �� ��� 
//			Thread ���� ����ǰ� ������
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
	
	@Override
	public void add(Entry entry) {
		// TODO Auto-generated method stub
		this.directory.add(entry);
	}
	
	public Directory(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
    
	
}
