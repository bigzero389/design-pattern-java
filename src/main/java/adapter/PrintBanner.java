package adapter;

public class PrintBanner extends Banner implements Print {
	Banner banner = new Banner();
	
	public void printWeak(String str){
		banner.showWithParen(str);
	}
	
	public void printStrong(String str){
		banner.showWithAster(str);
	}
}
