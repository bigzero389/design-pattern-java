package abstractFactory;

public class AbstractFactoryMain {
	
	public static void main(String[] args){
		if(args !=null && args.length !=1){
			System.out.println("Usage: java AbstractFactoryMain class.name.of.ConcreteFactory");
			System.out.println("Example: java AbstractFactoryMain listfactory.ListFactory");
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("Joongang", "http://www.joins.com/");
		Link hani = factory.createLink("Hani", "http://www.hani.co.kr/");
		
		Tray traynews = factory.createTray("Newspaper");
		traynews.add(joins);
		traynews.add(hani);
		
		Page page = factory.createPage("LinkPage", "bigzero");
		page.add(traynews);
		page.output();
		
	}

}
