package state;

public class StateFrame implements Context {
	
	private State state = DayState.getInstance();
	
	public void callSecurityCenter(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Calling : " + msg + "\n");
	}
	public void changeState(State state) {
		// TODO Auto-generated method stub
		System.out.println("Change current state:" + this.state + " to " + state);
		this.state = state;
	}
	public void recordLog(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Recording : " + msg + "\n");
	}
	public void setClock(int hour) {
		// TODO Auto-generated method stub
		this.state.doClock(this, hour);
	}

}
