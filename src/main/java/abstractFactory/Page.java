package abstractFactory;

import java.io.IOException;
import java.io.*;
import java.util.Vector;

public abstract class Page {
	
	
	protected String title;
	
	protected String author;
	
	protected Vector<Item> content = new Vector<Item>(); 
	
	public Page(String title, String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
	}
	
	public void output(){
		String fileName = this.title + ".html";
		try {
			Writer writer = new FileWriter(fileName);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(fileName + " write complete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
	
	public void add(Item item){
		this.content.add(item);
	}
	
	public abstract String makeHTML();
	
}
