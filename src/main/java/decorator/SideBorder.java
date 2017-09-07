package decorator;

public class SideBorder extends Border {
	
	public char borderchar;
	
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns() + 2;
	}
	
	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows();
	}
	
	@Override
	public String getRowsText(int row) {
		// TODO Auto-generated method stub
		return borderchar + display.getRowsText(row) + borderchar;
	}
	
	public SideBorder(Display display , char chr) {
		// TODO Auto-generated constructor stub
		super(display);
		this.borderchar = chr;
	}
	

}
