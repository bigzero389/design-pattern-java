package builder;

public class TextBuilder implements Builder {
	
	private StringBuffer buffer = new StringBuffer();
	String newLine = System.getProperty("line.separator");
	
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		buffer.append("=> " + title);
		buffer.append(newLine);
		
	}
	
	public void makeString(String str) {
		// TODO Auto-generated method stub
		buffer.append("* " + str);
		buffer.append(newLine);
	}
	
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		if(items != null && items.length != 0){
			for(int i=0 , j=items.length ; i<j ; i++){
				buffer.append(items[i]);
			}
			
		}
	}
	
	public Object getResult() {
		// TODO Auto-generated method stub
		return buffer.toString();
		
	}

}
