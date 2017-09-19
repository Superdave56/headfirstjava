import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleAnimation {
	JFrame frame; // needs to be declared in outer class to be visible by inner classes 
	JLabel label; // needs to be declared in outer class to be visible by inner classes 
	int x = 20;
	int y = 20;
	
	public static void main (String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame(); // create frame
		label = new JLabel("I'm a label"); // create label
		
		JButton colorButton = new JButton("Change circle"); // create button to change circle
		colorButton.addActionListener(new ColorListener()); // add action listener to button
		
		JButton labelButton = new JButton("Change label"); // create button to change label
		labelButton.addActionListener(new LabelListener()); // add action listener to label
		
		MyDrawPanel panel = new MyDrawPanel(); // create drawing panel
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make program quit on window close
		
		// add widgets to frame regions
		//frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		//frame.getContentPane().add(BorderLayout.WEST, label);
		//frame.getContentPane().add(BorderLayout.EAST, labelButton);
		
		// display it
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		for (int i = 0; i < 130; i++) {
			x++;
			y++;
			
			panel.repaint();
			
			try {
				Thread.sleep(50);
			} catch (Exception ex) {}
		}
	}
	
	class MyDrawPanel extends JPanel {
		public void paintComponent (Graphics g) {
			// create random color
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			Color randomColor = new Color(red, green, blue);
			
			// reset background color
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			
			// draw circle
			g.setColor(randomColor);
			g.fillOval(x,y,100,100);
		}
	}
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("That hurt!");
		}
	}
	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}
}