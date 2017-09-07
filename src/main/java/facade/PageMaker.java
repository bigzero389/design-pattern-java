package facade;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {

	public PageMaker() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void makeWelcomePage(String mailAddr, String fileName){
		try {
			Properties mailprop = Database.getProperties("maildata");
			String userName = mailprop.getProperty(mailAddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			writer.title("Welcome to " + userName + "'s Page!");
			writer.paragraph(userName + " 의 페이지에 오신걸 환경함");
			writer.paragraph("메일이 기다리고 있습니다.");
			writer.mailto(mailAddr, userName);
			writer.close();
			System.out.println(fileName + " is created for " + mailAddr + " (" + userName + " )");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
