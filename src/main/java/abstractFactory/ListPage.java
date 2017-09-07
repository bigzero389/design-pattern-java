package abstractFactory;

import java.util.Iterator;

public class ListPage extends Page {
	public ListPage(String title, String caption) {
		super(title, caption);
		// TODO Auto-generated constructor stub
	}
	
	String newLine = System.getProperty("line.separator");
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>").append(this.title).append("</title></head>").append(newLine);
		buffer.append("<body>").append(newLine);
		buffer.append("<h1>").append(title).append("</h1>").append(newLine);
		buffer.append("<ul>").append(newLine);
		
		Iterator<Item> it = content.iterator();
		Item item = null;
		while(it.hasNext()){
			item = it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>").append(newLine);
		buffer.append("<hr><address>").append(author).append("</address></hr>");
		buffer.append("</body></html>").append(newLine);
				
		return buffer.toString();
	}
}
