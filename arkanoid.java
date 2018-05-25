import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class arkanoid {
	public static void main (String a[]){
		JFrame window = new JFrame("Arkanoid"); 
		window.setSize(640,480); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setVisible(true); 
		Point p = new Point(20, 40);

		int x  = p.getX();
		int y  = p.getY();

		p.setLocation(10, 60);
		Point p = closeButton.getLocation();
		Dimension d = new Dimension(200, 20);
		closeButton.setsize(d);

		Dimension  d2  = closeButton.getSize(); 
int width  = d2.width;
int height = d2.height;
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);

		g.setColor(Color.BLUE); 
		g.fillRect(25, 25, 100, 30); 

		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 100, 30); //(x , y, width, height)

		g.setColor(Color.RED);
		g.drawString("this is some text", 25, 120);
	}
}