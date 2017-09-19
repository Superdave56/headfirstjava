import javax.swing.*;
import java.awt.*;

public class MyPanel {
	
	public void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		//frame.getContentPane().add(button);
		Paint paint = new Paint();
		frame.add(paint);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	class Paint extends JPanel {
		public void paintComponent(Graphics g) {
			//super.paintComponent(g);
			g.setColor(Color.orange);
			g.fillRect(20,50,50,50);
		
			g.setColor(Color.red);
			g.fillRect(200,50,50,50);
		
			g.setColor(Color.green);
			g.fillOval(30,150,200,50);
		}
	}
}



class MyPanelTest {
	public static void main (String[] args) {
		MyPanel panel = new MyPanel();
		Paint paint = new Paint();
		panel.go();
	}
}