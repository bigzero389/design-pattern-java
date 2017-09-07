package decorator;

public class FullBorder extends Border {
	
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns() + 2;
	}
	
	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows() + 2;
	}
	
	@Override
	public String getRowsText(int row) {
		// TODO Auto-generated method stub
		String result = "";
		if(row == 0){
			result = "+" + makeLine('-', display.getColumns()) + "+";
		}else if(row == display.getRows() +1){
			result = "+" + makeLine('-', display.getColumns()) + "+";
		}else{
			result = "|" + display.getRowsText(row-1) + "|";
		}
		
		return result;
	}
	
	public String makeLine(char chr, int cnt){
		StringBuffer buf = new StringBuffer();
		for(int i=0,j=cnt ; i<j ; i++){
			buf.append(chr);
		}
		return buf.toString();
		
	}
	
	public FullBorder(Display display) {
		// TODO Auto-generated constructor stub
		super(display);
	}

}
