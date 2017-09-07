package mediator;

import java.awt.Button;

@SuppressWarnings("serial")
public class ColleagueButton extends Button implements Colleague {
	protected Mediator mediator;
	public ColleagueButton(String caption){
		super(caption);
	}
	
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}
	
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
	}

}
