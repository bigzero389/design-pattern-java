package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
	protected char charName;
	private String fontData;
	
	public BigChar(char charName) {
		// TODO Auto-generated constructor stub
		this.charName = charName;
		String filePath = "D:/SOURCES/DesignPattern/src/flyweight/";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath + "big" + charName + ".txt"));
			String line;
			StringBuffer buf = new StringBuffer();
			while((line = reader.readLine()) != null){
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontData = buf.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			this.fontData = charName + "?";
			e.printStackTrace();
		}
	}
	
	public void print(){
		System.out.print(fontData);
	}
}
