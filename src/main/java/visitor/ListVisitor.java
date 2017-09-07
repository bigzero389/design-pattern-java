package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String currentdir = "";
	
	@Override
	public void visit(Directory dir) {
		// TODO Auto-generated method stub
		System.out.println(currentdir + "/" + dir);
		String savedir = currentdir;
		currentdir = currentdir + "/" + dir.getName();
		Iterator<Entry> it = dir.iterator();
		
		Entry e = null;
		while(it.hasNext()){
			e = (Entry)it.next();
			e.accept(this);
		}
		currentdir = savedir;
	}
	
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println(currentdir + "/" + file);
	}
	

}
