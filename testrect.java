import javax.swing.*;

public class testrect{
	public static void main(String[] args){
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rectangle p = new rectangle(); 
		f.add(p); 
		f.setSize(500,500); 
		f.setVisible(true); 
	}
}
