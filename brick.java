import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JButton;

public class brick extends JFrame {
	public static JFrame frame; 
	public static game_boundaries boundaries ; 

	
	public static void main (String [] args){
	JFrame frame = new JFrame("Arkanoid");
	
	frame.setSize(900,700);
	frame.setLocationRelativeTo(null);
		
	boundaries = new game_boundaries();
	boundaries.setSize(frame.getSize());	
	frame.add(boundaries);
	frame.setVisible(true);

	
		
	}
}
