import javax.sound.midi.*;

public class MiniMusicPlayer1 {
	public static void main (String[] args) {
		try {
			Sequencer sequencer = MidiSystem.getSequencer(); // get Sequencer
			sequencer.open(); // open Sequencer
			
			Sequence seq = new Sequence(Sequence.PPQ, 4); // get Sequence
			Track track = seq.createTrack(); // make a track
			
			for (int i = 5; i < 61; i += 4) {
				track.add(makeEvent(144,1,i,100,i)); // add noteOn (144) to track
				track.add(makeEvent(128,1,i,100,i+2)); // add noteOff (128) to track
			}
			
			// start it running
			sequencer.setSequence(seq); // give Sequence to Sequencer
			sequencer.setTempoInBPM(220); // set tempo
			sequencer.start(); // start the Sequencer
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // close main
	
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