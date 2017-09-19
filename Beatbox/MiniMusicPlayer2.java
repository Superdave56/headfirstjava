import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {
	public static void main (String[] args) {
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}
		
	public void go() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer(); // get Sequencer
			sequencer.open(); // open Sequencer
			
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			
			Sequence seq = new Sequence(Sequence.PPQ, 4); // get Sequence
			Track track = seq.createTrack(); // make a track
			
			for (int i = 5; i < 61; i += 4) {
				track.add(makeEvent(144,1,i,100,i)); // add noteOn (144) to track
				
				track.add(makeEvent(176,1,127,0,i));
				
				track.add(makeEvent(128,1,i,100,i+2)); // add noteOff (128) to track
			}
			
			// start it running
			sequencer.setSequence(seq); // give Sequence to Sequencer
			sequencer.setTempoInBPM(220); // set tempo
			sequencer.start(); // start the Sequencer
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void controlChange(ShortMessage event) {
		System.out.println("la");
	}
	
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {}
		return event;
	}
} // close class