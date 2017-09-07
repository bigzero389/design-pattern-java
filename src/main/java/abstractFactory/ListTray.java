package abstractFactory;

import java.util.*;

public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n").append(caption + "\n").append("<ul>\n");
		
		Iterator<Item> it = tray.iterator();
		Item item = null;
		while(it.hasNext()){
			item = it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n").append("</li>\n");		
		
		return buffer.toString();
	}

}
