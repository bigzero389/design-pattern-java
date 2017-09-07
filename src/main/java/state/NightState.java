package state;

public class NightState implements State{
	private static NightState singleton = new NightState();
	private NightState() {
		// TODO Auto-generated constructor stub
	}
	
	public static State getInstance(){
		return singleton;
	}
	
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour >= 9 || hour < 7){
			context.changeState(DayState.getInstance());
		}
	}
	
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Alert:Keep in a safe in a Night");
	}
	
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Emergency Alarm(Night)");
	}
	
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("Record a call in a night");
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "[Night]";
	}

}
