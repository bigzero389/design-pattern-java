package mediator;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

@SuppressWarnings("serial")
public class ColleagueTextField extends TextField implements TextListener, Colleague {
	private Mediator mediator;
	
	public ColleagueTextField(String text, int columns) {
		// TODO Auto-generated constructor stub
		super(text, columns);
	}
	
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}
	
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
		setBackground(enabled ? Color.WHITE : Color.LIGHT_GRAY);
	}
	
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		this.mediator.colleagueChanged(this);
	}
	
	
}
