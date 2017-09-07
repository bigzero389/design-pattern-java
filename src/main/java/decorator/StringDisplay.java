package decorator;

public class StringDisplay extends Display {
	private String str;
	
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return str.length();
	}
	
	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public String getRowsText(int row) {
		// TODO Auto-generated method stub
		return row==0 ? this.str : "";
	}
	
	public StringDisplay(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}
	
}
