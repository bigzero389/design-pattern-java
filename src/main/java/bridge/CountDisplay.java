package bridge;

public class CountDisplay extends Display {
	
	public void multiDisplay(int times){
		super.open();
		if(times > 1){
			for(int i=0,j=times ; i<j ; i++){
				super.print();
			}
		}
		super.close();		
	}
	
	public CountDisplay(DisplayImpl displayImpl) {
		// TODO Auto-generated constructor stub
		super(displayImpl);
	}
}
