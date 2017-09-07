package test;

public class Parent {
	
	private String name = "Tom - father";
	
	public void text(){
		System.out.println("This is Parent");
	}
	
	protected void setName(String name){
		this.name = name;
	}
	
	protected String getName(){
		return name;
	}
}
