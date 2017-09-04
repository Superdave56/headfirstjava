class AutomobileTestDrive {
	// Hybrid.java interface in same directory.
	
	public static void main (String args[]) {
		Automobile[] a = new Automobile[10];
		
		a[0] = new Sedan();
		a[1] = new Coupe();
		a[2] = new Pickup();
		a[3] = new SUV();
		a[4] = new Motorcycle();
		
		((Motorcycle)a[4]).ecoDrive();
		
		Hybrid h = new Sedan();
		((Hybrid) a[0]).ecoDrive();
	}
}

abstract class Automobile {
	String color;
	String style;
	int load;
	int hp;
	int doors;
	
	public String getstyle() {
		return style;
	}
	
	public void setcolor(String c) {
		color = c;
	}
	
	public String getcolor() {
		return color;
	}
	
	/*
	public void Turn(String dir) {
		if (dir.equals("right")) {
			System.out.println(style + " is turning right.");
		} else {
			System.out.println(style + " is turning left.");
		}
	}
	*/
	
	abstract void accel(int time);
	abstract void tow();
	abstract void honk();
}

class Motorcycle extends Automobile implements Hybrid {
	public Motorcycle() {
		super();
		style = "Motocycle";
	}
	
	public void ecoDrive() {
		System.out.println(style + "'s fuel efficiency now increased by 15%.");
	}
	
	public void accel(int time) {
		int speed = time * 30;
		System.out.println(style + "'s speed is " + speed + " mph.");
	}
	
	public void honk() {
		System.out.println("Meep meep.");
	}
	
	public void tow() {
		System.out.println("Attach sidecar.");
	}
}

abstract class Car extends Automobile {
	public void honk() {
		System.out.println("Beep beep.");
	}
	public void tow() {
		System.out.println("Tow with hitch.");
	}
}

abstract class Truck extends Automobile {
	public void honk() {
		System.out.println("AHOOGA");
	}
	public void tow() {
		System.out.println("tow with flatbed.");
	}
}

class Sedan extends Car implements Hybrid {
	public Sedan() {
		super();
		style = "Sedan";
	}
	
	public void accel(int time) {
		int speed = time * 15;
		System.out.println(style + "'s speed is " + speed + " mph.");
	}
	
	public void ecoDrive() {
		System.out.println(style + "'s fuel efficiency now increased by 15%.");
	}
}

class Coupe extends Car implements Hybrid{
	public Coupe() {
		super();
		style = "Coupe";
	}
	
	public void accel(int time) {
		int speed = time * 20;
		System.out.println(style + "'s speed is " + speed + " mph.");
	}
	public void ecoDrive() {
		System.out.println(style + "'s fuel efficiency now increased by 15%.");
	}
}

class Pickup extends Truck {
	public Pickup() {
		super();
		style = "Pickup";
	}
	
	public void accel(int time) {
		int speed = time * 5;
		System.out.println(style + "'s speed is " + speed + " mph.");
	}
}

class SUV extends Truck implements Hybrid {
	public SUV() {
		super();
		style = "SUV";
	}
	
	public void accel(int time) {
		int speed = time * 10;
		System.out.println(style + "'s speed is " + speed + " mph.");
	}
	public void ecoDrive() {
		System.out.println(style + "'s fuel efficiency now increased by 15%.");
	}
}