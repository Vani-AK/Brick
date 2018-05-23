import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.util.Formatter;

public class ball extends JPanel{
	private static final int width = 640;
	private static final int height = 480; 

	private float radius = 10; 
	private float x = radius +50; 
	private float y = radius +20;
	private float speedx = 3;
	private float speedy = 2; 

	private static final int update = 30; 

	public void bouncing(){
		this.setPreferredSize(new Dimension(width, height)); 

		Thread gameThread = new Thread(){
			public void run (){
				while(true){
					x += speedx;
					y += speedy;
					if(x - radius < 0){
						speedx = -speedx;
						x = width - radius; 
					} else if (x + radius > width){
						speedx = -speedx; 
						x = width - radius; 
					}
					if(y - radius < 0){
						speedy = -speedy;
						y = radius; 
					} else if(y + radius > height){
						speedy = -speedy; 
						y = height - radius; 
					}
					repaint();
					try{
						Thread.sleep(1000/update);
					}catch(InterruptedException ex) {}
				}
			}
		};
		gameThread.start(); 
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);

		 g.setColor(Color.BLUE);
     	 g.fillOval((int) (x - radius), (int) (y - radius),
            (int)(2 * radius), (int)(2 * radius));
	}
	 public static void main(String[] args) {
      // Run GUI in the Event Dispatcher Thread (EDT) instead of main thread.
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            // Set up main window (using Swing's Jframe)
            JFrame frame = new JFrame("A Bouncing Ball");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new ball());
            frame.pack();
            frame.setVisible(true);
         }
      });
   }
}