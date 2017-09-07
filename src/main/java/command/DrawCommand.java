package command;

import java.awt.Point;

public class DrawCommand implements Command {
	protected Drawable drawable;
	private Point position;
	
	public DrawCommand(Drawable drawable, Point position) {
		// TODO Auto-generated constructor stub
		this.drawable = drawable;
		this.position = position;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		drawable.draw(position.x,  position.y);
	}
}
