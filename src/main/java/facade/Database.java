package facade;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Database {
	
	private Database() {
		// TODO Auto-generated constructor stub
	}
	public static Properties getProperties(String dbName){
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String fileName = dbName + ".txt";
		String filePath = "facade";
		String fullPath = filePath + "/" + fileName;
		Properties prop = new Properties();
		try {
			File file = new File(loader.getResource(fullPath).getFile());
			prop.load(new FileInputStream(file));
			prop.list(System.out);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Warning " + fullPath + " is not found.");
		}
		return prop;
	}

}
