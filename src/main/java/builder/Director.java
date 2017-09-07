package builder;

public class Director {
	
	public Builder builder;
	
	public void construct(){
		if(builder != null){
			builder.makeTitle("BuilderPatternTitle");
			builder.makeString("I am making the java code by builder pattern!!");
			String[] items = {"a","b","c"};
			builder.makeItems(items);
			Object result = builder.getResult();
			System.out.println(result);
			
		}else{
			System.out.println("builder is null");
		}
	}
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}

}
