package composite;


public class CompositeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		Directory dir = new Directory("TEST");
		Directory subdir = new Directory("SUBDIR1");
		Directory subdir2 = new Directory("SUBDIR2");
		
		for(int i=0,j=10 ; i<j ; i++){
			file = new File(String.valueOf(i)+"_file",i);
			if(i<5){
				dir.add(file);
			}else{
				subdir.add(file);
			}
		}
		dir.add(subdir);
		subdir.add(subdir2);
		
		dir.printList();
		
//		Iterator<Entry> it = dir.directory.iterator();
//		Entry e = null;
//		while(it.hasNext()){
//			e = it.next();
//			e.toString();
////			e.getSize();
//		}
	}

}
