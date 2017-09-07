package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder{

	private String fileName;
	private PrintWriter writer;
	
	public void makeTitle(String title) {
		fileName = title + ".html";
		
		try {
			writer = new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		
	}
	
	public void makeString(String str) {
		// TODO Auto-generated method stub
		writer.println("<p>" + str + "</p>");
	}
	
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		if(items != null && items.length != 0){
			writer.println("<ul>");
			for(int i=0 , j=items.length ; i<j ; i++){
				writer.println("<li>" + items[i] + "</li>");
			}
			writer.println("</ul>");
		}
	}
	
	public Object getResult() {
		// TODO Auto-generated method stub
		writer.println("</body></html>");
		writer.close();
		return fileName;
	}
}
