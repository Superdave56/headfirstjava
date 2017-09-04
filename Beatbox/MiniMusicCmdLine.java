import javax.sound.midi.*;

public class MiniMusicCmdLine {
	public static void main (String[] args) {
		MiniMusicCmdLine mini = new MiniMusicCmdLine();
		if(args.length < 2) {
			System.out.println("Don't forget the instrument and the note.");
		} else {
			int instrument = Integer.parseInt(args[0]);
			int note = Integer.parseInt(args[1]);
			mini.play(instrument, note);
		}
	} // close main
	
	public void play(int instrument, int note) {
		try {
			Sequencer player = MidiSystem.getSequencer(); // get Sequencer
			player.open(); // open Sequencer
			
			Sequence seq = new Sequence(Sequence.PPQ, 4); // get Sequence
			
			Track track = seq.createTrack(); // ask Sequence for a Track
			
			MidiEvent event = null;
			
			// put MidiEvents into the Track
			ShortMessage first = new ShortMessage();
			first.setMessage(192, 1, instrument, 0);
			MidiEvent changeInstrument = new MidiEvent(first, 1);
			track.add(changeInstrument);
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, note, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, note, 100);
			MidiEvent noteOff = new MidiEvent(b, 3);
			track.add(noteOff);
			
			player.setSequence(seq); // give Sequence to Sequencer
			
			player.start(); // start the Sequencer
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // close play
} // close class