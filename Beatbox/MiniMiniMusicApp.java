import javax.sound.midi.*;

public class MiniMiniMusicApp {
	public static void main (String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	} // close main
	
	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer(); // get Sequencer
			player.open(); // open Sequencer
			
			Sequence seq = new Sequence(Sequence.PPQ, 4); // get Sequence
			
			Track track = seq.createTrack(); // ask Sequence for a Track
			
			// put MidiEvents into the Track
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			a.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			player.setSequence(seq); // give Sequence to Sequencer
			
			player.start(); // start the Sequencer
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // close play
} // close class