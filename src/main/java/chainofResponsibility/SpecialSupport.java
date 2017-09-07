package chainofResponsibility;

public class SpecialSupport extends Support {
	
	private int num;
	
	public SpecialSupport(String name, int troubleNumber) {
		// TODO Auto-generated constructor stub
		super(name);
		this.num = troubleNumber;
	}
	
	@Override
	public boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		if(trouble.troubleNumber == this.num){
			result = true;
		}else{
			result = false;
		}
		return result;
	}

}
