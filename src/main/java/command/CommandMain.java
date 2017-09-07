package command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CommandMain extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	
	public CommandMain(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);
		
		Box clearBtnBox = new Box(BoxLayout.X_AXIS);
		clearBtnBox.add(clearButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(clearBtnBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == clearButton){
			history.clear();
			canvas.repaint();
		}
		
	}
	
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}
	
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new CommandMain("Command Pattern Sample");
	}
	
}
