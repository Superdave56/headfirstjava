import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C implements ActionListener {
	JFrame frame;
	
	public static void main (String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame(); // create frame
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make program quit on window close
		
		MyDrawPanel panel = new MyDrawPanel(); // create drawing panel
		
		JButton button = new JButton("Change colors"); // create button
		
		button.addActionListener(this); // add listener to button
		
		// add widgets to frame regions
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		
		// display it
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
	
	class MyDrawPanel extends JPanel {
		public void paintComponent (Graphics g) {
			// create random color
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			Color randomColor = new Color(red, green, blue);

			// draw circle
			g.setColor(randomColor);
			g.fillOval(70,70,100,100);
		}
	}
}