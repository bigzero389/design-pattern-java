package observer;

public class DigitObserver implements Observer {
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
		System.out.println("DigitObserver:" + generator.getNumber());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
