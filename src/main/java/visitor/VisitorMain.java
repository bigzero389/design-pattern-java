package visitor;

public class VisitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory subbindir = new Directory("subbin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");
		
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);
		bindir.add(subbindir);
		
		bindir.add(new File("vi", 10000));
		bindir.add(new File("latex",20000));
		subbindir.add(new File("subbinFile",10));
		
		rootdir.accept(new ListVisitor());
		
		System.out.println("");
	}

}
