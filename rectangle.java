import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class rectangle extends JPanel{
	public void paintComponent(Graphics g){

		super.paintComponent(g);
		this.setBackground(Color.WHITE);

		
		g.setColor(Color.BLUE); 
		g.fillRect(0, 0, 100, 30); 

		g.setColor(Color.YELLOW); 
		g.fillRect(0, 30, 100, 30); 

		g.setColor(Color.WHITE); 
		g.fillRect(0, 60, 100, 30); 

		g.setColor(Color.GREEN);
		g.fillRect(0,90,100,30); 


		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(100, 0, 100, 30);

		g.setColor(Color.RED);
		g.fillRect(100, 30, 100, 30);

		g.setColor(new Color(190,81,215));
		g.fillRect(100, 60, 100, 30); //(x , y, width, height)

		g.setColor(Color.GRAY);
		g.fillRect(100, 90, 100, 30);


		g.setColor(Color.GRAY);
		g.fillRect(200, 30, 100, 30);

		g.setColor(Color.PINK);
		g.fillRect(200, 60, 100, 30);

		g.setColor(Color.CYAN);
		g.fillRect(200, 90, 100, 30);

		g.setColor(Color.BLUE);
		g.fillRect(200, 0, 100, 30);


		g.setColor(Color.GREEN);
		g.fillRect(300, 0, 100, 30);

		g.setColor(Color.WHITE);
		g.fillRect(300, 30, 100, 30);

		g.setColor(Color.MAGENTA);
		g.fillRect(300, 90, 100, 30);

		g.setColor(Color.YELLOW);
		g.fillRect(300, 60, 100, 30);


		g.setColor(Color.DARK_GRAY);
		g.fillRect(400, 30, 100, 30);

		g.setColor(Color.ORANGE);
		g.fillRect(400, 0, 100, 30);

		g.setColor(Color.BLUE);
		g.fillRect(400, 60, 100, 30);

		g.setColor(Color.RED);
		g.fillRect(400, 90, 100, 30);
		


	}
}
