import java.awt.Graphics;
import java.awt.*;

public class Ball {
	private int radius; 
	private Game game_instance;
	private Dimension trajectory = new Dimension (0,0);
	private Point coordinate = new Point (0,0);
	
	private Point coord = new Point (0,0);
	
	public Ball(Game instance, int x, int y, int radius) {
		game_instance = instance; 
		coordinate = new Point (x,y);
		this.radius = radius;
	}
	
	public void set_trajectory (int x_movement, int y_movement) {
		trajectory = new Dimension(x_movement, y_movement);
	}
	
	public Point get_coord() {
		return coordinate;
	}
	
	public void center_ball(int x, int y) {
		coordinate = new Point (x,y);
	}
	
	public void movement () {
		if (coordinate.x-radius <=0 && trajectory.width<0) {
			trajectory.width = -trajectory.width;
		}
		if (coordinate.x-radius <=0 && trajectory.width<0) {
			trajectory.width = -trajectory.width;
		}
		if (coordinate.y-radius <=0 && trajectory.width<0) {
			trajectory.width = -trajectory.width;
		}
		if (coordinate.y-radius <=0 && trajectory.width<0) {
			trajectory.width = -trajectory.width;
		}
		coordinate.move(coordinate.x + trajectory.width, coordinate.y +trajectory.height);
	}
	
	
	public void paint(Graphics g){
		
		g.setColor(new Color(51,204,255));
		g.fillOval((int) (coordinate.x - radius), (int) (coordinate.y - radius),(int)(2 * radius), (int)(2 * radius));
	}

}
