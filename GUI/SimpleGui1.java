import javax.swing.*;
import java.awt.*;

public class SimpleGui1 {
	public static void main (String[] args) {
		SimpleGui1 gui = new SimpleGui1();
		gui.go();
	}
	
	public void go() {
		// create frame
		JFrame frame = new JFrame();
		
		// create paint component
		MyDrawPanel panel = new MyDrawPanel();
		
		// create button
		// JButton button = new JButton("Click me");
		
		// make program quit on window close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add widgets to frame
		// frame.getContentPane().add(button);
		frame.getContentPane().add(panel);
		
		// display it
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	class MyDrawPanel extends JPanel {
		public void paintComponent (Graphics g) {			
			Graphics2D g2d = (Graphics2D) g;
			
			// draw rectangle on entire frame
			g.fillRect(0,0,this.getWidth(),this.getHeight()); // fill whole panel with black (default color)
			
			// gradient paint color set
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			Color startColor = new Color(red, green, blue);
			
			red = (int) (Math.random() * 256);
			green = (int) (Math.random() * 256);
			blue = (int) (Math.random() * 256);
			Color endColor = new Color(red, green, blue);
			
			GradientPaint gradient = new GradientPaint(70,0,startColor, 170,0,endColor);
			g2d.setPaint(gradient);
			
			// draw oval from graphics2d type
			g2d.fillOval(70,70,100,100);
			
			// create random color
			/*
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			Color randomColor = new Color(red, green, blue);
			*/
			
			// create random position within frame
			int x = (int) (Math.random() * (this.getWidth() - 100));
			int y = (int) (Math.random() * (this.getHeight() - 100));
			
			// draw rectangle
			/*
			g.setColor(Color.orange);
			g.fillRect(20,50,100,100);
			*/
			
			// draw circle
			/*
			g.setColor(randomColor);
			g.fillOval(x,y,100,100);
			*/
			
			// draw image from file
			/*
			Image image = new ImageIcon("poro.png").getImage();
			g.drawImage(image,x,y,this);
			*/
			
			// draw 3d rectangle
			//g2d.fill3DRect(x, y, 50, 50, true);
			
		}
	}
}