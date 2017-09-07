package chainofResponsibility;

public class OddSupport extends Support{
	
	public OddSupport(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		if((trouble.troubleNumber%2) == 1){
			result = true;
		}else{
			result = false;
		}
		return result;
	}

}
