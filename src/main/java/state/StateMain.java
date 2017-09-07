package state;

import java.util.Random;

public class StateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(24);
		int hour = 0;
		StateFrame stateFrame = new StateFrame();
		
		for(int i=0,j=100 ; i<j ; i++){
			hour = random.nextInt();
			stateFrame.setClock(hour);
			if(hour%3 == 1){
				stateFrame.callSecurityCenter("Call Security Center");
				stateFrame.recordLog("Recording Call Log");
				
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
