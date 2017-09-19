import javax.sound.midi.*; // library for sequencer
import java.io.*;
import javax.swing.*; // library for gui
import java.awt.*; // library for graphics

public class MiniMusicPlayer3 {
	static JFrame f = new JFrame("My First Music Video"); // create new frame
	static MyDrawPanel ml; // declare draw panel variable
	
	public static void main (String[] args) {
		MiniMusicPlayer3 mini = new MiniMusicPlayer3();
		mini.go();
	} // close method

	public void setUpGui() {
		ml = new MyDrawPanel(); // instantiate draw panel object
		f.setContentPane(ml); // put draw panel in frame
		f.setBounds(30,30,300,300); // places and sizes the frame
		f.setVisible(true); // make it visible
	} // close method

	public void go() {
		setUpGui(); // set up gui
		
		try {
			Sequencer sequencer = MidiSystem.getSequencer(); // create sequencer
			sequencer.open(); // open sequencer
			
			int[] eventsIWant = {127}; // event to listen for
			sequencer.addControllerEventListener(ml, eventsIWant); // register MyDrawPanel as listener for this sequencer
			
			Sequence seq = new Sequence(Sequence.PPQ, 4); // create sequence
			Track track = seq.createTrack(); // create track for sequence
			
			int r = 0; // note.  set default note to 0
			for (int i = 0; i < 60; i += 4) {
			
				r = (int) ((Math.random() * 50) + 1); // pick random note
				
				track.add(makeEvent(144,1,r,100,i)); // add noteOn MidiEvent to track 
				track.add(makeEvent(176,1,127,0,i)); // add MidiEvent we're listening for to track
				track.add(makeEvent(128,1,r,100,i+2)); // add noteOff MidiEvent to track
			} // end loop
			
			sequencer.setSequence(seq); // add sequence to sequencer
			sequencer.setTempoInBPM(220); // set tempo
			sequencer.start(); // start sequencer
		} catch (Exception ex) {
			ex.printStackTrace(); // exception handler
		}
	} // close method
	
	// make MidiEvent method
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {}
		return event;
	} // close method
	
	class MyDrawPanel extends JPanel implements ControllerEventListener {
		boolean msg = false; // set default msg value to false
		
		// event handler for control-change event (127)
		public void controlChange(ShortMessage event) {
			msg = true; // will change to true when 127 event received
			repaint(); // repaint panel
		}
		
		public void paintComponent(Graphics g) {
			if (msg) {
				// create random color
				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);
				
				g.setColor(new Color(r,gr,b)); // set random color of paint component
				
				int ht = (int) ((Math.random() * 120) + 10); // set random height
				int width = (int) ((Math.random() * 120) + 10); // set random width
				
				int x = (int) ((Math.random() * 40) + 10); // set random x position
				int y = (int) ((Math.random() * 40) + 10); // set random y position
				
				g.fillRect(x,y,ht,width); // create rectangle
				msg = false; // set msg to false to be triggered by next listener event
			} // close if
		} // close method
	} // close inner class

} // close class