package builder;

public class BuilderMain {

	public static void main(String[] args){
		Builder bd = new TextBuilder();
		Director dt = new Director(bd);
		dt.construct();
		
		bd = new HTMLBuilder();
		dt = new Director(bd);
		dt.construct();
	}
}
