package chainofResponsibility;

public class NoSupport extends Support {
	
	public NoSupport(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return false;		
	}
}
