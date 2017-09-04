class Statick {
	static int x = 0;
	
	public Statick() {
		x++;
	}
}

class StatickTestDrive {
	public static void main (String[] args) {
		Statick one = new Statick();
		Statick two = new Statick();
				
		System.out.println(Statick.x);
	}
}