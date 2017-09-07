package state;

public class DayState implements State {
	private static DayState singleton = new DayState();
	private DayState() {
		// TODO Auto-generated constructor stub
	}
	
	public static State getInstance(){
		return singleton;
	}
	
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour < 9 || hour >= 7){
			context.changeState(NightState.getInstance());
		}
	}
	
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("Keep in a safe(Day)");
	}
	
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Emergency Alarm(Day)");
	}
	
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Call(Day)");
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "[Day]";
	}
}
