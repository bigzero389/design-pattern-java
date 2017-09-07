package command;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class DrawCanvas extends Canvas implements Drawable {
	private Color color = Color.RED;
	private int radius = 6;
	private MacroCommand history;
	
	public DrawCanvas(int width, int height, MacroCommand history) {
		// TODO Auto-generated constructor stub
		setSize(width, height);
		setBackground(Color.WHITE);
		this.history = history;
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		history.execute();
	}
	
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius * 2 , radius * 2);
	}
}
