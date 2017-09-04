public class Sequence {	
	public Track createTrack() {
		Track firstTrack = new Track();
		return firstTrack;
	}
	
	static class Track {
		boolean hasContents = false;
		
		public void fillTrack() {
			System.out.println("Filling track");
			hasContents = true;
		}
		
		public static void hello() {
			System.out.println("Hello World");
		}
	}
}

class SequenceTestDrive {
	public static void main(String[] args) {
		// Sequence seq = new Sequence();
		// Track track = seq.createTrack();
		// System.out.println("Track filled? " + track.hasContents);
		// track.fillTrack();
		// System.out.println("Track filled? " + track.hasContents);
		
		Track.hello();
	}
}