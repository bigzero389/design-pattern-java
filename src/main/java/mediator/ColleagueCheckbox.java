package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
	protected Mediator mediator;
	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
		// TODO Auto-generated constructor stub
		super(caption, group, state);
	}
	
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}
	
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setColleagueEnabled(enabled);
	}
	
	public void itemStateChanged(ItemEvent e) {
		// TODO item �� ����Ǹ� mediator ���� �Ѱܼ� 
		// setColeagueEnabled �� ���ؼ� ��������� ȣ��ó��
		mediator.colleagueChanged(this);
	}
}
