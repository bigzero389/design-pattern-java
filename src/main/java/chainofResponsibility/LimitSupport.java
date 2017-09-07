package chainofResponsibility;

public class LimitSupport extends Support{
	
	private int limit;
	
	public LimitSupport(String name, int limit) {
		// TODO Auto-generated constructor stub
		super(name);
		this.limit = limit;
	}
	
	@Override
	public boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		if(limit > trouble.troubleNumber){
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
